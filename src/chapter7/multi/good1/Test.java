package chapter7.multi.good1;

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
    int money = 1000;
    int bonusPoint = 0;

    // 객체배열 만들수있다는게 다형성의 두번쨰장점! 하나의 탕비으로여러 종류의 타입의 객체를 가질수있따는게 장점이다.
    // 배열에 들어올수있는ㅌ입은 Product지만 다형성으로 그 자식 클래스의 인스턴스도 들어올수있다. - 이게다형성!
    Product[] cart = new Product[10];
    int i = 0;

    // 부모타입의 참조변수로 매개변수받은면 같은 타입의 인스턴스나 자식타입의인스턴스가 들어올수있다
    // 자식타입의 인스턴스가들어오면 다형성!.. 이를 통해서 쉽게 확장이가능해졋따. 추가로 Desk클래스를 추가해도 Product 상속만받으면
    // Product (부모타입)참조변수로 매개변수받을수있으므로 확장이 훨신쉬워짐.
    void buy(Product p){
        if(p.price > money) {
            System.out.println("돈부족해요.");
            return;
        }
        cart[i++] = p;
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"를 구매");
    }
}


public class Test {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println(b.money);
        System.out.println(b.bonusPoint);

        System.out.println("구매 목록");
        for (Product product : b.cart) {
            if (product == null) return;
            System.out.println(product);
        }
    }
}
// 다형성 두번째 장점! 매개변수 다형성