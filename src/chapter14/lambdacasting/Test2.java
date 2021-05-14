package chapter14.lambdacasting;

@FunctionalInterface
interface MyF{
    void printThis(String s);
}

@FunctionalInterface
interface MyF2{
    int pow(int a);
}

@FunctionalInterface
interface MyF3{
    void hello(String s);
}

interface FuncInter{
    int max(int a, int b);
}
public class Test2 {
    public static void main(String[] args) {
        Object obj = new Object() {//익명 클래스 - 1회용, 클래스 선언과 동시에 객체생성
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };
//        System.out.println(obj.max(10, 5)); -- Object 타입의 참조변수는 max를 가르킬 리모컨이없다.. 그래서 가르킬수가없다.

        MyF f2 = new MyF(){
            public void printThis(String s){
                System.out.println(s);
            }
        };

        FuncInter funcInter = (a, b) -> a > b ? a : b; // 함수형인터페이스를 통해서 람다식을 참조. 람다식도 익명객체이므로
        //람다식이 익명 객체

        System.out.println("max : " + funcInter.max(10, 5));

        // 익명 객체 = 람다식
        MyF f = (String s) -> System.out.println(s); // 람다식 = 익명객체
        //람다식 도 객체, 참조하는 참조변수탕비은 함수형인터페이스

        f.printThis("안녕");

        MyF2 f3 = (int a) -> (int)(Math.pow(a, 10));
        //람다식 도 익명객체, 람다식 참조하는 참조변수 타입  - 함수형인터페이스 타입 (객체이므로 참조변수필요)
        //람다식도 익명객체..
        int pow = f3.pow(10);
        System.out.println(pow);

        MyF3 myF3 = s -> System.out.println(s);
        myF3.hello("ㅎㅎ");


    }
    static MyF3 Test2(){
        return (s) -> System.out.println(s);
    }
}
