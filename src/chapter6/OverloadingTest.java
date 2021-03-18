package chapter6;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();

        System.out.println(mm.add(3, 3));
        System.out.println(mm.add(3L,3));
        System.out.println(mm.add(3L, 3L));
        System.out.println(mm.add(3, 3L));

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(mm.add(a));
    }
}

class MyMath3{
    int add(int a, int b){
        return a + b;
    }
    long add(long a, int b){
        return a + b;
    }
    long add(int a, long b){
        return a+ b;
    }
    long add(long a, long b){
        return a + b;
    }
    int add(int[] arr){
        int sum = 0;
        for(int value : arr){
            sum += value;
        }
        return  sum;

    }
    // 전부다 ~인스턴스메서드로 인스턴스 생성되야만 접근가능 (static없음)
    // 추가로 메서드 오버로딩으로 메서드들이 정의되어있음. 메서드 오버로딩이란 메서드이름이 모두 같고 매개변수의 개수와 타입이 다른 메서드들을 의미한다.(한 클래스 내에서)
    // 메서드 오버로딩의 장점은
    //1. 메서드 이름을 짓는데 힘낭비 줄인다.
    //2. 메서드의 이름을 간결하게하여 오류를 줄일수잇다.
    // 즉, 메서드 오버로딩은 개발자로하여금 편하게 하게하기위해 존재하는기능
    // 메서드오버로딩의 적절한 기능으로는 뭔가 하는일은 같은데~(메서드 이름이 같으니) 입력되는 매개변수에 따라서 다른값을 리턴하거나 수행할때 사용하면좋다.
    // 위예제처럼 모두다 더하는 add역할을 하는함수인데 매개변수에따랏 ㅓ다른값을 리턴하므로 메서드 오버로딩 (Overloading)에 적절.

}