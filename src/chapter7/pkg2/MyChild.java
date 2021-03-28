package chapter7.pkg2;

//import chapter7.pkg1.MyParent;
// imprt문써서 class이름쓸떄 패키지이름 생략가능하다. 그런데 이번에 그냥 import안쓰고 패키지이름다써볼게

import chapter7.pkg1.MyParent;

public class MyChild extends chapter7.pkg1.MyParent {
    public void printMethod(){
//        System.out.println(pri); 같은클래스에서만 접근가능한 private변수는 다른클래스접근부가
//        System.out.println(def);  같은 패키지에서만 접근가능ㅎ나 default(접근제어자 안쓴거) 멤버는 다른 패키지인 pkg2에선 접근불가
        System.out.println(pro); // 같은패키지 + 다른패키지 자식클래스에선 적븐가능한게 protected
        System.out.println(pub); //접근제한 X
    }
}
class MyParentTest2{
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.pri);
//        System.out.println(p.def);
//        System.out.println(p.pro); 다른패키지인데 자시긐ㄹ래스가 아니므로
        System.out.println(p.pub);

    }
}
