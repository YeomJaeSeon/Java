package chapter12.genericcasting;

import java.util.ArrayList;
import java.util.List;

class Pet{}
class Mouse extends Pet{}
class Turtle extends Pet{}
class Toy{}
public class Test4 {
    public static void main(String[] args) {
        PetShop<Pet> petPetShop = new PetShop<Pet>();
        PetShop<Mouse> mousePetShop = new PetShop<Mouse>();

        //하나의참조변수로 여러 제니릭 타입의 객체 참조가능 -  와일드카드
        PetShop<? extends Pet> wPetShop = new PetShop<Pet>();
        PetShop<? extends Pet> wPetShop2 = new PetShop<Mouse>();

//        PetShop<Toy> toyPetShop = new PetShop<Toy>();
        ToyShop<Toy> toyToyShop = new ToyShop<>();

        //지네릭 타입의 형변환

        //지네릭 타입과 원시타입(non -generic)
        Shop shop = null;
        Shop<String> stringShop =new Shop<>();
        shop = (Shop)stringShop;
        stringShop = (Shop<String>)shop;

        //지네릭타입간의 형변환
        Shop<String> stringShop1 = new Shop<>();
        Shop<Object> objectShop = new Shop<>();

//        Shop<Object> objectShop1 = (Shop<Object>)stringShop1;
        // Shop<String> stringShop1 = new Shop<Object>(); - 대입된 타입이 다르다.
        //지네릭 클래스의 타입변수에 대입된 타입이 다르므로 에러남

//        Shop<String> stringShop2 = (Shop<String>)objectShop; // Shop<object> -> Shop<String>
        // Shop<Object> objectShop = new Shop<String>();
        //지네릭 타입간의형변환은 대입된 타입이 다르기에 안된다.

        Shop<? extends Object> shop1 = (Shop<? extends Object>) new Shop<String>();

        Shop<String> stringShop2 = (Shop<String>)shop1;



    }
}

// 지네릭 클래스의 제한된 타입  - Pet타입, Pet자손타입만 타입변수에 대입가능
class PetShop <T extends Pet> extends Shop<T>{}
class ToyShop <T extends Toy> extends Shop<T>{}
class Shop<T>{
//    static T sequence = 0;
//    T[] arr = new T[10];
    // 지네릭의 제한 - static멤버에 타입변수사용불가, new다음 명시적타입와야함 - 타입변수사용불가
    List<T> list = new ArrayList<>();
    void add(T pet){
        list.add(pet);
    }
    T get(int idx){
        return list.get(idx);
    }
    public String toString(){
        return list.toString();
    }
}

