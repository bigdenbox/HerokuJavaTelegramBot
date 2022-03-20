package com.bigdenbox.herokuboxbot;

import com.annimon.tgbotsmodule.BotHandler;

import java.io.IOException;

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
		String stringUrl = "https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/ivano-frankovsk/";
		String concatStringWithUrl = "";

		if (!update.hasMessage()) {
			return null;
		}

		Message message = update.getMessage();
		if (!message.hasText()) {
			return null;
		}

		String text = message.getText();
		long chatId = message.getChatId();
		
		// Send ChatId and text echo
		
		String textSendMessage = "chatId = " + chatId + "; text = " + text + "\n";
		SendMessage sm = new SendMessage(chatId, textSendMessage);
		try {
			execute(sm);
		} catch (TelegramApiException e) {
			BotLogger.error("SEND", e.toString());
		}
		System.out.println(textSendMessage);

		
		// Send URLs
		try {
			JsoupParsing jsoupParsing = new JsoupParsing(stringUrl);
			jsoupParsing.parseUrlsFromUrl();                              // Do arrayUrls
			
			for (String s : jsoupParsing.arrayUrls) {
				SendMessage sm1 = new SendMessage(chatId, s);
				try {
					execute(sm1);
				} catch (TelegramApiException e) {
					BotLogger.error("SEND", e.toString());
				}
				System.out.println(s);
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		return null;
	}

	/*
	 * public void printTextFromParsing(String stringUrl) throws IOException {
	 * JsoupParsing jsoupParsing = new JsoupParsing(stringUrl);
	 * jsoupParsing.parseUrlsFromUrl(); System.out.println("++++++++++++++++++++");
	 * for (int i = 0; i < jsoupParsing.arrayUrls.length; i++) {
	 * System.out.println(jsoupParsing.arrayUrls[i]); }
	 * System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	 * jsoupParsing.printArrayUrls();
	 * System.out.println("*******************************");
	 * System.out.println(jsoupParsing.arrayUrlsToString());
	 * 
	 * }
	 */
}
