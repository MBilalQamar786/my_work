package project;
import java.util.Scanner;

public class Login implements Hospital_Managment_System{
    String us;
    String pw;
    public void login(){
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter user name => ");
            String userName = scanner.nextLine();
            System.out.print(" Enter password => ");
            String password = scanner.nextLine();

            if (us.equals(userName) || pw.equals(password)) {
                System.out.println(" User successfully logged-in.. ");
            } else {
                System.out.println(" In valid userName or password ");
            }
    }
    
    }



    


    

    

