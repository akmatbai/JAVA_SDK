package kg.dengi.ecomm.starter;

import kg.dengi.ecomm.api.EcommClient;
import kg.dengi.ecomm.config.EcommClientConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EcommProperties.class)
public class EcommAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public EcommClient ecommClient() {
        return EcommClient.create(new EcommClientConfig(java.util.Collections.emptyMap())); // TODO bind properties
    }
}
