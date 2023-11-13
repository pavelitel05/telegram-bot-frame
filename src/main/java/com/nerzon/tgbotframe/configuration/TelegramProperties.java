package com.nerzon.tgbotframe.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author nerzon
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "telegram-bot")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TelegramProperties {
    String token;
    String url;
    String name;
}
