package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Khrystyna on 9/25/2017.
 */
public class PatternSyntaxChecker {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String pattern = in.nextLine();
                try {
                    Pattern pat = Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch(PatternSyntaxException exception) {
                    System.out.println("Invalid");
                }
            }
        }
}
