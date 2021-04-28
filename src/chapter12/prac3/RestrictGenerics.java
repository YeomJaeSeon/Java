package chapter12.prac3;

import java.util.ArrayList;
class Kid{}
class Adult{}
class Computer extends Adult{
    @Override
    public String toString() {
        return "Computer";
    }
}
class Toy extends Kid{
    @Override
    public String toString() {
        return "Toy";
    }
}
class QuickBoard extends Kid{
    @Override
    public String toString() {
        return "QuickBoard";
    }
}
class CampingTent extends Adult{
    @Override
    public String toString() {
        return "CampingTent";
    }
}

public class RestrictGenerics {
    public static void main(String[] args) {
        KidsProduct<Toy> campingTentKidsProduct = new KidsProduct<>();
        campingTentKidsProduct.add(new Toy());
//        campingTentKidsProduct.add(new Kid());
        KidsProduct<Kid> kidKidsProduct = new KidsProduct<>();
        kidKidsProduct.add(new Toy());
        kidKidsProduct.add(new QuickBoard());
        kidKidsProduct.add(new Toy());

        System.out.println(campingTentKidsProduct);
        System.out.println(kidKidsProduct);


    }
}
// 지네릭 클래스에 올수있는 타입을 제한할수있음 . Kid클래스나 해당 자식클래스의 타입이 타입변수에 대입될수있다.
class KidsProduct<T extends Kid> extends Product<T>{}
class Product<T>{
    ArrayList<T> list = new ArrayList<>();
//    static T count; -- static멤버에는 타입변수 지정할수없음. static은 인스턴스 공통이므로. 인스턴스마다 다른 타입을 지정하고싶은 지네릭과 상바됨.
    //
//    T[] array = new T[10]; -- new연산자 다음 타입확정되지않은 타입변수를 사용할수없음.
    // 이 두개가 지네릭스의 제한이다.
    //1. static에는 타입변수 사용불가
    //2. new연산자 다음에는 타입변수 사용불가

    void add(T item){
        list.add(item);
    }
    T get(int idx){
        return list.get(idx);
    }
    int size(){
        return list.size();
    }
    //add, get, size

    @Override
    public String toString() {
        return list.toString();
    }
}
