package chapter11.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {
    public static void main(String[] args) {
        Stack st = new Stack(); // Stack은 클래스가 정의되어있음
        Queue q = new LinkedList(); // Queue는 인터페이스로존재함.

        st.push(1);
        st.push(2);
        st.push("3");

        q.offer(1);
        q.offer(2);
        q.offer("3");

        System.out.println(st);
        System.out.println(q);

        System.out.println("stack");
        while(!st.empty())
            System.out.println(st.pop());
        System.out.println("queue");
        while(!q.isEmpty())
            System.out.println(q.poll());

        // stack은 STack클래스가 구현되어있고
        // Queue는 인터페이스임 그래서 Queue인터페이스를 구현한클래스를 통해서 객체를 생성해야함
        Queue q2 = new LinkedList();// 이렇게 해도되고
        LinkedList q3 = new LinkedList(); //이렇게해도된다.
        //그러나 아래처럼하면 다른 큐를 구현한 클래스를 사용하고싶을 때 구현체를 바꺼야할때, 안전하지않다.
        //여기서 안전이란? LinkedList 타입으로 참노변수를 하면 Queue가 없는 멤버를 사용했을수도있다.
        // 그러나 위처럼 코드를 다형성으로 짜면 Queue가 가지고있는 멤버 안에서만 사용했기에 큐를 이용하기위해 다른 큐인터페이스를 구혀낳ㄴ
        //클래스를 만들어도 안전하다..
        // Queue란 인터페이스인데 추상화이기도하지 ?공통의 부분을추출한. Queue인터페이스를 구현한 클래스들의 공통부분을 가지고있는
        // 추상화부분을 Queue인터페이스라고하닌까


    }
}
