package ru.satvaldiev.middleservice.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "restclientmiddle")
public record RestClientProperties(String url) {
}
