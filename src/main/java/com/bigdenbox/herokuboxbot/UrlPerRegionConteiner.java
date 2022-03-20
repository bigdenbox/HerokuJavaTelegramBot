/**
 * 
 */
package com.bigdenbox.herokuboxbot;

import java.util.HashMap;

/**
 * @author denis.korobkov
 *
 */
public class UrlPerRegionConteiner {
//	Region region;

	HashMap<Region, UrlPerUpToDateConteiner> regionUrlHashMap = new HashMap<Region, UrlPerUpToDateConteiner>();

	public UrlPerRegionConteiner() {

	}

	/**
	 * @param regionUrlHashMap
	 */
	public UrlPerRegionConteiner(HashMap<Region, UrlPerUpToDateConteiner> regionUrlHashMap) {
		super();
		this.regionUrlHashMap = regionUrlHashMap;
	}

	public HashMap<Region, UrlPerUpToDateConteiner> getRegionUrlHashMap() {
		return regionUrlHashMap;
	}

	public void setRegionUrlHashMap(HashMap<Region, UrlPerUpToDateConteiner> regionUrlHashMap) {
		this.regionUrlHashMap = regionUrlHashMap;
	}
	
	public void switchRegion(Region region) {
		switch (region) {
		case CHK:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case CHR:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case CHV:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case DNE:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/dnp/");
			break;
		case DON:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case IVF:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KHA:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KHE:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KHM:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KIE:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KIR:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KRI:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case LUG:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case LVI:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case NIK:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ODE:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case POL:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ROV:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case SUM:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case TER:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case VIN:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/vin/");
			break;
		case VOL: {
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/vol/");
		}
			break;
		case ZAK:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ZAP:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ZHT:
			region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		default:
			break;

		}
	}

}
