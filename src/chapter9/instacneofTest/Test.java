package chapter9.instacneofTest;

class Car{
    int door;
    String color;
}

class FireEngine extends Car{
    void water(){
        System.out.println("water");
    }
}
class Ambulance extends Car{
    void bbibbo(){
        System.out.println("Ambulance.bbibbo");
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car instanceof Car);
        System.out.println(car instanceof Ambulance);
        System.out.println(car instanceof Object);

        tester(car);
        tester(new FireEngine());
        tester(new Object());
        tester(new Ambulance());
    }

    static void tester(Object obj){
        if(obj instanceof Car)
            System.out.println(obj.getClass());
    }
}
