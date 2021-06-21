package second.chapter9.clone1;

import java.util.Arrays;

class Car implements Cloneable{
    String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Car deepCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        Car car = new Car(((Car)obj).name); //이런식으로 deepCopy..!
        return car;
    }

}

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr.clone();// copy
        System.out.println(arr.toString());
        System.out.println(arr2);
        // Object클래스의 toString메서드 호출

        Car[] carArr = new Car[]{new Car("페라리"), new Car("소나타"), new Car("소울"), new Car("코란도")};

        Car[] copyCarArr = carArr.clone();

        carArr[0].name = "페라리아닌데요 짝퉁임 ㅋㅋ";

        System.out.println(Arrays.toString(carArr));
        System.out.println(Arrays.toString(copyCarArr));



    }
}
