import java.util.*;
public class patient {
	void patient() {
		Scanner sc = new Scanner(System.in);
		patient pc = new patient();
		ArrayList<String> pat = new ArrayList<String>();
		System.out.println("\n|-------------------------------PATIENT-------------------------------------|\n");
		pc.pmenu(pat);
	}
	void pmenu(ArrayList<String> pat) {
		Scanner sc = new Scanner(System.in);
		patient pc = new patient();
		dashboard dash = new dashboard();
		System.out.println("|--------------------------AVAILABLE OPTIONS-------------------------------|");
		System.out.println("  a. Add\n  b. Modify\n  c. Display\n  d. menu");
		System.out.println("\n|----------------------ENTER THE REQUIRED OPTION---------------------------|\n");
		String str = sc.nextLine();
		switch(str) {
		case "a":
			pAdd(pat);
			break;
		case "b":
			pMod(pat);
			break;
		case "c":
			pDisplay(pat);
			break;
		case "d":
			dash.menu();
			break;
		}
	}
	void pAdd(ArrayList<String> pat) {
		System.out.println("\n|-----------------------------ADDITION-------------------------------------|\n");
		Scanner sc = new Scanner(System.in);
		patient pc = new patient();
		while(true) {
			System.out.println("\nIs there addition to list:");
			String s = sc.nextLine();
			s = s.toLowerCase();
			if(s.equals("yes")) {
				System.out.println("Enter the patient name: ");
				String det = sc.nextLine();
				det += " - ";
				System.out.println("Enter the patient illness: ");
				det += sc.nextLine();
				det += " - ";
				System.out.println("Enter the consulting doctor name: ");
				det += sc.nextLine();
				pat.add(det);
			}
			else {
				pc.pmenu(pat);
				break;
			}
		}
	}
	void pMod(ArrayList<String> pat) {
		System.out.println("\n|---------------------------MODIFICATION---------------------------------|\n");
		Scanner sc = new Scanner(System.in);
		patient pc = new patient();
		while(true) {
			System.out.println("Is there modification to the list:");
			String s = sc.nextLine();
			s = s.toLowerCase();
			if(s.equals("yes")) {
				System.out.println("Enter the patient name: ");
				String det = sc.nextLine();
				for(int i = 0; i < pat.size(); i++) {
					String dis = pat.get(i);
					String arr[] = dis.split(" - ");
					if(det.equals(arr[0])) {
						pat.remove(i);
					}
				}
				
			}
			else {
				pc.pmenu(pat);
				break;
			}
		}
	}
	void pDisplay(ArrayList<String> pat) {
		int len = pat.size();
		int i;
		System.out.println("|----------------------------PATIENT DETAILS--------------------------------|");
		System.out.println("|NAME\t SPECIALITY\tAVAILABILITY|");
		patient pc = new patient();
		for(i = 0; i < len; i++) {
			String dis = pat.get(i);
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
		pc.pmenu(pat);
	}

}
