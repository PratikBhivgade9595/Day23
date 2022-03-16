package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
    String name = "^[A-Z][a-z]{3}+$";

    public void firstName() {
        System.out.println("Enter User Name");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(name);
        // Matcher matcher = pattern.matcher(input);

        if (pattern.matches(name, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
    }

    public boolean firstName1(String firstName) {
        Pattern pattern = Pattern.compile(name);

        try {
            if (pattern.matches(name, firstName)) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            return true;
        }
    }

    public String firstName2(String firstName) throws Exception {
        Pattern pattern = Pattern.compile(name);
        try {
            if (pattern.matches(name, firstName)) {
                return "Happy";
            } else {
                return "Sad";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
