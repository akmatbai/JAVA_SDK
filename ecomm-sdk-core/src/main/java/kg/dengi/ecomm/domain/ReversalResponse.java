package kg.dengi.ecomm.domain;

public final class ReversalResponse {
    public final String id;
    public final BankRaw raw;
    public ReversalResponse(String id, BankRaw raw){ this.id=id; this.raw=raw; }
}
