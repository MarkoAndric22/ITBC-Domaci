import java.util.Stack;

public class V1 {
//    "(()())"
public static boolean zagrade(String s) {
    Stack<Character>stack=new Stack<>();
    for (int i = 0; i <s.length() ; i++) {
        char ch= s.charAt(i);
        if (ch=='(') {
            stack.push(ch);
            System.out.println(stack);
        }
        else if (ch==')')
        {
            if (stack.empty());
            {
                return false;
            }

        }else if (stack.peek()=='(')
        {
            stack.pop();
            System.out.println(stack);
        }


        }
    return stack.empty();
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(zagrade(s));
    }
}

