package second.chapter9.tostring1;

class Car{
    private String name;

    Car(){
        this("default");
    }
    Car(String name){
        this.name = name;
    }

    // 인스턴스의 name멤버변수를 출력함으로써 클래스의 유용한 정보를 출력하도록 Object클래스의 toSTring메서드를 오버라이딩 (overriding)함. - change
    @Override
    public String toString() {
        return "name : " + name;
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());
        // Object클래스의 메서드 toString()을 호출한것임.
        // 자식인스턴스를 생성하면 부모 멤버와 자신멤버를 함께 갖고있는 인스턴스를 생성한다.
        Car car2 = new Car("sonata");
        System.out.println(car2.toString());

        Car car3 = new Car("grandeur");
        System.out.println(car3);
        //toString호출됨.

        Member member =new Member();
        System.out.println("member = " + member);
        System.out.println("member.toString() = " + member.toString());
        // Object클래스의 toString()메서드를 호출하는 것임. 이걸 지금까지 몰랏네..그냥 주소를 호출하는줄알았네..
        // 당연한건데 이 리모컨 참조변수가 가지고있는 toString은 Object클래스의 것인데..


    }
}

class Member{
    int age;

}
