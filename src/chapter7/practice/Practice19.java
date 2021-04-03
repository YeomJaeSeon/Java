package chapter7.practice;

class Product{
    int price;
    Product(int price){
        this.price = price;
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
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    // 매개변수 다형성
    void buy(Product p){
        if(money < p.price) return;
        money -= p.price;
        add(p);
    }

    void add(Product p){
        if(i >= cart.length){
            Product[] newCart = new Product[cart.length * 2];
            for(int i = 0; i < cart.length; i++){
                newCart[i] = cart[i];
            }
            this.cart = newCart;
        }
        cart[i++] = p;
    }
    void summary(){
        int sum = 0;
        System.out.println("목록");
        for (Product product : cart) {
            System.out.print(product + ", ");
            sum += product.price;
        }
        System.out.println();
        System.out.println("물건 총합 : " + sum);
        System.out.println("잔액 : " + money);
    }

}

public class Practice19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

//7-20
/*
p.x = 100
Child Method
p.x = 200
Child Method
 */

//7-21
/*
1. Movable 인터페이스 구현한 클래스의 객체
2. null / null이올수도있음
인터페이스 다형성 / 인터페이스가 매개변수타입으로 있으면 해당 인터페이스구현한 클래스 객체가와야한다.
//그런데 null도올수있다. 추가로.
 */

