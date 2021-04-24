package chapter11.hashset;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("1");
        set.add("3");

        System.out.println(set);

        ArrayList list = new ArrayList(set);
        Collections.sort(list);
        System.out.println(list);

        HashSet set1 = new HashSet();
        set1.add("abc");
        set1.add("abc");
        // set은 중복 X 순서 X, 요소 추가될때 hashcode메서드와 equals메서드로 비교를해야함 먼저. - 오버라이딩해야 요쇼를 적절히비교함
        set1.add(new Car2(3, "red"));
        set1.add(new Car2(3, "red"));

        System.out.println(set1);

    }
}

class Car2{
    int door;
    String color;

    public Car2(int door, String color) {
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
        if(!(obj instanceof Car2)) return false;
        Car2 c2 = (Car2) obj;
        return c2.color.equals(color) && c2.door == door;
    }
}