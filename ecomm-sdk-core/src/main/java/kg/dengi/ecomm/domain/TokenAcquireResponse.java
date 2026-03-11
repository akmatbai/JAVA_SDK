package kg.dengi.ecomm.domain;

public final class TokenAcquireResponse {
    public final String token;
    public final BankRaw raw;
    public TokenAcquireResponse(String token, BankRaw raw){ this.token=token; this.raw=raw; }
}
