package chapter7.pkg1;

public class MyParent {
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
class MyParentTest{
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.pri); private한 pri변수는 자신의 클래스에서만 접근가능 다른클래스인 MyParentTest에선 접근불가
        System.out.println(p.def);
        System.out.println(p.pro);
        System.out.println(p.pub);
    }
}
