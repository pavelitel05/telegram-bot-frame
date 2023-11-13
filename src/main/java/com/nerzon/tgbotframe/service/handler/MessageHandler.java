package com.nerzon.tgbotframe.service.handler;

import com.nerzon.tgbotframe.service.contract.AbstractHandler;
import com.nerzon.tgbotframe.telegram.Bot;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;

/**
 * @author nerzon
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MessageHandler extends AbstractHandler {
    @Override
    public BotApiMethod<?> answer(
            BotApiObject object,
            Bot bot
    ) {
        Message message = (Message) object;
        throw new UnsupportedOperationException();
    }
}
