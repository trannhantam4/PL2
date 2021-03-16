import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PlantTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<PlantLibrary> plantLibrary = new ArrayList<>();
		int choose;
		Scanner scan = new Scanner(System.in);
		do {
			menu();
			System.out.println("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				int n;
				System.out.println("How many plants you want to add?");
				n = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < n; i++) {
					PlantLibrary PLL = new PlantLibrary();
					PLL.inputInfo();
					plantLibrary.add(PLL);
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PlantLibrary.txt"));
					out.writeObject(PLL);
				}
				break;
			case 2:
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("PlantLibrary.txt"));
				PlantLibrary PLL = new PlantLibrary();
				for (PlantLibrary plant : plantLibrary) {
					plant.showInfo();
				}
				break;
			case 3:
				System.out.println("Enter ID you want to find:");
				String searchingID = scan.nextLine();
				int count =0;
				for (PlantLibrary plant : plantLibrary) {
					if(plant.getId().equalsIgnoreCase(searchingID)) {
						plant.showInfo();
						count++;
					}
				}
				if(count==0) {
					System.out.println("Can't find any plant with that ID. Please try again");
				}
				break;
			case 4:
				Collections.sort(plantLibrary, new Comparator<PlantLibrary>() {
					@Override
					public int compare(PlantLibrary s1, PlantLibrary s2) {
						int compare = s1.getName().compareTo(s2.getName());
						if(compare>=0) {
							return -1;
						}
						return 1;
					}
				});
				for (int i = 0; i < plantLibrary.size(); i++) {
					plantLibrary.get(i).showInfo();
				}
				break;
			case 5:
				System.out.println("Good Bye");
				break;
			default:
				System.err.println("Wrong input");
			}
		} while (choose != 7);
	}

	static void menu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Insert number of Plant you want to add in:");
		System.out.println("2. Show All Plants Info: ");
		System.out.println("3. Find Plant by ID: ");
		System.out.println("4. Show sorted Plants: ");
		System.out.println("5. Exit.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("");

	}
}
