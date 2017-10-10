package DataStructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Khrystyna on 10/10/2017.
 */
public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(stackBasedExpressionCheck(input));
        }
        sc.close();
    }

    public static boolean stackBasedExpressionCheck(String expression) {
        Stack<Character> stack = new Stack<Character>();
        int expressionLength = expression.length();
        for (int i = 0; i < expressionLength; i++) {
            char ex = expression.charAt(i);

            if(ex == '(' || ex == '[' || ex == '{'){
                stack.push(ex);
            }
            else if(ex == ')' || ex == ']' || ex == '}'){
                if(stack.isEmpty() == true){
                    return false;
                }
                if(ex == ')'){
                    if(stack.pop() != '(') return false;
                }
                if(ex == '}'){
                    if(stack.pop() != '{') return false;
                }
                if(ex == ']'){
                    if(stack.pop() != '[') return false;
                }
            }
        }

        return stack.isEmpty();
    }
}



