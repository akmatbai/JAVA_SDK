package kg.dengi.ecomm.config;

import kg.dengi.ecomm.exception.ConfigurationException;

public final class EcommValidator {
    private EcommValidator() {}
    public static void validate(EcommClientConfig config) {
        if (config == null || config.profiles == null || config.profiles.isEmpty()) throw new ConfigurationException("profiles missing");
        config.profiles.forEach((k, v) -> {
            if (v.baseUrl == null || v.point == null || v.endpointConfig == null) throw new ConfigurationException("mandatory settings");
            if (v.certificateConfig == null || (v.certificateConfig.keyStore == null && v.certificateConfig.sslContext == null)) throw new ConfigurationException("certificate missing");
        });
    }
}
