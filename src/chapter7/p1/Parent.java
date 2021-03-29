package chapter7.p1;

public class Parent{
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

class ImportTest {
    public static void main(String[] args) {
        Parent p = new Parent();
//        System.out.println(p.pri);
        System.out.println(p.def);
        System.out.println(p.pro);
        System.out.println(p.pub);
    }
}
