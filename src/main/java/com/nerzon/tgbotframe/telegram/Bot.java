package com.nerzon.tgbotframe.telegram;

import com.nerzon.tgbotframe.configuration.TelegramProperties;
import com.nerzon.tgbotframe.service.UpdateDispatcher;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author nerzon
 */
@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Bot extends TelegramWebhookBot {
    TelegramProperties telegramProperties;
    UpdateDispatcher dispatcher;

    public Bot(
            TelegramProperties telegramProperties,
            UpdateDispatcher dispatcher
    ) {
        super(telegramProperties.getToken());
        this.telegramProperties = telegramProperties;
        this.dispatcher = dispatcher;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return dispatcher.distribute(update, this);
    }

    @Override
    public String getBotPath() {
        return telegramProperties.getUrl();
    }

    @Override
    public String getBotUsername() {
        return telegramProperties.getName();
    }
}
