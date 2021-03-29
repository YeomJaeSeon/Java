package chapter7.single2;


// 클래스의 접근제어자는 public과 default밖에 - default이므로 같은 패키지내에서만 접근가능
public final class SingleTon{

    private static SingleTon instance = new SingleTon();

    private SingleTon(){ } //생성자 접근제어자가 private이므로 같은 클래스 내에서밖에 접근못함/

    public static SingleTon getInstance(){
        return instance;
    }

}

class SingleInsatnceTest {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getInstance();
    }
}
