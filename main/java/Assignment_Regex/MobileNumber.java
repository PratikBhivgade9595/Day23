package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    String mobileN = "^[0-9]{10}$";

    public boolean mobile_number() {
        System.out.println("Enter User Mobile_Number");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(mobileN);
        Matcher matcher = pattern.matcher(input);

        if (pattern.matches(mobileN, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
        return matcher.find();
    }

    public String mobile_Number2(String mN) throws Exception {
        Pattern pattern = Pattern.compile(mobileN);
        try {
            if (pattern.matches(mobileN, mN)) {
                return "Happy";
            } else {
                return "Sad";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
