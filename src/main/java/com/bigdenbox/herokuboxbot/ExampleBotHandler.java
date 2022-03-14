package com.bigdenbox.herokuboxbot;

import com.annimon.tgbotsmodule.BotHandler;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.logging.BotLogger;

public class ExampleBotHandler extends BotHandler {

	@Override
	public String getBotUsername() {
		// return System.getenv("username"); // Heroku
		return "ExampleTelegramBoxBot"; // without heroku
	}

	@Override
	public String getBotToken() {
		// return System.getenv("token"); // Heroku
		return "5089646150:AAFgK7RlFlkhVASF9M_NiP2mhn9iRhr92JM"; // without heroku
	}

	@Override
	public BotApiMethod onUpdate(Update update) {
		if (!update.hasMessage()) {
			return null;
		}

		Message message = update.getMessage();
		if (!message.hasText()) {
			return null;
		}

		String text = message.getText();
		long chatId = message.getChatId();
//		String stringChatId = Long.toString(chatId);
		String textSendMessage = "chatId = " + chatId + "; text = " + text;

		SendMessage sm = new SendMessage(chatId, textSendMessage);
		System.out.println(textSendMessage);

		try {
			execute(sm); 
		} catch (TelegramApiException e) {
			BotLogger.error("SEND", e.toString());
		}
		return null;
	}
}
