package kg.dengi.ecomm.domain;

public interface AdvancedExecutionService {
    RawExecutionResponse executeRaw(RawExecutionRequest request);
    HealthCheckResult preflight();
}
