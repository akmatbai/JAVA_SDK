package kg.dengi.ecomm.config;

import java.util.Map;

public final class RoutingConfig { public final Map<String,String> flowToServiceId; public final Map<String,String> bankPreset; public final Map<String,String> sdkDefaults; public RoutingConfig(Map<String,String> flowToServiceId, Map<String,String> bankPreset, Map<String,String> sdkDefaults){this.flowToServiceId=flowToServiceId;this.bankPreset=bankPreset;this.sdkDefaults=sdkDefaults;} }
