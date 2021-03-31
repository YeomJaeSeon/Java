package chapter7.poly3;

// 구입한 제품을 담는 배열을 Vector를 이용해서 동적 배열로 바꿔보장~
// Vector 클래스의 여러 메서드들은 Object클래스로 매개변수를 받거나 메서드의 리턴타입이 Object이다 이는 다형성을 의미한다.
// 그래서 모든 클래스는 Vector 클래스의 메서드를 사용할수있는것.

import java.util.Vector;

class Product{
    int price;
    int bonusPoint;
    Product(int price){
        this.price =price;
        bonusPoint = (int)(price / 10.0);
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

class Audio extends Product{
    Audio(){
        super(110);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer{
    int money;
    int bonusPoint;
    Vector item = new Vector();

    Buyer(int money, int bonusPoint){
        this.money = money;
        this.bonusPoint = bonusPoint;
    }

    // 매개변수를 부모타입의 참조변수로 받으면 실제로 매개변수에들어갈 인스턴스를 해당 매개변수의 자식타입으로 받을수잇다.
    // 이는 부모타입의 참조변수로 자식타입의 인스턴스에 접근할수있는 다형성을 이용한것이고 이걸 이여ㅛㅇ한게 아니면 마트에 새로운 제품이 들어올때마다
    // 해당 매개변수에 맞는 buy메서드를 오버로딩으로 새로 계속 만들어줘야함. 이렇게 다형성이용하면 쉽게 새로운 제품을 마트에 들여올수있따.
    void buy(Product p){
        if(money < p.price) {
            System.out.println("돈 부족해요.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p); // Vector클래스의 인스턴슨인 item의 add 메서드의 매개변수 타입이 Object이므로 모든 클래스가 타입의 인스턴스가 들어갈수있다.(다형성)
        System.out.println(p + "를 구입하셨습니다.");
    }
    void refund(Product p){
        if(this.item.remove(p)){
            // itemList에 환불할 물품이 있으면 삭제
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "를 환불하셨습니다.");
        }else{
            System.out.println("해당 물품이 없는디요..");
        }
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입한 물품이 없는데여;");
            return;
        }

        for(Object value : item){
            Product newValue = (Product) value;
            sum += newValue.price;
            itemList += newValue + ", ";
        }
        System.out.println("---구입 내역-----");
        System.out.println("구입한 물품 : " +itemList);
        System.out.println("총 내실 금액 : "+sum);
        System.out.println("남은 잔액 : " + money);
        System.out.println("모인 보너스  : " + bonusPoint);
    }
}
public class Test {
    public static void main(String[] args) {
        Buyer yeomBuyer = new Buyer(1000, 150);
        Tv t = new Tv();
        Audio a = new Audio();
        yeomBuyer.buy(new Tv());
        yeomBuyer.buy(new Computer());

        yeomBuyer.buy(t);
        yeomBuyer.buy(a);

        yeomBuyer.summary();

        yeomBuyer.refund(t);
        yeomBuyer.summary();

        Buyer kimBuyer = new Buyer(10000, 500);
        kimBuyer.summary();
    }
}
