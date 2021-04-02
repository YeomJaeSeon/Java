package chapter7.point.second;

//다형성 두번째잠점(부모타입의 참조변수로 자식타입 인스턴스 접근
// 하나의 종류의 배열로 여러타입 객체 다룰수있음.

import java.util.Vector;

class Product {
    int price;
    int bonutPoint;

    Product(int price){
        this.price = price;
    }

}

class Computer extends Product {
    Computer(){
        super(100);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
class Tv extends Product {
    Tv(){
        super(200);
    }

    @Override
    public String toString() {
        return "TV";
    }
}
//class Desk extends Product {
//    Desk(){
//        super(150);
//    }
//
//    @Override
//    public String toString() {
//        return "Desk";
//    }
//}

class Customer{
    int money = 1000;
    int bonusPoint = 0;

    Vector cart = new Vector();
    int i = 0;


    void buy(Product p){
        if(money < p.price) return;
        money -= p.price;
        bonusPoint += p.bonutPoint;
        cart.add(p);

        System.out.println(p + "를 샀어요");
    }

    void summary(){
        for (Object o : cart) {
            if(o == null) return;
            if(o instanceof Product){
                Product p = (Product) o;
                System.out.println(p + ", ");
            }
        }
    }

}
public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.buy(new Computer());
        c.buy(new Tv());

        c.summary();

    }
}
