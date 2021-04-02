package chapter7.in.b;

// 이 클래스 A는 interface하고만 직접적인관계가잇음 
//인터페이스를 통해서 껍데기, 알맹이로 나눌수있음. 즉 선언 구현으로 분리가능
class A{
    void autoPlay(I i){
        i.play();
    }
}
interface I{
    void play();
}

class B implements I{
    public void play(){
        System.out.println("play in class B");
    }
}

class C implements I{
    public void play(){
        System.out.println("play in class C");
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}
