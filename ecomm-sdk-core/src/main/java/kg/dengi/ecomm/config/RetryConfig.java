package kg.dengi.ecomm.config;

public final class RetryConfig { public final int statusReadRetryCount; public final boolean mutationRetryEnabled; public RetryConfig(int statusReadRetryCount, boolean mutationRetryEnabled){this.statusReadRetryCount=statusReadRetryCount;this.mutationRetryEnabled=mutationRetryEnabled;} }
