/**
 * 
 */
package com.bigdenbox.herokuboxbot;

import java.util.HashMap;

/**
 * @author denis.korobkov
 *
 */
public class UrlPerUpToDateConteiner {
	// <Date type, ArrayUrls>
	HashMap<String, String[]> newOldUrlHashMap = new HashMap<String, String[]>();
	// Dates
	String [] upToDateTypeString= new String [] {"New", "Old", "Active"};

//	public UrlPerUpToDateConteiner(String string, String[] stringTemp) {
//		this.upToDateUrls = stringTemp;
//				
//	}
	
	// if only arrayUrls. Write this arrayUrls to both New, Old, Active Keys
	public UrlPerUpToDateConteiner(String[] arrayUrls) {
		super();
		for(String s : upToDateTypeString) {
			newOldUrlHashMap.put(s, arrayUrls);
		}
	}
	
	//if new HashMap - return this HashMap Urls conteiner
	public UrlPerUpToDateConteiner(HashMap<String, String[]> newOldUrlHashMap) {
		super();		this.newOldUrlHashMap = newOldUrlHashMap;
	}

	public UrlPerUpToDateConteiner() {
		
	}

	public HashMap<String, String[]> getNewOldUrlHashMap() {
		return newOldUrlHashMap;
	}
	
	// if set String and String[] - replace String[] in this key
	public void setNewOldUrlHashMap(String upToDate, String[] arrayUrls) {
		newOldUrlHashMap.replace(upToDate, arrayUrls);
		;
	}

	public void setNewOldUrlHashMap(HashMap<String, String[]> newOldUrlHashMap) {
		
		this.newOldUrlHashMap = newOldUrlHashMap;
	}
	
	
	
	@SuppressWarnings("null")
	public String [] setStringArrayUrls (String [] inputArrayUrls) {
		String [] outPutArrayUrls = null;
		for(int i = 0; i < inputArrayUrls.length; i++) {
			outPutArrayUrls[i] = inputArrayUrls [i];
		}
		System.out.println("setStringArrayUrls DONE");
		return outPutArrayUrls;
	}
	
	

}
