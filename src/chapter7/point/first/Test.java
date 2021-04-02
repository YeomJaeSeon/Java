package chapter7.point.first;

// 다형성 첫번째 장점 - 매개변수 다형성
class Product {
    int price;
    int bonutPoint;

    Product(int price){
        this.price = price;
    }

}

class Computer extends Product{
    Computer(){
        super(100);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
class Tv extends Product{
    Tv(){
        super(200);
    }

    @Override
    public String toString() {
        return "TV";
    }
}
class Desk extends Product{
    Desk(){
        super(150);
    }

    @Override
    public String toString() {
        return "Desk";
    }
}

class Customer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price) return;
        money -= p.price;
        bonusPoint += p.bonutPoint;

        System.out.println(p + "를 샀어요");
    }
}

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.buy(new Computer());
        c.buy(new Tv());
        c.buy(new Desk());


    }
}
