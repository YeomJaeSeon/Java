package second.chapter9.getclass1;

class Car{
    String color;
}
public class Test {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        System.out.println(carClass);
        Car car = new Car();
        Class<? extends Car> aClass = car.getClass();
        System.out.println(aClass);
        // Class객체를 받아오는 방법들
        // 클래스이름.class로 Car클래스의 클래스 객체를 받아옴
        // 혹은 참조변수 .getClass()로 Car클래스의 클래스 객체를 받아옴
        // getClass는 Object의 메서드임.
        // 클래스 객체란? 클래스의 모든정보를 담고있음
        // .class파일(자바 바이트 코드)가 JVM내의 클래스로더에 올라가면 클래스로더가 클래스 객체를 생성함
        // 클래스객체는 클래스당 한개만 가지고있다..

    }
}
