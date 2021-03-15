package chapter5;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 배열의 복사 값복사, 주소복사로 복사해보자.
        int[] arr = {1, 2, 3, 4, 5};
        int[] tmp = new int[arr.length * 2];// 초기화는안하고 생성까지만함. 배열의 길이는 arr길이의 2배인데 0으로 초기화되어있음(int 기본값이 0이므로)

        for(int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }
        arr = tmp;

        System.out.println(arr.length);
        System.out.println(tmp.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
