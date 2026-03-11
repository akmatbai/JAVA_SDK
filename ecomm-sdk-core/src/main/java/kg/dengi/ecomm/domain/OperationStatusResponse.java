package kg.dengi.ecomm.domain;

public final class OperationStatusResponse {
    public final UnifiedStatus status;
    public final BankRaw raw;
    public OperationStatusResponse(UnifiedStatus status, BankRaw raw){ this.status=status; this.raw=raw; }
}
