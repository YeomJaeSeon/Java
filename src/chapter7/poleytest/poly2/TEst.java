package chapter7.poleytest.poly2;

import java.util.Vector;

// 객체배열이용하자 이것도 다형성이용할것.
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
        return "Tv";
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

class Buyer{
    int money;
    int bonusPoint;
    // Vector 클래스는 동적인 객체배열을 만들때 사용함. 기본으로 10size, 그외추가로드어오면 동적으로 배열 length가 추가됨.
    // Vector클래스도 다형성으로 매개변수나 리턴타입이 Object로.. Object의 모든 자식 인스턴스가 들어와도되낟. - 다형성.(부모타입의 참조변수로 자식타입의 인스턴스 접근가능)

    Vector<Product> items = new Vector<>();

    Buyer(int money, int bonusPoint){
        this.money = money;
        this.bonusPoint = bonusPoint;
    }
    void buy(Product p){
        if(this.money < p.price){
            System.out.println("돈부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        items.add(p);

        System.out.println(p + "를 구입하셨네요.");
    }
    void refund(Product p){
        if(items.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "를 환불하셨네요 ㅋㅋ");
        }else{
            System.out.println("구매목록에 없네요.");
        }
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        for(Product item : items){
            sum += item.price;
            itemList += (item + ", ");

        }
        System.out.println();
        System.out.println("구매 목록");
        System.out.println("합계 :" + sum);
        System.out.println("구입 목록 : " + itemList);
    }
}

public class TEst {
    public static void main(String[] args) {
        Buyer yeomCustomer = new Buyer(1000, 0);
        Tv t = new Tv();
        Computer c =new Computer();

        yeomCustomer.buy(t);
        yeomCustomer.buy(t);
        yeomCustomer.buy(c);

        yeomCustomer.summary();

        yeomCustomer.refund(c);
        yeomCustomer.summary();
    }
}
