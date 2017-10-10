package DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.*;

/**
 * Created by Khrystyna on 10/10/2017.
 */
public class JavaDequeue {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            //HashSet<Integer> set = new HashSet<>();

            int n = in.nextInt();
            int m = in.nextInt();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int input = in.nextInt();

                deque.add(input);
                //set.add(input);

                if (deque.size() == m) {
                  //  if (set.size() > max) max = set.size();
                    int first = deque.remove();
                    //if (!deque.contains(first)) set.remove(first);
                }
            }

            System.out.println(max);
        }
    }



