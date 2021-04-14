package chapter9.util;

import java.util.Random;

public class RandomEX1 {
    public static void main(String[] args) {
        // java.lang.Math클래스의 random메서드오 다른점은 종자값을 설정할수있따는것!
        // java.util.Random클래스는 종자값을 설정할수있다. 만약 두 rand객체가 종자값이 같다면 같은 난수를 출력한다.
        Random rand = new Random(1);
        Random rand2 = new Random(100);

        System.out.println("=random=");

        for(int i = 0; i < 5; i++){
            System.out.println(i + ":" + rand.nextInt());
        }
        System.out.println();
        System.out.println("=rand2=");
        for(int i = 0; i < 5; i++){
            System.out.println(i + ":" + rand2.nextInt());
        }
    }
}
