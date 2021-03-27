package chapter7;

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
        return super.displayCar() + "풀옵션임? : " + isFullOption + "스포츠카 차종 : " + type;
        // 부모클래스의 메서드에 접근할대도 이렇게 super참조변수를 이용함.
    }

    int getX(){
        return super.x; // 부모클래스의 인스턴습ㄴ수와 자식클래스의 인스턴스변수가같을떄 참조변수 super로 차이를 구분할수있다.
        // 이렇게 자식클래스가 인스턴스를 생성하면 부모클래스의 멤버도 사용할수있으므로 자식클래스의 멤버이므로 this.참조변수로 (자신의 인스턴스 주소 가르키는 참조변수)
        // 접근할수있지만 이렇게부모클래스의 멤버와 자식클래스의 멤버를 구분해야할땐 super.참조변수로 부모클래스의 멤버에 접근한다.
    }

}

public class SuperClassTest {
    public static void main(String[] args) {
        ChildSportsCar car1 = new ChildSportsCar(true, "페라리");
        System.out.println(car1.getX());
        System.out.println(car1.displayCar());

        ChildSportsCar car2 = new ChildSportsCar(2, "black", "auto", false, "람보르기니");
        System.out.println(car2.displayCar());
    }
}
