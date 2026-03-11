package kg.dengi.ecomm.domain;

public final class HealthCheckResult {
    public final boolean ok;
    public final String details;
    public HealthCheckResult(boolean ok, String details){ this.ok=ok; this.details=details; }
}
