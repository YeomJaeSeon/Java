package restudy.ts;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(this.price * 10.0);
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
class Audio extends Product{
    Audio(){
        super(300);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
class Buyer{
    int money;
    int bonusPoint;

    Product[] cart = new Product[10];
    int i = 0;

    String list = "";

    Buyer(){
        this(1000, 0);
    }
    Buyer(int money, int bonusPoint){
        this.money = money;
        this.bonusPoint =bonusPoint;
    }

    void buy(Product p){
        if(p.price > money) return;
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+"를 구매");
    }

    void summary(){
        for (Product product : cart) {
            if(product == null) break;
            list += product +", ";
        }

        System.out.println(list);
    }

}

public class Test {
    public static void main(String[] args) {
        Buyer customer1 = new Buyer();
        
        customer1.buy(new Tv()); //다형성
        customer1.buy(new Computer());
        customer1.buy(new Audio());

        System.out.println(customer1.money);
        System.out.println(customer1.bonusPoint);

        customer1.summary();

    }
}
