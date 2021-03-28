package chapter7;

class TestClass{
    int x = 100;

    void printX(){
        System.out.println("test x : " + x);
    }
}

class ParentCar{
    int doorCount;
    String color;
    String gearType;
    int x = 1;
    ParentCar(){
        this(4, "white", "not auto");
    }

    ParentCar(int doorCount, String color, String gearType){
        // super()넣어져있는 상태임  super() -> Object() 치ㅗ상이ㅜ클래스의 생성자를 호출하는상태
        this.doorCount = doorCount;
        this.color = color;
        this.gearType = gearType;
    }

    String displayCar(){
        return "차 문개수 : " + doorCount + "색 : " + color + "gearType : " + gearType;
    }

    int getX(){
        return x;
    }

    void overRideTest(TestClass t){
        t.printX();
    }
}
class ChildSportsCar extends ParentCar{
    boolean isFullOption;
    String type;
    int x = 10;

    ChildSportsCar(int doorCount, String color, String gearType, boolean isFullOption, String type){
        super(doorCount, color, gearType);
        this.isFullOption = isFullOption;
        this.type = type;
    }
    ChildSportsCar(boolean isFullOption, String type){
        this.isFullOption = isFullOption; // 생성자 첫줄에 이거 this()나 super()로 생성자호출업승면 컴파일러가 자동으로 super()넣는다.
        this.type = type;
    }

    String displayCar(){ // 오바라이딩된상태임. 부모클래스의 displayCar를 sportcar자식클래스에맞게 변경수정됨. 선언부는 아애똑같은게
        // 오버로딩과읯이 오버로딩은 아애 새로운 메서드를 만드는 것이고 오버라이딩은 부모클래스의 메서드에 수정하는것이다.
        return super.displayCar() + "풀옵션임? : " + this.isFullOption + "스포츠카 차종 : " + this.type;
        // 부모클래스의 메서드에 접근할대도 이렇게 super참조변수를 이용함.
    }

    int getX(){
        return super.x; // 부모클래스의 인스턴습ㄴ수와 자식클래스의 인스턴스변수가같을떄 참조변수 super로 차이를 구분할수있다.
        // 이렇게 자식클래스가 인스턴스를 생성하면 부모클래스의 멤버도 사용할수있으므로 자식클래스의 멤버이므로 this.참조변수로 (자신의 인스턴스 주소 가르키는 참조변수)
        // 접근할수있지만 이렇게부모클래스의 멤버와 자식클래스의 멤버를 구분해야할땐 super.참조변수로 부모클래스의 멤버에 접근한다.
    }

    @Override
    void overRideTest(TestClass t) {
        super.overRideTest(t); // 부모 메서드 접근하는 super 참조변수로 부모메서드 overRidetest메서드에 접근한것입미다.
        System.out.println("오버라이딩한 메서드입니다.");
    }
}

public class SuperClassTest {
    public static void main(String[] args) {
        ChildSportsCar car1 = new ChildSportsCar(true, "페라리");
        System.out.println(car1.getX());
        System.out.println(car1.displayCar());

        ChildSportsCar car2 = new ChildSportsCar(2, "black", "auto", false, "람보르기니");
        System.out.println(car2.displayCar());

        car2.overRideTest(new TestClass());


    }
}
/*
중요한건 생성자는 자신의 클래스의 멤버부터 초기화하는게 아닌 부모클래스의 멤버부터 초기화한다.

ChildSportCar car2 = new ChildSportsCar(~~)
를 보면
매개변수 5개있는 생성자를 호출한다.
올라가면 해당 생성자의 super(~)를볼수있고 이건 부모클래스 Car클래스의 생성자부터 호출한다.(아직 SportCar 멤버 초기화안함)
Car클ㄹ스의 생성자(매개변수세개)에는 super()이게 숨겨져있다.(컴파일러가 자동추가)
그러면 Object()생성자, Object클ㄹ스의 생성자를 호추래헛 OBject멤버 초기화한다.

이제 수행되는순서는 OBject멤버초기화 -> Car멤버초기화 -> 그다음이제 SportsCar멤버초기화가된다.

이런식으로 멤버초기화 즉 생성자는 자신의 클래스의 멤버를 초기화전에 부모 클래스의 멤버초기화, 즉 부모 클래스의 생성자부터 호출한다.
그래서 super()가 생성자의 첫줄에 있어야하는 것이다.
이유는? 자식클래스는 부모 멤버를 가지고있는데 자식멤버에서 부모멤버를 사용할수도있으므로 사용하기 이전에 부모멤버를 모두 초기화해버리는것이다.
멤버의 초기화는 부모도 어김없지 자신의 생성자를통해 초기화한다.
 */