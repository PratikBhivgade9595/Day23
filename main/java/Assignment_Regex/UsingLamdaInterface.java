package Assignment_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingLamdaInterface {
    final String firstName = "^[A-Z][a-z]{2,6}+$";
    final String lastName = "^[A-Z][a-z]{2,8}+$";
    final String mobileNumber = "^[+91 91]+[8 9][0-9]{9}+$";
    final String email = "^[a-zA-z0-9]+[@]+[a-z]+[.]+[a-z]{2,3}+$";
    final String password = "^[a-zA-Z][a-zA-Z0-9]+[@ . * #]+$";


 /*  public static void main(String[] args) {
      Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+[@ . * #]+$");
      Matcher matcher = pattern.matcher("PraTik9423@");
      System.out.println(matcher.find());
   }*/

    UserLamdaInterface fN = (assign) -> assign.matches(firstName);
    UserLamdaInterface lN = (assign) -> assign.matches(lastName);
    UserLamdaInterface mN = (assign) -> assign.matches(mobileNumber);
    UserLamdaInterface eV = (assign) -> assign.matches(email);
    UserLamdaInterface pW = (assign) -> assign.matches(password);
}
