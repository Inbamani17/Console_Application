import java.util.*;
public class lab {
	void lab() {
		Scanner sc = new Scanner(System.in);
		lab lc = new lab();
		ArrayList<String> labo = new ArrayList<String>();
		System.out.println("\n|-------------------------------Laboratory---------------------------------|\n");
		lc.lmenu(labo);
	}
	void lmenu(ArrayList<String> labo) {
		Scanner sc = new Scanner(System.in);
		lab lc = new lab();
		dashboard dash = new dashboard();
		System.out.println("|--------------------------AVAILABLE OPTIONS-------------------------------|");
		System.out.println("  a. Add\n  b. Modify\n  c. Display\n  d. menu");
		System.out.println("\n|----------------------ENTER THE REQUIRED OPTION---------------------------|\n");
		String str = sc.nextLine();
		switch(str) {
		case "a":
			lAdd(labo);
			break;
		case "b":
			lMod(labo);
			break;
		case "c":
			lDisplay(labo);
			break;
		case "d":
			dash.menu();
			break;
		}
	}
	void lAdd(ArrayList<String> labo) {
		System.out.println("\n|-----------------------------ADDITION-------------------------------------|\n");
		Scanner sc = new Scanner(System.in);
		patient pc = new patient();
		while(true) {
			System.out.println("\nIs there addition to list:");
			String s = sc.nextLine();
			s = s.toLowerCase();
			if(s.equals("yes")) {
				System.out.println("Enter the Lab name: ");
				String det = sc.nextLine();
				det += " - ";
				System.out.println("Enter the Lab Incharge name: ");
				det += sc.nextLine();
				det += " - ";
				System.out.println("Enter the availability: ");
				det += sc.nextLine();
				labo.add(det);
			}
			else {
				pc.pmenu(labo);
				break;
			}
		}
	}
	void lMod(ArrayList<String> labo) {
		System.out.println("\n|---------------------------MODIFICATION-----------------------------------|\n");
		Scanner sc = new Scanner(System.in);
		patient pc = new patient();
		while(true) {
			System.out.println("Is there modification to the list:");
			String s = sc.nextLine();
			s = s.toLowerCase();
			if(s.equals("yes")) {
				System.out.println("Enter the patient name: ");
				String det = sc.nextLine();
				for(int i = 0; i < labo.size(); i++) {
					String dis = labo.get(i);
					String arr[] = dis.split(" - ");
					if(det.equals(arr[0])) {
						labo.remove(i);
					}
				}
				
			}
			else {
				pc.pmenu(labo);
				break;
			}
		}
	}
	void lDisplay(ArrayList<String> labo) {
		int len = labo.size();
		int i;
		System.out.println("|---------------------------Laboratory DETAILS------------------------------|");
		System.out.println("|NAME\t SPECIALITY\tAVAILABILITY|");
		lab lc = new lab();
		for(i = 0; i < len; i++) {
			String dis = labo.get(i);
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
		lc.lmenu(labo);
	}

}
