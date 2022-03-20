/**
 * 
 */
package com.bigdenbox.herokuboxbot;

import java.util.HashMap;

/**
 * @author denis.korobkov
 *
 */
public class Client {
	// <Date, ArrayUrls>
//	HashMap<String, String[]> hmUpToDate = new HashMap<String, String[]>();

	// <Region, hmUpToDate>
//	HashMap<Region, Object> hmRegion = new HashMap<Region, Object>();

	// <Id, hmRegion>
//	HashMap<Long, Object> hmId = new HashMap<Long, Object>();
	
	Long id = null;
	Region region = Region.KHA;

	public Client() {

	}
	
	/**
	 * @param id
	 */
	public Client(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void switchRegion(Region reg) {
		switch (reg) {
		case CHK: {
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
		}
			break;
		case CHR:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case CHV:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case DNE:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/dnp/");
			break;
		case DON:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case IVF:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KHA:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KHE:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KHM:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KIE:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KIR:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case KRI:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case LUG:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case LVI:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case NIK:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ODE:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case POL:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ROV:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case SUM:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case TER:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case VIN:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/vin/");
			break;
		case VOL: {
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/vol/");
		}
			break;
		case ZAK:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ZAP:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		case ZHT:
			this.region.setOutputUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/chk/");
			break;
		default:
			break;

		}
	}

}
