package chapter9.tostring;

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

public class Ex1 {
    public static void main(String[] args) {

        Card c1 = new Card();
        Card c2 = new Card();
        System.out.println(c1.toString());
        System.out.println(c2.toString()); // Object의 toStrinㅎ사용함. 오버라이딩안함. 만약한다면?

    }
}
