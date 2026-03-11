package kg.dengi.ecomm.config;

import java.util.Map;

public final class EcommClientConfig {
    public final Map<String, MerchantProfile> profiles;
    public EcommClientConfig(Map<String, MerchantProfile> profiles){ this.profiles = profiles; }
}
