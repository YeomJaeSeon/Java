package restudy.reresre;

class Car{

}
class FireEngine extends Car{

}
class Ambulance extends Car{

}

public class Test2 {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        System.out.println(f instanceof Car);
        System.out.println(f instanceof FireEngine);
        Ambulance a = new Ambulance();
        System.out.println(a instanceof Car);
        System.out.println(a instanceof Object);

    }
}
