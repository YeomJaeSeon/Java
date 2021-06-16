package second.chapter6.singleton;

public class SingleTon {
    private static SingleTon instance = new SingleTon();

    private SingleTon(){

    }
    public static SingleTon getInstance(){
        return instance;
    }
}

class TT{
    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();

        System.out.println(instance == instance2);
    }
}

// public protected default private : 접근제어자 한번에 하나씩밖에 못붙인아.

// 클래스, 메서드, 멤버변수, 생성자
// 클래스에붙은건 public default밖에..