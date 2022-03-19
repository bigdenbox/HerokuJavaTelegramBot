/**
 * 
 */
package com.bigdenbox.herokuboxbot;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import org.jsoup.Jsoup;

/**
 * @author denis.korobkov
 *
 */
public class JsoupParsing {
	Document doc;
	Elements urls;
	String[] arrayUrls;

	public JsoupParsing(String url) throws IOException {

		doc = Jsoup.connect(url).userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").get();
		String title = doc.title();
		System.out.println("URL = " + url + " \n" + "Fetching...");
		System.out.println("Url's title = " + title);

		this.urls = doc.select("a.link.detailsLink");
	}

	public void parseUrlsFromUrl() {
		print("\nURLs: (%d)", urls.size());
		String stringUrl = "";
		arrayUrls = new String[urls.size()];
		int i = 0;
		for (Element url : urls) {
			stringUrl = url.attr("href");
			stringUrl = stringUrl.substring(0, stringUrl.indexOf("#"));
			arrayUrls[i++] = stringUrl;
	//		System.out.println("parseUrlsFromUrl = " + stringUrl);
		}

	}

	public void printArrayUrls() {
		if (arrayUrls.length > 0) {
			for (String s : arrayUrls) {
				System.out.println(s);
			}
		}
	}

	public String arrayUrlsToString() {
		String answer = "";
		if (arrayUrls.length > 0) {
			for (String s : arrayUrls) {
				answer = answer.concat(s);
				answer = answer.concat("\n");
			}
		}
		return answer;
	}

	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}

}
