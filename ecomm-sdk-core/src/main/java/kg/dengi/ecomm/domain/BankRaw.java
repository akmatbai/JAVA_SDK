package kg.dengi.ecomm.domain;

import java.util.Collections;
import java.util.Map;

public final class BankRaw {
    public final String code;
    public final String message;
    public final String reference;
    public final Map<String, String> original;

    public BankRaw(String code, String message, String reference, Map<String, String> original) {
        this.code = code;
        this.message = message;
        this.reference = reference;
        this.original = Collections.unmodifiableMap(original);
    }
}
