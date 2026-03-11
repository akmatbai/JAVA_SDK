package kg.dengi.ecomm.domain;

public final class PaymentStatusResponse {
    public final UnifiedStatus status;
    public final BankRaw raw;
    public PaymentStatusResponse(UnifiedStatus status, BankRaw raw){ this.status=status; this.raw=raw; }
}
