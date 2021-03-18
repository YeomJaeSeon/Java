package chapter6;
class CalculatorTestis{
    double a, b; // 멤버변수
    static String brandName = "CASIO";
    
    double add(){
        return a + b;
    } // 인스턴스 변수를 사용하므로 static붙이면 안되겠다. 즉, 클래스 메서드말고 인스턴스 메서드로 선언해야함
    //왜냐면 인스턴스변수는 인스턴스 생성된다음에야 접근가능한데 클래스 메서드는 인스턴스 생성과 상관이 없으므로. 인스턴스 생성안되어있을대 호출되면 에러가날슁ㅆ으므로
    //자바에서 아애막음
    double subtract(){
        return a - b;
    }
    double mutiply(){
        return a * b;
    }
    double divide(){
        return a / b;
    }
    
    //인스턴스 변수나 인스턴스 메서드 사용안하면 static키워드붙여서 클래스 메서드로만들자 .룰이 있는건아닌데이게 성능이더좋음 그냥습관화하자.
    static double add(double a, double b){
        return a + b; //이 변수는 매개변수임, 즉, 인스턴스 변수를 사용하지않으므로 static붙여서 클래스 메서드로 정의했다. 인스턴스 생성과 관계업슨
    }
    static double subtract(double a, double b){
        return a - b;
    }
    static double multiply(double a, double b){
        return a * b;
    }
    static double divide(double a, double b){
        return a / b;
    }
}

public class MyCalculatorEx {
    public static void main(String[] args) {
        System.out.println(CalculatorTestis.add(3.0D, 4));
        System.out.println(CalculatorTestis.subtract(4, 5));
        System.out.println(CalculatorTestis.multiply(3.0, 4.5));
        System.out.println(CalculatorTestis.divide(6, 1.5));

        System.out.println(CalculatorTestis.brandName);

        //클래스메서드나 클래스변수는 클래스이름. 으로접근.

        CalculatorTestis cal1 = new CalculatorTestis(); //인스턴스 생성했으니 인스턴스 변수도 생성되었고 인스턴스 메서드도 호출가능

        cal1.a = 3.14;
        cal1.b = 4.15;

        System.out.println(cal1.add());
        System.out.println(cal1.subtract());
        System.out.println(cal1.mutiply());
        System.out.println(cal1.divide());

        //인스턴스 변수ㅏㄴ 인스턴스 메서드는 이렇게 접근을 참ㅈ변수.으롷 ㅏㄴ다.

        // 예제는메서드 내에서 ㅇ매개변수만 사용해서 인스턴스변수나 인스턴스 메서드를 하나도 사용안할때 static(클래스메서드로)로 정의하는 예제이다.


    }
}
