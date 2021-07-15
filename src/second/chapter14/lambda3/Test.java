package second.chapter14.lambda3;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Eatable{
    boolean eat(int count);
}

interface Fighteable{
    String findFighter(String name);
    int myLevel(String name);
}

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6, 10, -10, -5);
        System.out.println(list);
        Comparator<Integer> comparator = Comparator.naturalOrder(); // Comparator를 리턴함
        Collections.sort(list, comparator);
        // 인터페이스 메서드 하나를 힘들게 구현했음, 익명 객체만들어서 인터페이스의 추상메서드 구현함..
        System.out.println(list);

        System.out.println("==========================");
        Eatable eatable = new Eatable() {
            @Override
            public boolean eat(int count) {
                return count >= 3;
            }
        };
        System.out.println(eatable.eat(3));
        System.out.println(eatable.eat(2));

        Eatable eatable1 = a -> a >= 3; // 인터페이스의 추상메서드를 람다식으로 간단하게 구현가능
        System.out.println(eatable1.eat(3));
        System.out.println(eatable1.eat(2));
        // 람다식으로 추상메서드가 하나만존재하는 인터페이스를 쉽게 구현할수있따!!!!!!!

        List<String> strings = Arrays.asList("가나", "다라", "마바", "가가", "라라");
        Collections.sort(strings, String::compareTo); // Comparator는 인터페이스인데 추상메서드가 하나만 존재함..
        System.out.println(strings);

        Fighteable fighteable = new Fighteable() {
            @Override
            public String findFighter(String name) {
                return name;
            }

            @Override
            public int myLevel(String name) {
                return name.equals("김또깡") ? 10 : 5;
            }
        };
        String you = fighteable.findFighter("김또깡");
        System.out.println("you = " + you);

        System.out.println(fighteable.myLevel(you));

//        Fighteable fighteable1 =
        // 추상메서드가 두개이상이년석은 람다식으로 구현할수없다. 람다식은 인터페이스에 추상메서드가 하나만 존재햐야하고 추상메서드와 람다식의 선언부가 일치해야하는데
        // 인터페이스에 추상메서드를 뭘 사용할지 모르기떄문이다.

        //추상메서드가 하나인 인터페이스를 구현하는건 람다식으로 할수있다.
        //람다식으로 추상메서드가 하나인 인터페이스를 쉽게 구현할수있다. 익명객체를 만들면서 메서드를 구현할필요없이

        MyFunction myFunction = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return Math.max(a, b);
            }
        };
        System.out.println(myFunction.max(10, 100));

        MyFunction myFunction1 = Math::max; // 추상메서드가 하나인 인터페이스는 람다식(메서드참조)로 쉽게 구현가능
        System.out.println(myFunction1.max(10, 300));

    }
}

interface MyFunction{
    int max(int a, int b);
}
