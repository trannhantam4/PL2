import java.util.Scanner;

public class Plant {
	String name;
	String type;
	String bloomColor;
	String bloomSeason;
	String light;

	public Plant() {

	}

	public Plant(String name, String type, String bloomColor, String bloomSeason, String light) {
		super();
		this.name = name;
		this.type = type;
		this.bloomColor = bloomColor;
		this.bloomSeason = bloomSeason;
		this.light = light;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBloomColor() {
		return bloomColor;
	}

	public void setBloomColor(String bloomColor) {
		this.bloomColor = bloomColor;
	}

	public String getBloomSeason() {
		return bloomSeason;
	}

	public void setBloomSeason(String bloomSeason) {
		this.bloomSeason = bloomSeason;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		name = input.nextLine();
		System.out.println("Type: ");
		type = input.nextLine();
		System.out.println("Bloom Color: ");
		bloomColor = input.nextLine();
		System.out.println("Bloom Season: ");
		bloomSeason = input.nextLine();
		System.out.println("Light requirement: ");
		light = input.nextLine();
	}

	public void showInfo() {
		System.out.println("Name: " + name + " Type: " + type + " Bloom Color: " + bloomColor + " Bloom Season: "
				+ bloomSeason + " Light Requirement: " + light);
	}
}
