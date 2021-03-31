package chapter7.polyargumenttest;

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
        //자식클래스는 부모클래스의 멤버초기화하는 생성자 호출해야함.
        super(100);
    }
    // 생성자 안하면 에러뜨는 이유는 Tv(){}만추가되고 이건 이 샏ㅇ성자 내부에 super()이거만 호출되므로 부모타입의 생성자는 매개변수가있으므로 에러가나는것

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
 // 추가로 Desk 제품을 추가를 쉽게할수있음 다형성을 이용하면.
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

    Buyer(int money, int bonusPoint){
        this.money = money;
        this.bonusPoint = bonusPoint;
    }

    // 매개변수로 Tv타입 , Audio 타입,Computer타입 따로사면 메서드를 세개만들어야함.
    // 다형성으로 부모타입의 참조변수를 받아서 부모타이브이 참조변수가 각 자식타입의 인스턴스 참조할수있게한다. - 매개변수에서 다형성을 이용
    // 이렇게되면 제품이 하나더 추가되더라도 Product 클래스의 자식으로만 정의하면됨
    void buy(Product p){
        if(money < p.price){
            System.out.println("돈이 부족해요");
            return;
        }
        money -= p.price;
        this.bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구입하셨어요.");
    }

}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer(1000, 0);

        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Desk());

        System.out.println("현재 남은 돈은 : " + b.money);
        System.out.println("현재 가진 포인트는 : " + b.bonusPoint);

        Buyer b2 = new Buyer(2000, 100);

        Tv t = new Tv();
        b2.buy(t); // 매개변수에 new Tv()를 넣는것과 Tv t = new Tv()하는것과 똑같다. 다만 차이는 실제 인스턴스를 가르키는 참조변수를 넣는것과
        // 인스턴스의 주소자체를 넣는것의 차이이다.

        System.out.println("현재 남은 돈은 : " + b2.money);
        System.out.println("현재 가진 포인트는 : " + b2.bonusPoint);
    }
}
