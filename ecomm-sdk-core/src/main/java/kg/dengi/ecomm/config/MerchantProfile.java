package kg.dengi.ecomm.config;

public final class MerchantProfile {
    public final String baseUrl;
    public final String point;
    public final CertificateConfig certificateConfig;
    public final TimeoutConfig timeoutConfig;
    public final EndpointConfig endpointConfig;
    public final CallbackSecurityConfig callbackSecurityConfig;
    public final DiagnosticsConfig diagnosticsConfig;
    public final RetryConfig retryConfig;
    public final RoutingConfig routingConfig;

    public MerchantProfile(String baseUrl, String point, CertificateConfig certificateConfig, TimeoutConfig timeoutConfig, EndpointConfig endpointConfig, CallbackSecurityConfig callbackSecurityConfig, DiagnosticsConfig diagnosticsConfig, RetryConfig retryConfig, RoutingConfig routingConfig) {
        this.baseUrl = baseUrl; this.point = point; this.certificateConfig = certificateConfig; this.timeoutConfig = timeoutConfig; this.endpointConfig = endpointConfig; this.callbackSecurityConfig = callbackSecurityConfig; this.diagnosticsConfig = diagnosticsConfig; this.retryConfig = retryConfig; this.routingConfig = routingConfig;
    }
}
