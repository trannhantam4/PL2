import java.io.Serializable;
import java.util.Scanner;

public class PlantLibrary extends Plant implements Serializable {
	String id;

	public PlantLibrary() {
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("ID: " + id + "\n");
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if (id != null && id.length() == 8) {
			this.id = id;
			return true;
		} else {
			System.err.println("Try to insert ID again: ");
			return false;
		}
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner input = new Scanner(System.in);
		System.out.print("Insert ID: ");
		while (!setId(input.nextLine()))
			;
	}

}
