package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Form");
        System.out.println();

        int n = 1;
        while (6 > n) {
            System.out.println("Registration Form : \n 1. First_Name \n 2. Last_Name \n 3. Email " +
                    "\n 4. Mobile_Number \n 5. Password \n 6. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    FirstName name = new FirstName();
                    name.firstName();
                    break;
                case 2:
                    LastName lastN = new LastName();
                    lastN.lastName();
                    break;
                case 3:
                    Email eM = new Email();
                    eM.email();
                    break;
                case 4:
                    MobileNumber mobileN = new MobileNumber();
                    mobileN.mobile_number();
                    break;
                case 5:
                    Password pW = new Password();
                    pW.password();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
            n++;
        }
    }
}
