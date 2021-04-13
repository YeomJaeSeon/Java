package restudy.chapter7re;

// 매개변수 다형성 1 - 다형성장점
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
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
class Desc extends Product{
    Desc(){
        super(300);
    }

    @Override
    public String toString() {
        return "Desc";
    }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    // 다형성 장점2 - 하나의 배열타입으로 여러 종류타입 저장가능
    Product[] cart = new Product[10];
    int i = 0;

    Buyer(){

    }

    void buy(Product p){
        if(money < p.price) {
            System.out.println("돈부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+"를 구매");
    }
    void summary(){
        String list = "";
        for (Product product : cart) {
            if(product == null) break;
            list += (product + ", ");
        }
        System.out.println(list);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Buyer b1 = new Buyer();
        b1.buy(new Tv());
        b1.buy(new Computer());
        b1.buy(new Tv());
        b1.buy(new Desc());
        b1.summary();
    }
}
