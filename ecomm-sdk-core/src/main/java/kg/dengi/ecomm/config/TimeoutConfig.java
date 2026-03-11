package kg.dengi.ecomm.config;

import java.time.Duration;

public final class TimeoutConfig { public final Duration connectTimeout; public final Duration readTimeout; public TimeoutConfig(Duration connectTimeout, Duration readTimeout){this.connectTimeout=connectTimeout;this.readTimeout=readTimeout;} }
