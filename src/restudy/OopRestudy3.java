package restudy;

class Card3{
    static long width = 100L;
    static long height = 200L;
    String type;
    int number;

    int showNumber(){
       return number;
    }
    String showType(){
        return type;
    } // 인스턴스변수를 사요하므로 인스턴스메서드로.
    
    static long showWidth(){
        return width; // 클래스메서드는 클래스변수사용가능
    } // 한마디로 인스턴스 사용안햇으므로 static붙여서 클래스메서들조ㅓㅇ의
    static long showHeight(){
        return height;
    }
    static String selectOne(String thing){
        return thing;
    } // 인스턴스 변수나 메서드 사용안했으므로 static붙여서 클래스 메서드로정의
}

public class OopRestudy3 {
    public static void main(String[] args) {
        System.out.println(Card3.width + ", " + Card3.height);
        System.out.println(Card3.showWidth());
        System.out.println(Card3.showHeight());
        System.out.println(Card3.selectOne("나는 레드!?!"));
        //이렇게 인스턴스 생성과 관계없는 친구들은 클래스이름.으로접근 하는 클래스변수와 static메서드이다.

        Card3 c1 = new Card3(); //인스턴스생성 ㅋ 참조변수를 ㅌ오해서접근함 인스턴습ㄴ수나 이스턴스 메서드는
        c1.number = 10;
        c1.type = "SPADE";
        System.out.println(c1.number + ", " + c1.type); //이렇게 인스턴스 변수는 참조변수로 접근
        System.out.println(c1.showNumber());
        System.out.println(c1.showType());

        //요런인스턴스들은 인스턴스 생성한다음에 호출가능하고 참조변수로 접근가능함.


    }
}
