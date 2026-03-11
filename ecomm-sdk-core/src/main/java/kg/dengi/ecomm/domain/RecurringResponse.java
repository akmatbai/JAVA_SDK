package kg.dengi.ecomm.domain;

public final class RecurringResponse {
    public final String id;
    public final BankRaw raw;
    public RecurringResponse(String id, BankRaw raw){ this.id=id; this.raw=raw; }
}
