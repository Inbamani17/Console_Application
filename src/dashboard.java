import java.util.*;
public class dashboard {
	void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n|--------------------------AVAILABLE OPTIONS-------------------------------|\n");
		System.out.println("  a. Doctors\n  b. Patients\n  c. Lab\n");
		System.out.println("\n|----------------------ENTER THE REQUIRED OPTION---------------------------|\n");
		String str = sc.nextLine();
		doctor dm = new doctor();
		patient pm = new patient();
		lab lm = new lab();
		switch(str) {
			case "a":
				dm.doctor();
				break;
			case "b":
				pm.patient();
				break;
			case "c":
				lm.lab();
				break;
		}
		
	}
}
