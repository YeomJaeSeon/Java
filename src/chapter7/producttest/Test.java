package chapter7.producttest;

// 매개변수 다형성 한번더

class Tv{
    int price = 100;
    int bonusPoint = (int)(price / 10.0);

}

class Computer{
    int price = 200;
    int bonusPoint = (int)(price / 10.0);

}
class Desk{
    int price = 300;
    int bonusPoint = (int)(price / 10.0);
}
class Customer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Tv t){
        money -= t.price;
        this.bonusPoint += t.bonusPoint;

        System.out.println("TV샀습니다.");
    }

    void buy(Computer c){
        money -= c.price;
        this.bonusPoint += c.bonusPoint;

        System.out.println("컴퓨터 사셨습니다.");
    }
    void buy(Desk d){
        money -= d.price;
        bonusPoint += d.bonusPoint;

        System.out.println("책상을 사셨습니다.");
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
