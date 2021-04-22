package chapter11.arrays;

import chapter5.Array;

import java.util.Arrays; // Arrays클래스는 배열을 다루느느데 유용한 여러 메서드를 제공함
// Math와 같이 메서드드링 static으로 되어있음!

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));
        // 2차원이상 다차우너배열에 대해선 Arrays
        
        // Arrays클래스의 static메서드인 copyOf나 copyOfRange메서드는 새로운 배열을 만듬. 즉 deepcopy를함.
        int[] arr2 = Arrays.copyOf(arr, 2);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr, 7);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr4));
        int[] arr5 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOfRange(arr, 1, 7);
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 10);
        System.out.println("Arrays.toString(arr7) = " + Arrays.toString(arr7));
        int[] arr8 = new int[10];
        Arrays.setAll(arr8, (i) -> (int)(Math.random() * 5) + 1);//파라미터 람다식을 넣어야함
        System.out.println("Arrays.toString(arr8) = " + Arrays.toString(arr8));

        for (int i : arr8) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
            // String -> charArr
        }

        // String -> char Arr
        String s = "abcdefg";
        char[] chars = s.toCharArray();
        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
        //char arr -> String
        String charArrToString = new String(chars);
        System.out.println("charArrToString = " + charArrToString);
        System.out.println(charArrToString instanceof String);
        
        char[] charArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(charArr);
        System.out.println("s1 = " + s1);
        
        String[][] str2D = {
                {"aaa", "bbb"},
                {"AAA", "BBB"},
        };
        String[][] str2D2 = {
                {"aaa", "bbb"},
                {"AAA", "BBB"},
        };

        System.out.println("Arrays.deepEquals(str2D, str2D2) = " + Arrays.deepEquals(str2D, str2D2));
        // 2차원 배열에 대해선 Arrays클래스의 deepEquals나 deepToString메서드를 사용해야 정확한 결과가나옴
        
        char[] charArr2 = {'a', 'd', 'b', 'c', 'f'};
        Arrays.sort(charArr2);
        System.out.println("Arrays.toString(charArr2) = " + Arrays.toString(charArr2));

        System.out.println("Arrays.binarySearch(charArr2, 'c') = " + Arrays.binarySearch(charArr2, 'c'));
        // Arrays 클래스의 birnaySearch메서드는 정렬부터해야 정확한값이나옴, BS는 정렬이 기본.

    }
}
