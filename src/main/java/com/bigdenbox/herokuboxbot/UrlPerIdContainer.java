/**
 * 
 */
package com.bigdenbox.herokuboxbot;

import java.util.HashMap;

/**
 * @author denis.korobkov
 *
 */
public class UrlPerIdContainer {
	
	HashMap <String, UrlPerRegionConteiner> IdUrlHashMap = new HashMap<String, UrlPerRegionConteiner>();



	public UrlPerIdContainer() {
	}



	/**
	 * @param idUrlHashMap
	 */
	public UrlPerIdContainer(HashMap<String, UrlPerRegionConteiner> idUrlHashMap) {
		super();
		IdUrlHashMap = idUrlHashMap;
	}



	public HashMap<String, UrlPerRegionConteiner> getIdUrlHashMap() {
		return IdUrlHashMap;
	}



	public void setIdUrlHashMap(HashMap<String, UrlPerRegionConteiner> idUrlHashMap) {
		IdUrlHashMap = idUrlHashMap;
	}
	
	

}
