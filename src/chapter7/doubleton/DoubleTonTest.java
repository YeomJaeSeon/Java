package chapter7.doubleton;

import static chapter7.doubleton.DoubleTon.*;

// double ton내가만든거 ㅋㅋ 클래스에 인스턴스 두개만 존재. 그외에 인스턴스 생성불가. 생성자에 접근제어자를 사용해서 외부에서 인스턴스 생성불가/
// 내부 클래스에서 인스턴스생성가능 privateㅣㅇ므로..
// 그래서 public으로 내부에서만든 인스턴스를 리턴하는 방식으로해야함.
//참고로 static으로 해당 인스턴스를 리턴하는 메서드를 해야하는이유는 욉웨서 인스턴스 생성할수가없으므로 static으로 만들어야 클래스.으로 접근가능.
//외부에서 생성자가 private이므로 이스턴스생성불가
// 생성자에서 priavte 접근제어자로 인스턴스 갯수를 제한할수있다 요로코롬. 그리고 추가로 생성자가 private이므로 자식은 부모의 생성자를 호출할수있어야하는데
// 그게안되는 DOubleTon은 부모일수없다. 즉 확장불가능 그러므로 클래스앞에 마지막이라는 final 제어자를 넣어주면 깔끔하다.
final class DoubleTon{

    private static DoubleTon instance = new DoubleTon();
    private static DoubleTon instance2 = new DoubleTon();
    // 생성자에 접근제어를 붙여서 private으로붙이면 외부에서 이 클래스의 인스턴스를 생성을 하지못해 그러나 이클래스에서는 자신의 인스턴스생성가능(생성자호출가능)
    //private이므로 접근범위가 같은 클래스이므로
    private DoubleTon(){

    }
    public static DoubleTon getInstance(){
        return instance;
    }
    public static DoubleTon getInstance2(){
        return instance2;
    }
}

public class DoubleTonTest {
    public static void main(String[] args) {
        DoubleTon instance1 = getInstance(); // static import로 이런식으로 클래스이름을 생략할수있당... 클래스 메서드 (static)메서드는
        //클래스.으로 접근하는데 이 ㅡㅋㄹ래스이름을 생략할수잇어어 더 간단하게 코딩할수있다.
        DoubleTon instance2 = getInstance2();

        System.out.println(instance1 + ", " + instance2);
    }
}
