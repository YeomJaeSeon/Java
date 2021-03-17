package chapter6;

class Tv10{
    static String network; // 클래스 변수
    String color; // 인스턴스변수
    int price;  // 인스턴스변수

    //멤버변수중 static 키ㅜ어드가 붙으며 ㄴ클래습녀수
    //클래스변수는 클래스가 생성될때 생성됨
    //인스턴스변수는 인스턴스가 생성도리때 생성됨
    // 둘의 차이는 클래스변수는 모든 인스턴스들이 공유
    // 인스턴스변수는 인스턴스마다 다른 값유지
    // 그러므로 모든 인스턴스들이 같은 값을 가져야 할때는 클래스변수로(static키워드사용)
    // 인스턴스마다 다른값을 가져야할때는 인스턴스변수로(멤버변수인데 static사용X)

    // 중요한건 변수는 선언된 위치에 따라서 종류가 다르다는것.!


}

public class Variable {
    public static void main(String[] args) {
        Tv10 tv1 = new Tv10();
        Tv10 tv2 = new Tv10();

        Tv10.network = "하이바네트워크";

        // 클래스변수는 이렇게 클래스이름으로 접근. 참조변수로 접근해도되긴하네
        // 이러한 클래스변수는 클래스가 메모리위에올라갈때 생성되므로 거의프로그램 시자고가 끝 항상 존재하므로 전역변수의 성격을 띈다.

        tv1.color = "red";
        tv2.color = "blue";
        System.out.printf("tv1 네트워크 : %s, 색 : %s%n", tv1.network, tv1.color);
        System.out.printf("tv2네트워크 : %s 색 : %s%n", tv2.network, tv2.color);
    }
}
