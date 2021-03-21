package chapter6;

class Data10{
    int value;
    // default 생성자가 숨겨져있음
    //Data10(){} 이런식으로 default생성자 숨겨져있음
}
class Data20{
    int value;
    Data20(int x){ // 생성자 이렇게 void도없고 클래스이름으로시작
        value = x;
    }
    Data20(){
    } // 생성자도 overloading 가능
}
class Carz{
    String color;
    String gearType;
    int door;

    Carz(){

    }
    Carz(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
    //매개변수 있는 생성자
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data10 d1 = new Data10(); // default생성장로 매개변수안줘도됨
        Data20 d2 = new Data20(20); // 생성자 호출할때 매개변수 줘야함

        Carz c1 = new Carz(); //매개변수없는 생성자 호출한거임
        Carz c2 = new Carz("뻘건색", "3단기어", 6);
        // new연산자가 인스턴스 생성해서 heap에 넣는거고 Carz(~)는 생성자이다. 매개변슁ㅆ는 생성자 호출한것이다.
        //여기선 매개변수있는 생성자가 인스턴스 변수초기화역할으함.
        // 앤만하면 이렇게 인스턴스 생성하면서 생성자로 인스턴스변수 초기화하는게 직관적이고좋다.
        System.out.println(c2.color);

        
    }
}
