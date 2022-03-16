package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    String lastN = "^[A-Z][a-z]{3}+$";

    public boolean lastName() {
        System.out.println("Enter User Last Name");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(lastN);
        Matcher matcher = pattern.matcher(input);

        if (pattern.matches(lastN, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
        return matcher.find();
    }

    public boolean lastName1(String lastName) {
        Pattern pattern = Pattern.compile(lastN);

        try {
            if (pattern.matches(lastN, lastName)) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            return true;
        }
    }

    public String lastName2(String lastName) throws Exception {
        Pattern pattern = Pattern.compile(lastN);
        try {
            if (pattern.matches(lastN, lastName)) {
                return "Happy";
            } else {
                return "Sad";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}



