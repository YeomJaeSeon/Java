package chapter6;

// 메서드도 static이 붙으면 클래스 메서드, 그렇지않은면 인스턴스 메서드라한다.
// 클래스변수(static변수)는 클래스가 메모리위에 올라가면 생성이되므로 모든 인스턴스의 공통
// 인스턴스변수는 인스턴스가 생성될때 해당 변수가 생성되ㅡ로 모든인스턴스들이 각각 고유하게 가지고있는 값.

//클래스 메서드(static 메서드)는 인스턴스 변수나 인스턴스 메서드를 사용하지않으면 static으로 정의
// 인스턴스 변수나 인스턴스 메서드를 사용하면 인스턴스 메서드로 정의

//
class MyMath2{
    long a,b; // 인스턴스 변수

    long add(){
        return a+b;//인스턴스 변수를 사용하므로 클래스(static)메서드는 될수없음.
    }
    long subtract(){
        return a - b; // 인스턴스 변수를 사용하므로(static없느 ㄴ변수) 클래스 메서드는 도리수없음
    }
    long multiply(){
        return a * b;
    }
    long divide(){
        return a/b;
    }

    static long add(long a, long b){
        return a+b; // 인스턴스 변수가아님, 매개변수임. 그러므로 인스턴스변수나 인스턴스 메서드를 사용하지않으므로 static메서드로 정의가능.
        // 이럴땐 static 메서드가 좋다. 더효율적임.
    }
    static long subtract(long a, long b){
        return a -b;
    }
    // 이렇게 인스턴스에 대한 변수와 메서드, 즉 인스턴스 메서드나 인스턴스 변수르 ㄹ사용하지않는경우엔 static을 이용해서 클래스 메서드로 정의한다.
    // 보통이렇게하고 이렇게하면 더 시간을 단추각능(class 메ㅓㅅ드로 정의안하면 인스턴스메서드인데 그건 인스턴스 생성될때만 호출되고 글므로 시간이 더오래걸림)
    // 반대로 인스턴스 변수가 있으면 (메서드안에) 그 메서드는 static을 붙일수없다. 인스턴스 생성과 상관없는 static안에 인스턴스 생성되야먄 생성되는 인스턴스 변수를
    // 사용할수 없기때문이다.
//    static long multiply(){
//        return a - b; // 보면 인스턴스 변수를 static안에서 사용하면 에러가나옴.
//    }
    static long multiply(long a, long b){
        return a * b; // 매개변수를 이용 즉, 인스턴스 변수를 사용하지 않으면 static을 붙여서 클래스 메서드로 정의해야함. 인스턴스 변수 사용하면
        // static안붙여서 인스턴스 메서드로 정의해야함.
    }
    static long divide(long a, long b){
        return a / b;
    }

    // 이렇게 인스턴스 변수나 인스턴스 메서드 사용안했지만 static으로 클래스 메서드로 정의안해도 에러는안뜸 대신 static으로정의하면 성능향상가능.
    long test(long a, long b){
        return a * b + 2;
    }
}
public class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(2, 3)); // static메ㅓㅅ드는 클래스이름.으롲 ㅓㅂ근가능(인스턴스와 상관없으므로)
        System.out.println(MyMath2.subtract(3, 2));
        System.out.println(MyMath2.multiply(3, 2));
        System.out.println(MyMath2.divide(3, 2));

        MyMath2 mm1 = new MyMath2(); // 인스턴스를 새엇ㅇ함 이때 인스턴스 변수와 인스턴스 메서드가 생성이도되는것이ㅏㄷ.(static, 클래스ㅇ 변수 메서드와달름)

        mm1.a = 3;
        mm1.b = 4;

        System.out.println(mm1.add()); // 인스턴스 생성한다음에야 인스턴스 메서드 호출가능
        System.out.println(mm1.subtract());
        System.out.println(mm1.multiply());
        System.out.println(mm1.divide());
    }
    // 인스턴스 메서드와 static(클래스)메서드의 차이점을 배움

    // 멤버변수는 static붙은 클래스 변수와 인스턴스변수가있다.
    // 둘의차이는 class가 memory갈때 생성되는 class변수와, 인스턴스 생성될때 생성되는 인스턴스 변수의차이이다.
    // 이에따라 기능도다른데 모든 인스턴스들이 (하나으 ㅣ클래스에서 생성된) 공통으로 가져야할 변수는 클래스변수로 static을 붙여서 변수를 선언하고
    // 각각의 인스턴스가 모두 각각의 고유한 값을 가져야할때는 인스턴스 변수를 사용하낟.(멤버변수에 static붙이지않아..)

    // 클래스의 메서드도 static이 붙으면 클래스메서드, 그렇지않으면 인스턴스 메서드라고한다.
    // 인스턴스메서드부터살펴보면 인스턴스 변수를 사용하면 인스턴스 메서드이다. 즉, 인스턴스가 생성돼야 인스턴스 변수가 생성되고 인스턴스 메서드를 호출할수있다.
    // 반대로 static붙으 ㄴ클래스 메서드는 인스턴스의 생성과 관계가없다. 그러므로 인스턴스 변수나 여타 다른 인스턴스 메서드가 사용되지 않으면 static(클래스)메서드로 메서드
    // 선언한다.
    // 여기에 몇가지 이유가있다.
    // 1. static(클래스)메서드는 인스턴스 생성과 관계까 없으므로 인스턴스 생성되야먄 존재하는 인스턴스 변수를 사용하지 못한다.
    // 만약 클래스메서드 호출했는데 인스턴스 생성이 한번도 되징낳아서 인스턴스 변수가 없으면 안되기 때문이다. 반대로 인스턴스 메서드는 클래스 변수접근이 자유롭다.
    // 인스턴스 생성되야만 호출할수있는 인스턴스 메서드는 클래스가 메모리위에 올라가면(메소드 영역) 생성되는 클래스변수르 ㄹ당연히 사용할수있다.

    // 2. 클래스메서드에서 인스턴스변수나 다른 인스턴스 메서드를 사용하지않으면 static을 붙여서 클래스 메서드로 이용하는 이유는 성능이다.
    // 뭐 굳이 그래야할 필요는없다. 인스턴스 변수사용하지않아도 걍 인스턴스 메서드로 정의해도 문제없음 그러나 인스턴스 메서드보단 클래스 메서드(static)이 실행시 호출속도가
    // 빠르기 때문에 성능을 높일수있다.

    // 클래스 변수, 인스턴스 변수의 차이를 통해서 클래스 메서드, 인스턴스 메서드도 활용가능

    // 해당 벼눗나 메서드 접근ㅂ아ㅓㅂㅂ
    // 1. 클래스 변수나 클래스 메서드(static이붙은 녀설들) : 클래스이름.클래스변수, 클래스이름.클래스메서드 로 접근한다. (인스턴스 변수나 인스턴스 메서드와 차이를 두기 위해)
    // 2. 인스턴스 변수나 인스턴스 메서드(static없는 녓거들) : 참조변수.인스턴스변수, 참조변수.인스턴스메서드로 접근한다.( 클래스 변수와 클래스메서드의 헷갈림방지)
}
