package chapter6;

public class StaticBLockTest {
    static int[] arr = new int[10]; //배열선언하고 생성만함 초기화를 안함. (자동으로 int라 0으로 각배열이초기화되어있긴한데.)

    static{
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        // static변수, 클래스변수는 이렇게 클래스 초기화블럭으로 복잡한 클래스변수의 초기화를 가능하겧ㅁ
        // 클래스 초기화블럭은 클래스변수초기화
    }

    public static void main(String[] args) {
        // 클래스변수이므로 거 인스턴스 생성할필요없다.
        for(int value : StaticBLockTest.arr){
            System.out.println(value);
        }
    }
}
