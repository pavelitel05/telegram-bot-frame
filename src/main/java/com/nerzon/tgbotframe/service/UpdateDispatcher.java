package com.nerzon.tgbotframe.service;

import com.nerzon.tgbotframe.service.handler.CallbackHandler;
import com.nerzon.tgbotframe.service.handler.CommandHandler;
import com.nerzon.tgbotframe.service.handler.MessageHandler;
import com.nerzon.tgbotframe.telegram.Bot;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author nerzon
 */
@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UpdateDispatcher {
    MessageHandler messageHandler;
    CallbackHandler callbackHandler;
    CommandHandler commandHandler;
    public BotApiMethod<?> distribute(
            Update update,
            Bot bot
    ) {
        if (update.hasCallbackQuery()) {
            return callbackHandler.answer(update.getCallbackQuery(), bot);
        }
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                if (message.getText().charAt(0) == '/') {
                    return commandHandler.answer(message, bot);
                }
                return messageHandler.answer(message, bot);
            }
//            todo: processing other message types (photo;document;etc)
        }
        log.warn("Unsupported update type: " + update);
        return null;
    }
}
