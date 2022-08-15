package paket1;

import java.util.Scanner;
import java.util.Stack;

public class Zadatak2 {
    public static void main(String[] args) {
        //unesite neki string "Hello"
//da na steku imam "olleH"

        Stack<Character>stk=new Stack<Character>();
        System.out.println("Unesite string");
        String s="Hello";
        for (int i = s.length()-1; i >=0 ; i--) {
            stk.push(s.charAt(i));
        }
        System.out.println(stk);
    }
}
