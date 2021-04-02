package chapter7.goodpoint;

class A{
    void useMethod(I i){
        i.method();
    }
}

// 선언(껍데기)
interface I{
    void method();
}

// 구현(알맹이)
class B implements I{
    public void method(){
        System.out.println("B method");
    }
}

class C implements I{
    public void method(){
        System.out.println("C method");
    }
}



public class TEst {
    public static void main(String[] args) {
        A a = new A();
        a.useMethod(new B());
    }
}
