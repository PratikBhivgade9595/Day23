package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    String emailR = "^[a-z][a-z]{3}[0-9]{3}[@][a-z]{5}[.][a-z]{3}+$";

    public void email() {
        System.out.println("Enter User Email");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(emailR);
        //Matcher matcher = pattern.matcher(input);

        if (pattern.matches(emailR, input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

  /*  public boolean email1(String email) {
        Pattern pattern = Pattern.compile(emailR);
        Matcher matcher = pattern.matcher(email);
        if (pattern.matches(emailR, email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        return matcher.find();
    }*/

    public boolean email1(String email) {
        Pattern pattern = Pattern.compile(emailR);
        //Matcher matcher = pattern.matcher(email);
        try {
            if (pattern.matches(emailR, email)) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            return true;
        }
    }

    public String email2(String email) throws Exception {
        Pattern pattern = Pattern.compile(emailR);
        //Matcher matcher = pattern.matcher(email);
        try {
            if (pattern.matches(emailR, email)) {
                return "Happy";
            } else {
                return "Sad";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }

   /* public String email2(String email) throws Exception {
        Pattern pattern = Pattern.compile(emailR);
        //Matcher matcher = pattern.matcher(email);
        try {
            if (pattern.matches(emailR, email)) {
                return "Happy";
            } else {
                return "Sad";
            }
        } catch (NullPointerException e) {
            throw new Exception("Please Enter Proper Email");
        }
    }*/
}

