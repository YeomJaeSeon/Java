package chapter6;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 1, 5, 4};
        printArr(array);
        sortArr(array);
        printArr(array);
        System.out.println("sum : " + sumArr(array));

    }
    static void printArr(int[] arr){
        for(int value : arr){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
    static int sumArr(int[] arr){
        int sum = 0;

        for(int value : arr){
            sum += value;
        }
        return sum;

    }
    static void sortArr(int[] arr){
        // reference인 arr은 인자로받으니 배열의 주소를 받아서 직접 배열을 정렬하는것임.
        //bubble sort
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
