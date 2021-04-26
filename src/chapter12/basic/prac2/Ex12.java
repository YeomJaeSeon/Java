package chapter12.basic.prac2;

import java.util.ArrayList;
import java.util.List;

class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class Ex12 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>(); // 대입된타입은 같아야함.
        // 지네릭 클래스의 객체만들때는 참조변수랑 생성자에 타입대입하는데 대입한 타입이 같아야함.
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        List<Tv> list = new ArrayList<Tv>(); //이건됨!

        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Tv());
        productList.add(new Audio());

//        tvList.add(new Audio());
        tvList.add(new Tv());
        tvList.add(new Tv());

//        printAll(tvList); - 대입된 타입이다름
        // 지네릭클래슥 ㅐㄱ체만들떈 참조변ㅅ, 생성자 대입하는 타입이 같아야함.
        //List<Product> list = new ArrayList<Tv>(); 이건당연히안됨

        printAll(productList);


    }
    public static void printAll(List<Product> list){
        for (Product product : list) {
            System.out.println(product);
        }
    }

}
