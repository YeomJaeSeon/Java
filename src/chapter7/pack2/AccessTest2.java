package chapter7.pack2;

import chapter7.pack1.MyParent;

import static chapter7.pack2.SingleTon.*; // static import로 클래스이름 생략가능. static메서드 접근 쉽게할슁ㅆㅇㅁ
//클래스이름 생략가능해서.

class MyChild extends MyParent {
    @Override
    public void printMethod() {
//        System.out.println(pri);
//        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);
    }
}

public class AccessTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.pri);
//        System.out.println(p.def);
//        System.out.println(p.pro);
        System.out.println(p.pub);

        SingleTon s = getInstance(); // static이므로 클래스이름으로접근
    }
}

class SingleTon{
    private static SingleTon s = new SingleTon(); // private한 생성자고 같은 클래스에선 접근가능ㅎ마ㅡ로 이렇게클래스내에서 인스턴스 생성해준다.
    // 즉, 생성자호출해준다.
    //private으로 한이유는 같은클래스에서밖에 접근안하닌까

    private SingleTon(){

    }
    public static SingleTon getInstance(){
        return s; // static메서드이므로 static메서드는 인스턴스 멤버에 접근불가. 이유는알지? 인스턴스 생성과 static메서드는 상관이없으므로
        // 혹시나 인스턴스 생성전에 클래스 멤버에서 인스턴스 멤버접근할수도있으므로 클래스멤버에선 인스턴스 멤버에접근안됨.
    }
}