package kg.dengi.ecomm.domain;

public final class TokenPaymentResponse {
    public final String id;
    public final BankRaw raw;
    public TokenPaymentResponse(String id, BankRaw raw){ this.id=id; this.raw=raw; }
}
