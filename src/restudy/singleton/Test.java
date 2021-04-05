package restudy.singleton;

import static restudy.singleton.SingleTonClass.*;

final class SingleTonClass{
    private static SingleTonClass instance = new SingleTonClass();

    // 외부에서 인스턴스 생성불가. 같은클래스에선가능.
    private SingleTonClass(){

    }

    public static SingleTonClass getInstance(){
        return instance;
    }
}

public class Test {
    public static void main(String[] args) {
        SingleTonClass singleTonClass = getInstance();
        // 싱글턴으로
    }

}
