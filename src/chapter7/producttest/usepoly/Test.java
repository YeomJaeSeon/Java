package chapter7.producttest.usepoly;

// 매개변수 다형성이용

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}
class Tv extends Product{
    Tv(){
        super(100);
    }

    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    
    @Override
    public String toString() {
        return "Computer";
    }

}
class Desk extends Product{
    Desk(){
        super(300);
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
        money -= p.price;
        this.bonusPoint += p.bonusPoint;

        System.out.println(p + " 를샀습니다.");
    }

}

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.buy(new Tv());
        c.buy(new Computer());
        c.buy(new Desk());

        System.out.println("남은돈 : " + c.money);
        System.out.println("모인 보너스 : " + c.bonusPoint);
    }
}
