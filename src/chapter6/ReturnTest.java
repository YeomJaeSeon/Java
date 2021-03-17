package chapter6;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);

        System.out.println(result); //8

        int[] result2 = {0};
        r.add(3, 5, result2);
        System.out.println(result2[0]); // 8

    }
    int add(int a, int b){
        return a + b;
    }
    void add(int a, int b, int[] arr){
        arr[0] = a + b;
    }
}
