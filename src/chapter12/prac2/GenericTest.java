package chapter12.prac2;

import java.util.ArrayList;
import java.util.List;

class Product{}
class Computer extends Product{}
class Tv extends Product{}
class Apple{}

public class GenericTest {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        // 지네릭 클래스의 객체생성할땐 참조변수와 생성자의 타입이 같아야함.
        productList.add(new Product());
        productList.add(new Computer()); // 다형성
        // void add(E param){
        // ~
        //
        //이런식으로 되어있는데 타입변수 E에 Product를 넣어서 대입한결과는
        // void add(Product param0{
        // ~이므로 매개변수 다형성으로 여기에 자식 타입의 인스턴스가 들어갈수잇음 -> Product param = new Computer() : 다형성!
        // 부모타입의 참조변수로 자식타입의 인스턴스 참조가능
//        List<Product> productList1 = new ArrayList<Computer>();
        List<Computer> computerList = new ArrayList<Computer>();
        computerList.add(new Computer());
        Computer computer = new Computer();
        computerList.add(computer);

//        computerList.add(new Tv());

        System.out.println("productList = " + productList);
        System.out.println("computerList = " + computerList);
    }

}
