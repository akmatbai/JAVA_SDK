package kg.dengi.ecomm.domain;

public final class H2HPaymentResponse {
    public final String id;
    public final BankRaw raw;
    public H2HPaymentResponse(String id, BankRaw raw){ this.id=id; this.raw=raw; }
}
