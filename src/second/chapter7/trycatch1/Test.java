package second.chapter7.trycatch1;

import chapter14.sorted.Ex;

public class Test {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(4);
            System.out.println(0/0);
            System.out.println(5);
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println(6);
        }
        System.out.println(7);

        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
        test(new Car("람보르기니"));
        Car car = new Car("포르셰");
        test(car);
    }

    static void test(Car c){
        System.out.println(c);
    }
}

class Car{
    private String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}