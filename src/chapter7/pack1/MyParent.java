package chapter7.pack1;

public class MyParent{
    private int pri;
    int def;
    protected int pro;
    public int pub;

    public void printMethod(){
        System.out.println(pri);
        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);
    }
}

class AccessTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.pri);
        System.out.println(p.def);
        System.out.println(p.pro);
        System.out.println(p.pub); // 접근제어자 private빼고는 같은 패키지의다른 클래스에서 모두접근가능
        // 이렇게 접근제어자 왜씀? 데이터보호하려고 - 캡슐화 개념
    }
}
