package day4;
import java.util.Scanner;
public class LoginCRedentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Admin_Code = "A";
		String User_Code = "S";
		int Admin_pass = 1234;
		int student_pass =1111;
		int Admin_id = 1;
		int Student_id =2;
		int Guest_id = 3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("UserCode:");
		String uscd = input.nextLine();
		System.out.println("Password:");
		int pssw = input.nextInt();
		System.out.println("RoleId:");
		int id = input.nextInt();
		
		if((Admin_Code.equals(uscd)) && (pssw == Admin_pass) && (id == Admin_id)) {
			System.out.println("Welcome Admin. Full access granted.");
			
		}
		else if ((User_Code.equals(uscd) &&(student_pass == pssw) && (Student_id == id))){
			System.out.println( "Welcome Student. Limited access granted.");
		}
		else if(Guest_id == id) {
			System.out.println("Welcome Guest. View-only access.");
		}
		else {
			System.out.println("Invalid credentials or role.");	
			}
	
		
	}

}
