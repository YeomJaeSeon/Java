package chapter7.poleytest.poly1;

// 매개변수 에 다형성을 이용해보자. 다형성이란 부모타입으 ㅣ참조변수로 자식타입의 인스턴스 접근가능한거쥐?
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price / 10.0);
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
        return "Tv";
    }
}

class Buyer{
    int money;
    int bonusPoint;

    Buyer(int money, int bonusPoint){
        this.money= money;
        this.bonusPoint = bonusPoint;
    }

    void buy(Product p){
        if(this.money < p.price) {
            System.out.printf("돈부족해서 이거못사요. ㅡㅡ");
            return;
        }
        money -= p.price;
        this.bonusPoint += p.bonusPoint;
        System.out.printf(p + "를 구입함.");
    }
}
public class Test {
    public static void main(String[] args) {
        Buyer customer1 = new Buyer(1000, 50);
        customer1.buy(new Computer());
        customer1.buy(new Tv());

        System.out.println("잔액 : " + customer1.money);
        System.out.println("보너스 : " + customer1.bonusPoint);
    }
}
