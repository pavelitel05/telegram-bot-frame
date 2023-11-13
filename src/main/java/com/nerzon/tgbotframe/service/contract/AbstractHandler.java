package com.nerzon.tgbotframe.service.contract;

import com.nerzon.tgbotframe.telegram.Bot;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;

/**
 * @author nerzon
 */
public abstract class AbstractHandler {
    public abstract BotApiMethod<?> answer(BotApiObject object, Bot bot);
}
