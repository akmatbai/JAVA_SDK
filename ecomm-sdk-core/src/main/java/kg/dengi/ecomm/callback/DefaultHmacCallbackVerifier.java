package kg.dengi.ecomm.callback;

import kg.dengi.ecomm.exception.CallbackVerificationException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

public final class DefaultHmacCallbackVerifier implements CallbackVerifier {
    private final String secret;
    private final HmacAlgorithm algorithm;
    private final CanonicalCallbackStringBuilder canonical;

    public DefaultHmacCallbackVerifier(String secret, HmacAlgorithm algorithm, CanonicalCallbackStringBuilder canonical) {
        this.secret = secret;
        this.algorithm = algorithm;
        this.canonical = canonical;
    }

    @Override
    public CallbackVerificationResult verify(Map<String, String> query) {
        try {
            String payload = canonical.build(query); // TODO canonical contract from bank docs
            Mac mac = Mac.getInstance(algorithm.jcaName);
            mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), algorithm.jcaName));
            String signed = Base64.getEncoder().encodeToString(mac.doFinal(payload.getBytes(StandardCharsets.UTF_8)));
            String signature = query.getOrDefault("signature", "");
            return new CallbackVerificationResult(signature.equals(signed), signature.equals(signed) ? "OK" : "BAD_SIGNATURE");
        } catch (Exception e) {
            throw new CallbackVerificationException("verify", e);
        }
    }
}
