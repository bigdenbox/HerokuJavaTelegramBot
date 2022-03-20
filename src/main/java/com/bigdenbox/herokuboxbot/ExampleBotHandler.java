package com.bigdenbox.herokuboxbot;

import com.annimon.tgbotsmodule.BotHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
		
		
		// HashMap with clients. Key is s ChatID
		HashMap<Long, Client> clients = new HashMap<Long, Client>();

//		String stringUrl = "https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/ivano-frankovsk/";

		if (!update.hasMessage()) {
			return null;
		}

		Message message = update.getMessage();
		if (!message.hasText()) {
			return null;
		}

		String text = message.getText();
		long chatId = message.getChatId();
		
		// add client
		if (!clients.containsKey(message.getChatId())){
			clients.put(message.getChatId(), new Client(message.getChatId()));
		}
		
		//switch region for this client
		clients.get(message.getChatId()).switchRegion(Region.VIN);   // HardCode

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
//			UrlPerUpToDateConteiner urlPerUpToDateConteiner = new UrlPerUpToDateConteiner();
	//		urlPerUpToDateConteiner.setNewOldUrlHashMap("New", null);
			
//			Region region = Region.VOL;
//			HashMap<Region, UrlPerUpToDateConteiner> hashMap = new HashMap<Region, UrlPerUpToDateConteiner>();
//			hashMap.put(region, urlPerUpToDateConteiner);
//			UrlPerRegionConteiner urlPerRegionConteiner = new UrlPerRegionConteiner();
//			urlPerRegionConteiner.setRegionUrlHashMap(regionUrlHashMap);
//			urlPerRegionConteiner.switchRegion(region);
			
	//		System.out.println("urlPerRegionConteiner.toString() = " + urlPerRegionConteiner.toString());
			
//			System.out.println("region.getOutputUrl() = " + region.getOutputUrl());
	//		System.out.println("region.getTitle() = " + region.getTitle());
		//	System.out.println("region.toString() = " + region.toString());

	//		JsoupParsing jsoupParsing = new JsoupParsing(region.getOutputUrl());


	//		String stringUpToDate[] = {"New", "Old", "Active" };
	//		HashMap<String, String[]> newOldUrlHashMap = new HashMap<String, String[]>();
	//		newOldUrlHashMap.put(stringUpToDate[0], jsoupParsing.arrayUrls);

			
			
	//		HashMap<region, V>
	//		UrlPerRegionConteiner perRegionConteiner = new UrlPerRegionConteiner();
			
			//UrlPerUpToDateConteiner("New", stringTemp);
			// HashMap<Region, UrlPerRegionConteiner> hashMap = new HashMap();

//			UrlPerRegionConteiner urlPerRegionConteiner = new UrlPerRegionConteiner();

//			System.out.println("stringUrl = " + region.outputUrl);
	//		String stringUrl = region.getOutputUrl();
	//		System.out.println("Titel = " + region.getTitle());
			
			// get Link to parse
			JsoupParsing jsoupParsing = new JsoupParsing(clients.get(message.getChatId()).region.getOutputUrl());
			jsoupParsing.parseUrlsFromUrl(); // Do arrayUrls

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

}
