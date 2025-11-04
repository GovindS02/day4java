package day4;
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String Given_name = "admin";
        String Given_password = "java123";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Username:");
        String Name = input.nextLine();
        System.out.println("Password:");
        String password = input.nextLine();
        
        if((Given_name.equals(Name)) && (Given_password.equals(password) ) ){
        	
        	System.out.println("Login Successfull");
        }
        else {
        	System.out.println("Access Denied");
        }
         
        
	}

}
