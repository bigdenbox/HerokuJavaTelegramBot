/**
 * 
 */
package com.bigdenbox.herokuboxbot;

/**
 * @author denis.korobkov
 *
 */
public enum Region {
	
	VIN ("Винницкая область"),
	VOL ("Волынская область"),
	DNE ("Днепропетровская область"),
	DON ("Донецкая область"),
	ZHT ("Житомирская область"),
	ZAK ("Закарпатская область"),
	ZAP ("Запорожская область"),
	IVF ("Ивано-Франковская область"),
	KIE ("Киевская область"),
	KIR ("Кировоградская область"),
	KRI ("Крым (АРК)"),
	LUG ("Луганская область"),
	LVI ("Львовская область"),
	NIK ("Николаевская область"),
	ODE ("Одесская область"),
	POL ("Полтавская область"),
	ROV ("Ровенская область"),
	SUM ("Сумская область"),
	TER ("Тернопольская область"),
	KHA ("Харьковская область"),
	KHE ("Херсонская область"),
	KHM ("Хмельницкая область"),
	CHK ("Черкасская область"),
	CHR ("Черниговская область"),
	CHV ("Черновицкая область");
	
	   private String title;
	   public String outputUrl = "https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/dnp/";

	   private Region(String title) {
	       this.title = title;
	   }
	   
	   private Region(String title, String outputUrl) {
	       this.title = title;
	   }

	   public String getTitle() {
	       return title;
	   }
	   
	   public String getOutputUrl() {
		return outputUrl;
	   }
	   

	   public void setOutputUrl(String outputUrl) {
		   System.out.println("public void setOutputUrl(String outputUrl)");
	    	this.outputUrl = outputUrl;
       }

	@Override
	   public String toString() {
	       return "Regions{" +
	               "title='" + title + '\'' +
	               '}';
	   }
	   

}
