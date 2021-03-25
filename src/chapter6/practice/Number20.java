package chapter6.practice;

public class Number20 {
    // 인스턴스와 상관없는 static 클래스메서드로해야함~
    static int[] shuffle(int[] arr){
        for(int i = 0; i < 100; i++){
            int changeIdx = (int)(Math.random() * arr.length);
            int tmp = arr[0];
            arr[0] = arr[changeIdx];
            arr[changeIdx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        {
            int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(java.util.Arrays.toString(original));
            //같은클래스늰까 클래스.클래스메서드로안해도댐~
            int[] result = shuffle(original);
            System.out.println(java.util.Arrays.toString(result));
        }
    }
}
