package chapter7.p2;

import chapter7.p1.Parent;

class Child extends chapter7.p1.Parent{

    @Override
    public void printMethod() {
//        System.out.println(pri);
//        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);
    }
}

public class AnotherImportTest{
    public static void main(String[] args) {
        Parent p = new Parent();

//        System.out.println(p.pri);
//        System.out.println(p.def);
//        System.out.println(p.pro);
        System.out.println(p.pub);
    }
}