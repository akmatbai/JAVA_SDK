package kg.dengi.ecomm.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ecomm")
public class EcommProperties {
    private boolean callbackEndpointEnabled;
    public boolean isCallbackEndpointEnabled(){return callbackEndpointEnabled;}
    public void setCallbackEndpointEnabled(boolean v){this.callbackEndpointEnabled=v;}
}
