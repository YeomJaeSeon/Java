package chapter11.hashset;

import java.util.HashSet;
import java.util.Objects;

// HashSet - 순서 X, 중복 X -> 요소 추가할때 equals메서드와
// equals메서드와, , , , hashcode메서드를 호출.
// 오버라이딩이되어잇어야함
// set은 요소추가할때 equals(), hashCode()오버라이딩 안되어잇으면
// 중복 요소가 생겨버림.. equals는 iv비교 - 객체들은 iv만 다르므로 비교할게 이거밖예
// hashcode는 Objects.hash()를 통해서..오버라이딩 equals와 hashCode()메서드는 같이 오버라이딩하는게 정석이다.

// Set인터페이스 구현한 컬렉션ㅋ르래스 - HashSEt가장 대표적ㅇ린 컬렉션 클래스임
public class Test7 {
    public static void main(String[] args) {
        //
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Car(4, "red"));
        set.add(new Car(2, "white"));
        set.add(new Car(2, "white"));
        // Set인터페이스 특징- 순서 X중복X근데 중복이잇네.
        // Set은 add할때 equals메서드와 hashcode()로 중복 확인

        // 오버라이딩된게없으니 제대로 작동안하는것.
        System.out.println(set);
    }
}

class Car{
    int door;
    String color;

    public Car(int door, String color) {
        this.door = door;
        this.color = color;
    }

    @Override
    public String toString() {
        return door+":"+color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, color);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return this.color.equals(car.color) && this.door == car.door;
    }
}