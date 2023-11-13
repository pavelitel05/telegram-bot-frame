package com.nerzon.tgbotframe.service.contract;

import com.nerzon.tgbotframe.telegram.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author nerzon
 */
public interface CallbackListener {
    BotApiMethod<?> answerCallback(CallbackQuery query, Bot bot)
            throws TelegramApiException;
}
