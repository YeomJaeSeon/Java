package chapter11.arrays;

import java.util.Arrays;

public class TEst1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = Arrays.copyOf(arr, 5);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        
        arr[0] += 10;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] arr4 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Arrays 메서드중 deeptoSTring, deepEquals는 다차원배열에 대해서
        System.out.println("Arrays.deepToString(arr3) = " + Arrays.deepToString(arr3));
        System.out.println("Arrays.deepEquals(arr3, arr4) = " + Arrays.deepEquals(arr3, arr4));


    }
}
