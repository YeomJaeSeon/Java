package restudy;

class MyCal{
    long a, b;

    long add(){
        return a + b;
    }
    long subtract(){
        return a - b;
    }
    long multiply(){
        return a * b;
    }
    long divide(){
        return a / b;
    }
    // 함수의 이름이 같지만 매개변수가다르므로 overloading!
    static long add(long a, long b){
        return a + b;
    }
    static long subtract(long a, long b){
        return a - b;
    }
    static long multiply(long a, long b){
        return a * b;
    }
    static long divide(long a, long b){
        return a / b;
    }
}

public class StaticStudy {
    public static void main(String[] args) {
        // static메서드(클래스메서드)는 인스턴스 생성과 관계가 없다.
        System.out.println(MyCal.add(30L, 40));
        System.out.println(MyCal.subtract(30, 40));
        System.out.println(MyCal.multiply(30, 40));
        System.out.println(MyCal.divide(30, 40));
        // 보면 static메서드, 클래스 메서드는 이렇게 인스턴스를 생성하지 않아도 이렇게 사용할수있다.

        // 크러므로 static이 붙어있는 클래스 메서드, 클래스 멤버는 인스턴스 멤버를 사용할수없다.
        //왜? 클래스메서드 사용하려는 시점에 인스턴스 생성이 ㅇ되지않아 인스턴스 멤버들이 존재하지 않을수도 있기떄문에 Java에서 아앵막는다.
        // 참고로 overloading은 메서드 이름은 같지만 매개변수가 다른 매개변수 개수, 타입, 다르면 오버로딩이라한ㄷ.ㅏ

        //왜 오버로딩? - 이점이 너무많다 .함수이름 짓는데 스트레스 낮추려고 오버로딩이라는 기능이있다.

        MyCal c1 = new MyCal(); // 인스턴스 생성 이제 인스턴스 변수와 인스턴스 메서드를 사용할수있따.
        c1.a = 300;
        c1.b = 400; // 이렇게 인스턴스 변수에 접근해서 인스턴스 변수 초기화한다.
        // 사실 setter getterㅇ를 하기전이라 그렇지만 인스턴스 변수는 이렇게 참조변수(reference)가 있는 c1을 통해서 접근한다.

        System.out.println(c1.add());
        System.out.println(c1.subtract());
        System.out.println(c1.multiply());
        System.out.println(c1.divide());

        //보면 static, 클래스 메서드는 이렇게 인스턴스 생성하기전에 매개변수만으로 뭔가 리턴하는등 인스턴스 생성과 상관이 없다.

        // 클래스 메서드 vs 인스턴스 메서드의 차이이다.
        //즉, 인스턴스 메서드는 인스턴스 변수를 사용하냐?
        // 클래스 메서드는 인스턴스 메서드나 인스턴스 변수를 사용하냐의 차이이다.
        // 인스턴스 메서드나 변수 사용안하면 static붙여서 클래스 메서드로 정의하자. 그게더 효율적이다.

        int[] intArr = new int[]{1, 2, 3, 4, 5};

        print(intArr);
    }
    static void print(int ...args){
        for(int value : args){
            System.out.println(value);
        }
    }
}
