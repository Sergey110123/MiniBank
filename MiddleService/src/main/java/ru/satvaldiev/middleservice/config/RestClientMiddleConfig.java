package ru.satvaldiev.middleservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import ru.satvaldiev.middleservice.config.properties.RestClientProperties;

@Configuration
public class RestClientMiddleConfig {
    private final RestClientProperties restClientProperties;

    public RestClientMiddleConfig(RestClientProperties restClientProperties) {
        this.restClientProperties = restClientProperties;
    }

    @Bean (name = "restclientmiddle")
    public RestClient restClient() {
        return RestClient.create(restClientProperties.url());
    }
}
