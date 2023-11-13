package com.nerzon.tgbotframe.service.handler;

import com.nerzon.tgbotframe.service.contract.AbstractHandler;
import com.nerzon.tgbotframe.telegram.Bot;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

/**
 * @author nerzon
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CallbackHandler extends AbstractHandler {
    @Override
    public BotApiMethod<?> answer(
            BotApiObject object,
            Bot bot
    ) {
        CallbackQuery query = (CallbackQuery) object;
        throw new UnsupportedOperationException();
    }
}
