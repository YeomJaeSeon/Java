package chapter6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10}; // 크기가 1인 배열. arr변수는 당연히 ref변수고 배열의 주소를 가지고있음.
        
        System.out.println("main : "+ arr[0]); // 10
        
        change(arr); // 배열의 주소를 넘기는거임 arr는 ref변수닌까
        System.out.println("변경후 main : " + arr[0]); // 20
        
    }
    static void change(int[] array){
        array[0] = 20;
        System.out.println("change : " + array[0]);
    }
}
