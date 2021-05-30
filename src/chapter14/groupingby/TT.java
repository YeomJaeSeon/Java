package chapter14.groupingby;

class Car{
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class SportsCar extends Car{

}

public class TT {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        Car car = new Car();
        sportsCar.setColor("red");
        System.out.println(car.getColor());
        System.out.println(sportsCar.getColor());
    }
}
