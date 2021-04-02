package chapter7.in.c;

// getInstance사용
class A{
    I i = InstanceManager.getInstance();
    i.method();

}
interface I{
    void method();
}

class B implements I{
    public void method(){
        System.out.println("method in B class");
    }

    @Override
    public String toString() {
        return "class B";
    }
}

class InstanceManager{
    public static I getInstance(){
        return new B();
    }
}
public class TEst {
}
