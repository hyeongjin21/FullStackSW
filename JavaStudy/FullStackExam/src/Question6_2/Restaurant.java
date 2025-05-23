package Question6_2;

import java.util.ArrayList;

public class Restaurant extends Store {

	private double service;
	private double flavor;
	private double clean;

	
	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		super();
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	public ArrayList<StoreController> storeAll(){
		
		ArrayList<StoreController> list = new ArrayList<StoreController>();
		StoreController stcl = null;
		
		
		
		return list;
	}
	
	@Override
	public double grade() {
		double score = (service + flavor + clean) / 3;
		double result = Math.round(score * 100) / 100.0;
		return result;
	}

}
