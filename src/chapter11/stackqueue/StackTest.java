package chapter11.stackqueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack st = new Stack();

        String expression = "((2+3)*8+3)))";

        try{
            for(int i = 0; i < expression.length(); i++){
                if(expression.charAt(i) == '(')
                    st.push(expression.charAt(i));
                else if(expression.charAt(i) == ')')
                    st.pop();

            }
            if(st.empty())
                System.out.println("괄호가 일치합니다");
            else
                System.out.println("괄호가 일치하지 않습니다.");
        }catch (EmptyStackException es){
            System.out.println("괄호가 일치하지 않습니다.");
        }

    }
}
