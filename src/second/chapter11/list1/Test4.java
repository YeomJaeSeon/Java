package second.chapter11.list1;

import java.util.*;

class Car{
    private String name;
    private int door;

    public Car(){
        this("소나타", 4);
    }

    public Car(String name, int door) {
        this.name = name;
        this.door = door;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", door=" + door +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return ((Car)obj).getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

public class Test4 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("포르셰", 2);
        Car car2 = new Car("코란도", 4);
        Car car3 = new Car();

        System.out.println(car.equals(car3));
        System.out.println(car.equals(car1));

        Set<Car> carStore = new HashSet<>();
        carStore.add(car);
        carStore.add(car3);
        //중복 X
        System.out.println(carStore.size());

        Iterator<Car> iterator = carStore.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Car> carList = Arrays.asList(new Car("파이어", 10), new Car(), new Car("페라리", 2), new Car("소나타", 3));
        List<Car> canChangeCarList = new ArrayList<>(carList);

        Collections.sort(canChangeCarList, Comparator.comparingInt(Car::getDoor));
        System.out.println(canChangeCarList);
    }
}

