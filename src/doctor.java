import java.util.*;
public class doctor {
	void doctor() {		
		Scanner sc = new Scanner(System.in);
		doctor dc = new doctor();
		ArrayList<String> doc = new ArrayList<String>();
		System.out.println("\n|-------------------------------DOCTOR-------------------------------------|\n");
		dc.dmenu(doc);
	}
	void dmenu(ArrayList<String> doc) {
		Scanner sc = new Scanner(System.in);
		doctor dc = new doctor();
		dashboard dash = new dashboard();
		System.out.println("|--------------------------AVAILABLE OPTIONS-------------------------------|");
		System.out.println("  a. Add\n  b. Modify\n  c. Display\n  d. Menu");
		System.out.println("\n|----------------------ENTER THE REQUIRED OPTION---------------------------|\n");
		String str = sc.nextLine();
		switch(str) {
		case "a":
			dAdd(doc);
			break;
		case "b":
			dMod(doc);
			break;
		case "c":
			dDisplay(doc);
			break;
		case "d":
			dash.menu();
			break;
		}
	}
	void dAdd(ArrayList<String> doc) {
		System.out.println("\n|-----------------------------ADDITION-------------------------------------|\n");
		Scanner sc = new Scanner(System.in);
		doctor dc = new doctor();
		while(true) {
			System.out.println("\nIs there addition to list:");
			String s = sc.nextLine();
			s = s.toLowerCase();
			if(s.equals("yes")) {
				System.out.println("Enter the doctor name: ");
				String det = sc.nextLine();
				det += " - ";
				System.out.println("Enter the doctor Speciality: ");
				det += sc.nextLine();
				det += " - ";
				System.out.println("Enter the doctor availability: ");
				det += sc.nextLine();
				doc.add(det);
			}
			else {
				dc.dmenu(doc);
				break;
			}
		}
	}
	void dMod(ArrayList<String> doc) {
		System.out.println("\n|---------------------------MODIFICATION-----------------------------------|\n");
		Scanner sc = new Scanner(System.in);
		doctor dc = new doctor();
		while(true) {
			System.out.println("Is there modification to the list:");
			String s = sc.nextLine();
			s = s.toLowerCase();
			if(s.equals("yes")) {
				System.out.println("Enter the doctor name: ");
				String det = sc.nextLine();
				for(int i = 0; i < doc.size(); i++) {
					String dis = doc.get(i);
					String arr[] = dis.split(" - ");
					if(det.equals(arr[0])) {
						doc.remove(i);
					}
				}
				
			}
			else {
				dc.dmenu(doc);
				break;
			}
		}
	}
	void dDisplay(ArrayList<String> doc) {
		int len = doc.size();
		int i;
		System.out.println("|----------------------------DOCTOR DETAILS--------------------------------|");
		System.out.println("|NAME\t SPECIALITY\tAVAILABILITY|");
		for(i = 0; i < len; i++) {
			String dis = doc.get(i);
			String arr[] = dis.split(" - ");
			for(int j = 0; j < 3; j++) {
				if(j == 2) {
					System.out.print("\t");
				}
				else {
					System.out.print(" ");
				}
				System.out.print(arr[j] + "\t");
			}
			System.out.println();
		}
		doctor dc = new doctor();
		dc .dmenu(doc);
	}
}
