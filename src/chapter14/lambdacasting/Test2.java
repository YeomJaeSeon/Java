package chapter14.lambdacasting;

@FunctionalInterface
interface MyF{
    void printThis(String s);
}

@FunctionalInterface
interface MyF2{
    int pow(int a);
}
public class Test2 {
    public static void main(String[] args) {
        MyF f2 = new MyF(){
            public void printThis(String s){
                System.out.println(s);
            }
        };
        // 익명 객체 = 람다식
        MyF f = (String s) -> System.out.println(s); // 람다식 = 익명객체
        //람다식 도 객체, 참조하는 참조변수탕비은 함수형인터페이스

        f.printThis("안녕");

        MyF2 f3 = (int a) -> (int)(Math.pow(a, 10));
        //람다식 도 익명객체, 람다식 참조하는 참조변수 타입  - 함수형인터페이스 타입 (객체이므로 참조변수필요)
        //람다식도 익명객체..
        int pow = f3.pow(10);
        System.out.println(pow);

    }
}
