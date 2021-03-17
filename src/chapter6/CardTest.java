package chapter6;

class Card{
    // 클래스변수와 인스턴스 변수로 나누어서 멤버변수 정의해보자.
    // 폭과 넓이는 모든 카드의 공통이므로 클래스 변수로
    // 무늬와 숫자는 카드마다 다르므로(인스턴스마다 다르므로) 인스턴스변수로하면될듯!
    //인스턴스변수는 인스턴스 생성될때마다 생성되고
    //클래스변수는 클래스 메모리위에 올라갈때 생성된다했찡? 클래스변수는 모든 인스턴스 공통, 인스턴스변수는 인스턴스마다 고유의값
    static int width = 100;
    static int height = 250; // 멤버변수도 선언하면서 초기화되는군. 아 ㅋㅋ 클래스변수는 굳이 인스턴스마다 값이 다를필요가없으니 이렇게 초기화까지하는구나.
    String kind;
    int number;
}


public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = %d%n" + Card.width);
        System.out.println("Card.height = %d%n" + Card.height); // +연산의 피연산자가 문자열이면 문자열로 변경되는거 알제!


        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 5;

        System.out.printf("c1의 종류 : %s이고 넘버 : %d%n 이고 width, height : [%d, %d]%n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2의 종류 : %s이고 넘버 : %d%n 이고 width, height : [%d, %d]%n", c2.kind, c2.number, c2.width, c2.height);

        c1.width = 300;
        c1.height = 500;
        // 클래스변수인(static) width와 height는 c1객체를 통해 변경해도 c2의 wdith와 height도 변경이되는걸 볼수가있다.

        System.out.printf("c1의 종류 : %s이고 넘버 : %d%n 이고 width, height : [%d, %d]%n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2의 종류 : %s이고 넘버 : %d%n 이고 width, height : [%d, %d]%n", c2.kind, c2.number, c2.width, c2.height);



    }
}
