package introduction;
import java.util.*;
import java.text.*;

/**
 * Created by Khrystyna on 9/24/2017.
 */

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment).toString();
        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment).toString();
        String china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment).toString();
        String france =NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment).toString();
        // Write your code here.
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
