package chapter6;

// 내 모든차가 람보르기니라는 설정에서 해보자.
class MyCar2{
    int price;
    String color;
    int speed;
    static String company = "람보르기니"; // 클래스변수 내모든 차는 람보르기니이므로.

    void showPrice(){
        System.out.println(price);
    }
    void changeColor(String color){
        this.color = color;
    }
    int speedUpAndShow(){
        return ++speed;
    }

    static String suhoCar(String carName){
        return carName + " 중고";
    }
    static String yusungCar(String carName){
        return carName + "R8";
    }
    static String minseonCar(String carName){
        return carName + "300";
    }
}

public class MyCarTestis {
    public static void main(String[] args) {
        System.out.println("민선이형 차 : " + MyCar2.minseonCar("페라리"));
        System.out.println("유성이의 차 : " + MyCar2.yusungCar("아우디"));
        System.out.println("수호의 차 : " + MyCar2.suhoCar("미니쿠페"));
        System.out.println("내 차고의 차들은 " + MyCar2.company + " 입니다. ^^");

        // 클래스 변수나 클래스 메서드에 접근하는 방버은 클래스이름.메서드 or 클래스이름.클래스변수이다.

        // 이렇게 ㅋ인스턴스 변수나 인스턴스 메서드를 사용하지않으면 static을 붙여서 클래스 메서드로 만든다.
        // 인스턴스를 이제생성해보자 이제야 인스턴스 변수나 인스턴스 메서드에 접근가능함.

        MyCar2 car1 = new MyCar2();
        car1.price = 500;
        car1.showPrice(); // 인스턴스 변수나 인스턴스 메서드는 인스턴스 생성해야 접근가능. 물론ㅇ ㅣ녓거들은 static메서드와 클래스변수완다르게 참조변수.으로 접근
        car1.color = "orange";
        System.out.println(car1.color +"가 내 차의 색이였어.. 그런데");

        car1.changeColor("red");
        System.out.println(car1.color + "로 바꿧어 ㅋ");

        System.out.println(car1.speedUpAndShow());
        System.out.println(car1.speedUpAndShow());
        System.out.println(car1.speedUpAndShow());
        System.out.println(car1.speedUpAndShow());
        // 이번시간엔 static을붙인 메서드와 인스턴스 메서드의 차이와 접근방법들을 해보앗다. 한번더하자 이씨. 이거헷갈리냐
    }
}
