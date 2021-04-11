package chapter9;

class Card{
    String kind;
    int number;
    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        // Object로부터상속받은 메서드 오버라이딩안한경우임.
    }
}
