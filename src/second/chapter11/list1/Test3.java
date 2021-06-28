package second.chapter11.list1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Food{
    private String name;

    public Food(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object obj) {
        return ((Food)obj).name.equals(name);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Set<Food> set = new HashSet<>();

        Food food1 = new Food("라면");
        Food food2 = new Food("라면");
        Food food3 = new Food("햄버거");

        set.add(food1);
        set.add(food2);
        set.add(food3);

        Iterator<Food> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

//Object의 equals는 단순히 주소비교
// 오버라이딩해야한다 적절히. 객체중 같은 객체로 지정하고싶은 특징을 equals메서드 오버라이딩 바디에 적절히 넣어서 구현한다
// hashCode는 해쉬테이블의 위치를 지정한다.
// 같은 해쉬코드에 대해선 당연히 같은 위치에 접근한다.
// equals로 같은 객체로 인식햇으면 hashCode도 적절히 오버라이딩해서 해쉬 테이블 자료구조를 사용할때 같은 객체로 인식되도록한다.
