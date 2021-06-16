package second.chapter6.polygoodthing;

import java.util.ArrayList;
import java.util.List;

//매개변수 다형성
// 부모타입의 참조변수로 자식타입의 인스턴스 참조하는건 다형성인데 그럼 실제 인스턴스의 모든 멤버 가르키지못할수도이쌎ㄴㅎ아?
//다형성왜써? - 변경에 유리하ㅣㄱ떄문, 중복코드 없기떄문
class Product{
    private int price;
    private int point;

    public Product(int price){
        this.price = price;
        this.point = price / 10;
    }

    public int getPrice() {
        return price;
    }

    public int getPoint() {
        return point;
    }
}

class Tv extends Product{
    public Tv(){
        super(1000);
    }

    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product{

    public Computer(){
        super(2000);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Desk extends Product{
    public Desk(){
        super(500);
    }

    @Override
    public String toString() {
        return "Desk";
    }
}

class Buyer{
    int money;
    int point;
    List<Product> products = new ArrayList<>();

    public Buyer(int money, int point){
        this.money = money;
        this.point = point;
    }
    void buy(Product product){
        if(this.money < product.getPrice()){
            System.out.println("돈부족해요");
            return;
        }

        System.out.println("샀습니당!");
        money -= product.getPrice();
        point += product.getPoint();

        products.add(product);

    }
    void summary(){
        System.out.println("//==잔액및 포인트==//");
        System.out.println("money = " + money);
        System.out.println("point = " + point);
        System.out.println("//==구매목록==//");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(5000, 0);
        buyer.buy(new Tv());
        buyer.summary();
        buyer.buy(new Computer());
        buyer.summary();
        buyer.buy(new Desk());
        buyer.summary();
        buyer.buy(new Computer());
        buyer.summary();

    }
}
