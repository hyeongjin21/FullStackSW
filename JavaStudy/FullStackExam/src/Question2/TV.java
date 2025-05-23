package Question2;

public class TV {
	private String name;
	private int year;
	private int inchi;

	public TV(String name, int year, int inchi) {
		super();
		this.name = name;
		this.year = year;
		this.inchi = inchi;
	}

	public void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + inchi + "인치 TV");
	}
}
