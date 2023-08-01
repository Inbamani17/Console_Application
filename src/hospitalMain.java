import java.util.*;
public class hospitalMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("|----------------------HOSPITAL MANAGEMENT SYSTEM--------------------------|");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("\n");
        System.out.println("Enter the LOGIN Details");
        System.out.println("");
        String adName = "";
        String adPass = "";
        System.out.println("Enter the username:");
        String name = sc.nextLine();
        System.out.println("Enter the password:");
        String pass = sc.nextLine();
        dashboard dash = new dashboard();
        if(adName.equals(name) && adPass.equals(pass)) {
        	dash.menu();
        }
        else {
        	System.out.println("Incorrect username or password");
        }
        
	}
}
