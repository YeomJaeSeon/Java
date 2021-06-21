package second.chapter9.clone1;

import chapter5.Array;

import java.util.Arrays;

class Human{
    int age;
    String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

}

class Singer implements Cloneable{
    Human human;
    String alias;

    public Singer(Human human, String alias){
        this.human = human;
        this.alias = alias;
    }

    public Singer shallowCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        Singer singer = (Singer) obj;
        return singer;
    }

    public Singer deepCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        Singer singer = (Singer) obj;
        singer.human = new Human(this.human.age, this.human.name);

        return singer;
    }

    @Override
    public String toString() {
        return String.format("name : %s, age : %d, alias : %s\n", human.name, human.age, this.alias);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Singer singer = new Singer(new Human(20, "김진야"), "rain");
        Singer copySinger = singer.deepCopy();

        copySinger.human.name = "박진수";

        System.out.println("singer = " + singer);
        System.out.println("copySinger = " + copySinger);

        // shallow copy
        Singer shallowCopySinger = singer.shallowCopy();
        singer.human.age++;

        System.out.println(shallowCopySinger);

        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr = arr.clone();

        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));
    }
}
/**
 * 여기서 말하는 deepcopy란 멤버가참조변수로 어떠한 인스턴스의 주소를 가질때,
 * 참조변수가가지는 주소도 새롭게 가지는 완전히 복제된 인스턴스를말한다.
 * 당연히 복제된 주소는 다르지만
 * 내부의 멤버중 참조변수의 주소도 아애 다른 완전히 깊게 복사된걸 deep copy라한다
 * - 헷갈렸음
 * int 기본형 배열은 그래서 .clone()하면 그냥 새로운주소를 갖게되지만
 * 객체배열은 .clone()하면 새로운주소를 갖지만 내부 각 원소들의 참조변수를 기존의 원본과 같은 주소를 갖게된다.
 */
