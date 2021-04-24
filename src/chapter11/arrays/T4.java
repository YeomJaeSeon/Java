package chapter11.arrays;

import chapter5.Array;

import java.util.Arrays;

public class T4 {
    public static void main(String[] args) {
        //Arrays클래스는 Math클래스와같이 모든 메서드들이 static으로 되어있음 아니 멤버들이
        // 그래서 인스턴스릉 생ㅅ어할 필요가없기에 생성자는 private으로 되어있다.
        int[] arr = {1, 2, 3, 4, 5};

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOf(arr, 10);
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

        int[] arr5 = Arrays.copyOfRange(arr, 1, 5);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        // deepcopy임
        arr5[0] = 100;
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr = " + Arrays.toString(arr));
        
        int[] arr10 = new int[10];
        Arrays.fill(arr10, 9999);
        System.out.println("Arrays.toString(arr10) = " + Arrays.toString(arr10));
        // 9999로 채움.
        int[] arr11 = new int[11];
        Arrays.setAll(arr11, (i) -> (int)(Math.random() * 45) + 1);
        System.out.println("Arrays.toString(arr11) = " + Arrays.toString(arr11));
        // Arrays클래스를 통한 배열채우기 fill, setAll

        Arrays.sort(arr11);
        System.out.println("Arrays.toString(arr11) = " + Arrays.toString(arr11));

        int i = Arrays.binarySearch(arr11, 21);
        System.out.println("i = " + i);
        // 암튼 Arrays의 bs메서드는 정렬이되어있어야함. BS는 당연히 정렬이되어있어야함.

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 50};

        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));



    }
}
