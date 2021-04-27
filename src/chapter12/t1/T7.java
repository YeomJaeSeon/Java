package chapter12.t1;

import java.util.ArrayList;

class Product{}
class Radio extends Product{}
class Chair extends Product{}

public class T7 {
    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<Product>();
        ArrayList<Radio> radioArrayList = new ArrayList<>(); // 생성자에 타입 생략가능
//        ArrayList<Product> productArrayList1 = new ArrayList<Radio>();
        ArrayList<Chair> chairArrayList = new ArrayList<Chair>();

        productArrayList.add(new Product());
        productArrayList.add(new Radio()); // void add(Product item) {~ }
        // 매개변수 다형성이 적용된다. Product item = new Radio(); 부모타입의 참조변수가
        // 자식타입의 인스턴스 참조가능
        // 다형성 장점둘 1. 매개변수 다형성, 2. 다양한 타입의 객체배열 을 하나의 배열에서 다룰수있따는것.

//        radioArrayList.add(new Product());
    radioArrayList.add(new Radio());
//    chairArrayList.add(new Radio());
//    chairArrayList.add((Chair)(new Product()));

        printAll(productArrayList);
//        printAll(radioArrayList); 참조변수 대입된타입과 생성자 대입된 타입이 다르니 에러남.
        // 지네릭클래스에서 생성한 객체의 참조변수에 대입된 타입과 생성자에 대입된 타입이 다르면 안도미.
    }
    static void printAll(ArrayList<Product> list){
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
/**
 * 지네릭스: 컴파일시 에러체크 기능 (런타임에서 발생할수있는 에러를 컴파일러가 잡을수있또록 컴파일 에러로 가져옴)
 * 장점
 * 1. 타입 안전성(컴파일러가 에러체크) - 명시적 타입
 * 2. 형변환 생략가능.
 */
