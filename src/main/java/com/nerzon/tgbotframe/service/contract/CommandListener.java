package com.nerzon.tgbotframe.service.contract;

import com.nerzon.tgbotframe.telegram.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author nerzon
 */
public interface CommandListener {
    BotApiMethod<?> answerCommand(Message message, Bot bot)
            throws TelegramApiException;
}
