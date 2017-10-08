package Strings;

import java.util.Scanner;

/**
 * Created by Khrystyna on 9/25/2017.
 */
public class JavaStringTokens {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            s=s.trim();
            String arr[]=s.split("[_\\@!?.', ]+");
            int x = arr.length;
            if(s.length()==0)
                System.out.println("0");
            else{
                System.out.println(x);
                for(String k:arr)
                    System.out.println(k);
            }



            scan.close();
        }


}
