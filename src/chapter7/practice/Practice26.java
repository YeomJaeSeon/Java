package chapter7.practice;

class Outer2{
    static class Inner{
        int iv = 200;
    }
}

public class Practice26 {
    public static void main(String[] args) {
        Outer2.Inner inner = new Outer2.Inner();
        // 외부클래스 인스턴스 생성안했지? Outer outer = new OUter()이런식으로안햇자나.
        System.out.println(inner.iv);
   //확인필요
    }
}
