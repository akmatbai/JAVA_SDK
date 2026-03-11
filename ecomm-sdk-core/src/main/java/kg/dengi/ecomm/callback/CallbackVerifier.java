package kg.dengi.ecomm.callback;

import java.util.Map;

public interface CallbackVerifier { CallbackVerificationResult verify(Map<String, String> query); }
