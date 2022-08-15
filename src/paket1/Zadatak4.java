package paket1;

import java.util.Stack;

public class Zadatak4 {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char zagrada : s.toCharArray()){
            if (zagrada == '(' || zagrada == '[' || zagrada == '{'){
                stack.push(zagrada);
            }
            else if (zagrada == ')' || zagrada == ']' || zagrada == '}'){
                if (stack.isEmpty())
                    return false;
                //pop
                char a = stack.pop();
                if ((zagrada == ')' && a != '(') || (zagrada == ']' && a != '[') || (zagrada == '}' && a != '{'))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "(()";
        System.out.println(isValid(s));
    }
}
