package chapter14.lambdacasting;

@FunctionalInterface
interface MyFunction{
    void myMethod();
}

class Car{}

public class Test {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        Object obj = (MyFunction)(() -> {});
        String str = ((Object)(MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        Car car = new Car();
        System.out.println(car);

//        System.out.println((Object)(() -> {}));
        System.out.println((MyFunction)(() -> {}));
    }
}
