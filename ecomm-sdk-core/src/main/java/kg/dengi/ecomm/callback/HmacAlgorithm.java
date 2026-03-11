package kg.dengi.ecomm.callback;

public enum HmacAlgorithm { HMAC_SHA256("HmacSHA256"); public final String jcaName; HmacAlgorithm(String jcaName){this.jcaName=jcaName;} }
