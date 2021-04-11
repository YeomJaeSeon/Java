package chapter9.tostring;

class Card2{
    String kind;
    int number;
    Card2(){
        this("SPADE", 1);
    }
    Card2(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
// Obhect의 tostring overriding
    @Override
    public String toString() {
        return "kind : " + kind + ", number : " + number; // 대부분 인스턴스의 정보를 문자열로표현하는데 인스턴스의정보는 iv이다.
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 20);

        System.out.println(c2.toString());
        System.out.println(c1.toString());
    }
}
