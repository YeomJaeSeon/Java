package chapter7.poly2;
// 다형성을 이용한 부모타입의 참조변수 매개변수로 받기 + 객체배열(다형성을 이용해서 부모타입의 참초변수로 배열을 가르키는 배열을만들자.)

import chapter7.p1.Parent;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price / 10.0);
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
        super(150);
    }

    @Override
    public String toString() {
        return "Desk";
    }
}

class Buyer{
    int money;
    int bonusPoint;

    // 요런식으로 부모타입의 배열로 배열 값에는 자식타입의 인스턴스를 넣을수잇음
    Product[] item = new Product[10];
    int i = 0;

    Buyer(int money, int bonusPoint){
        this.money = money;
        this.bonusPoint = bonusPoint;
    }

    void buy(Product p){
        if(this.money < p.price){
            System.out.println("돈부족해요.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        // 부모타입의 참조변수로 자식타입의 인스턴스에 접근할수있다 이마리야~ - 다형성
        item[i++] = p;
        System.out.println(p + "를 구입하심."); // toString호출. 참조변수만 sout에하면 toSTring 메서드가 호출됨
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(Product value : this.item){
            if(value == null) break;
            sum += value.price;
            itemList += value + ", ";
        }
        System.out.println("-----구입한 리스트 ------");
        System.out.println("구입한 총금액 : " + sum);
        System.out.println("구입한 리스트 : " + itemList);
        System.out.println("잔액 : " + money);
        System.out.println("모인 보너스  : " + bonusPoint);
    }
}


public class Test {
    public static void main(String[] args) {
        Buyer yeom = new Buyer(1000, 0);
        yeom.buy(new Tv());
        yeom.buy(new Computer());
        yeom.buy(new Desk());
        yeom.buy(new Computer());

        yeom.summary();
    }
}
