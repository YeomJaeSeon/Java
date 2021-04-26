package chapter12.basic;

import java.util.ArrayList;
import java.util.List;

class Product{}
class Computer extends Product{}
class Desk extends Product{}

public class T4 {
    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<Product>();
        ArrayList<Computer> tvArrayList = new ArrayList<Computer>(); // 지네릭클래스인 ArrayList
        // 에는 타입 변수에 타입을 지정하는데 참조변수, 생성자에 타입을 지정하낟.
        // 이걸 대입된 타입이라부른다.
//        ArrayList<Product> productArrayList1 = new ArrayList<Tv>();
        // 대입된타입이 다형성 적용된다해도 안됨 . 타입변수에 대입하는 두타입은 무조건 같아야한다.
        List<Computer> list = new ArrayList<Computer>(); //
        // 다형성 내에서 대입된 타입이 같은건OK

        productArrayList.add(new Product());
        productArrayList.add(new Computer());

        tvArrayList.add(new Computer());
//        tvArrayList.add(new Product());

//        productArrayList(tvArrayList);
//        printAll(tvArrayList);
        // ArrayList<Product> list = new ArrayList<Computer>(); 대입된 타입이 달라선안됨
        printAll(productArrayList);

    }
    static void printAll(ArrayList<Product> list){
        for (Product product : list) {
            System.out.println(product);
        }
    }

}
