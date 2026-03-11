package kg.dengi.ecomm.domain;

public final class RefundResponse {
    public final String id;
    public final BankRaw raw;
    public RefundResponse(String id, BankRaw raw){ this.id=id; this.raw=raw; }
}
