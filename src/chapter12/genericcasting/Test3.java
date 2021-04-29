package chapter12.genericcasting;

import chapter8.RE;

class Malboro{
    void company(){
        System.out.println("담배회사");
    }
    
}
class Red extends Malboro{
    void power(){
        System.out.println("많이 매움");
    }
}
class Gold extends Malboro{
    void power(){
        System.out.println("중간 매움");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Malboro malboro = new Gold();
//        Gold gold = (Gold) malboro; // Malboro리모컨에서 Gold리모컨으로 형변환
//        gold.power();
        ((Gold)malboro).power(); // Malboro리모컨에서 Gold리모컨으로 형변환

        Malboro malboro1 = (Malboro) new Red();
        ((Red)malboro1).power();

        Red red = new Red();
        Malboro malboro2 = (Malboro) red; // 위의 다형성이랑 비슷한의미이다.
        // Malboro malboro2 = new Red(); 이거다. 풀면 - 부모타이브이 참조변수로 자식타입의 인스턴스 참조 - 다형성

//        Malboro malboro3 = new Malboro();// 업슨 멤버에 접근하려하니 classCastExceptin
//        Red red1 = (Red) malboro;

        //없는 멤버에 접근하려하니 이러한 에러가 나온다..!!!

    }
}
