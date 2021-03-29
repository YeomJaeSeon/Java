package chapter7.single;

// 이렇게 final로 하는게좋다 왜냐면 생성자가 private이므로 확장불가, 즉 자식클래스를 만들수가없으므로 상속계층 맨마지막이라고 생각.
final class SingleTon{
    // 접근제어자는 이렇게 범위를 자신이 설정해서 지정해준다. 최대한 작은버뮈부터 생각하느게좋다. private -> default -> protected -> public순으로
    private String name;
    
    // 하나의 인스턴스만 존재하게된다. static이므로 클래스가 메모리위에올라갈때 이인스턴스는 생성됨
    private static SingleTon instance = new SingleTon("마동석");

    private SingleTon(String name){
        super();
        this.name = name;
    }
    // 생성자가 private이므로 외부에서 SingleTon인스턴스를 생성할수가없음.
    // 그래서외부에서 인스턴스 를 생성하는건 아애불가능하고 SingleTon클래스내의 인스턴스를만들고 이걸 사용할수있따.
    // 즉 인스턴스를 싱글턴으로 존재하게 하나만존재하게, 즉 인스턴스의 개수에 제한을줄수있다.(생성자에 제어 접근자 private을 사용하면)

    public static SingleTon getInstance(){
        return instance;
    }
    // public접근제어자 메서드로 외부에서 이메서드를 이용해 생성자가 private인 이 SingleTon클래스의 인스턴스에 접근할수잇음


    // 부모클래스의 멤버인 메서드를 선언부빼고바디를 바꺼서 자신에 맞게 변경하는걸 오버라이딩!
    @Override
    public String toString() {
        return "name : " + this.name;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        chapter7.single2.SingleTon s = chapter7.single2.SingleTon.getInstance();

    }
}
