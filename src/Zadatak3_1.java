import java.util.Stack;

public class Zadatak3_1 {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(' )
            {
                stack.push(c);
                System.out.println("push"+stack);
            }
            else if(c == ')' ) {
                if (stack.empty())
                {
                    return false;
                }
                else if (stack.peek() == '(') {
                    stack.pop();
                    System.out.println("pop"+stack);
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(isValid(s));
    }
}
