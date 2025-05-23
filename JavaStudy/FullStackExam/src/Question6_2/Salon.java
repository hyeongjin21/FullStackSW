package Question6_2;

public class Salon extends Store{

	private double technology;
	private double kindness;
	
	public Salon(String name, String event, double price, double technology, double kindness) {
		super();
		this.technology = technology;
		this.kindness = kindness;
		this.name = name;
		this.event = event;
		this.price = price;
	}

	@Override
	public double grade() {
		double score = (technology + kindness + price) / 3;
		double result = Math.round(score * 100) / 100.0;
		return result;
	}
	
}
