package day14_String;

import java.util.Scanner;

/*You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
*/
public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = input.next();
        System.out.println("Enter Password");
        String password = input.next();

        String correctUN = "Cydeo";
        String correctPW = "WoodenSpoon";

        boolean unCorrect = (username.equals(correctUN));
        boolean pwCorrect = (password.equals(correctPW));

        if(unCorrect  && pwCorrect){
            System.out.println("Logged In");
        }else{
            System.out.println("Incorrect username or password");
        }






        input.close();


    }
}
