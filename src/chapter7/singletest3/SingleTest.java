package chapter7.singletest3;

final class SingleTon{

    private static SingleTon s = new SingleTon();
    private SingleTon(){

    }

    //생성자로 접근제어붙일수있따. 이런식으로 private하게

    // 생성자가 private이므로 외부에서 인스턴스 생성할수없으므로 인스터스생성하징낳아도 접근가능해야하므로 static으로 클래스메서드로 존재하게한다.
    public static SingleTon getInstance(){
        return s;
    }
}

public class SingleTest {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getInstance();
        // 싱글턴 객체로 존재. 생성자에 접근제어자(private)붙여서 인스턴스의 개수를 제한할수있다.
    }
}
