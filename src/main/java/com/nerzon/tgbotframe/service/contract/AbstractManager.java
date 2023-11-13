package com.nerzon.tgbotframe.service.contract;

import com.nerzon.tgbotframe.telegram.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author nerzon
 */
public abstract class AbstractManager {
    public abstract BotApiMethod<?> mainMenu(Message message, Bot bot)
            throws TelegramApiException;
    public abstract BotApiMethod<?> mainMenu(CallbackQuery query, Bot bot)
            throws TelegramApiException;
}
