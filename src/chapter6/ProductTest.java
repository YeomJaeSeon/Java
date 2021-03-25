package chapter6;

public class ProductTest {
    static int count = 0; // 클래스변수임 static
    int serialNo;
    {
        ++count;
        serialNo = count; // 인스턴스 초기화블럭에서 인스턴스 변수에 클래스변수값을 할당함.
    } // 사실 인스턴스 초기화블럭은 공통의 로직을 묶는데 의의가잇음. 중복된 코드를 줄이는데. (생성자들의 중복된 코드들)
    ProductTest(){

    }

    public static void main(String[] args) {
        ProductTest p1 = new ProductTest();
        ProductTest p2 = new ProductTest();
        ProductTest p3 = new ProductTest();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);
    }
}
