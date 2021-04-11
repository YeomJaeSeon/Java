package restudy.seventest;

/**
 * 다형성
 * Tv t = new SmartTv(); // 부모타입의 참조변수로 자식 인스턴스 접근
 * 참조변수 형변환 - 사용할수있는 멤버갯수조절 - 상속관계..
 * instanceof - 참조변수형변환전 확인하는 연산자 - true일경우는 클래스타입이 자신이거나 부모
 * 다형성 장점
 * 1. 매개변수다형성
 * 2. 다양한 객체를 저장하는 객체배열
 */
class Product{
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price * 0.1);
    }
}

class Desk extends Product{

    Desk(){
        super(200);
    }

    @Override
    public String toString() {
        return "Desk";
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
        super(150);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Buyer{
    int money;
    int bonusPoint;

    // 다형성장점 2
    // 다양한 종류의 객체를 하나의 부모배열로 ㅁ받ㅇ르수있음
    Product[] cart = new Product[10]; // 카트에 담을수있는 물품 최대 10개
    int i = 0;

    Buyer(int money, int bonusPoint){
        this.money = money;
        this.bonusPoint = (int)(0.1 * money);
    }
    // 매개변수 다형성 사용안하는경우. 만약사용한다면?
//    void buy(Desk desk){
//        if(money < desk.price) {
//            System.out.println("돈부족하세요");
//            return;
//        }
//        money -= desk.price;
//        bonusPoint += desk.bonusPoint;
//    }
//    void buy(Computer computer){
//        if(money < computer.price) {
//            System.out.println("돈부족하세요");
//            return;
//        }
//        money -= computer.price;
//        bonusPoint += computer.bonusPoint;
//    }
    void buy(Product p){
        if(p.price > money){
            System.out.println("돈부족하세요.");
            return;
        }
        cart[i++] = p; // 하나씩 카트에담음
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구매하심.");
    }
    void summary(){
        System.out.println("----구매목록------");
        for (Product product : cart) {
            if(product ==null) break;
            System.out.print(product+", ");
        }
        System.out.println();
    }
}
public class Test {
    public static void main(String[] args) {
        Buyer b1 = new Buyer(1000, 20);
        b1.buy(new Computer());
        Desk desk = new Desk();
        b1.buy(desk);
        b1.buy(new Tv());
        b1.buy(new Tv());
        b1.summary();
    }
}
