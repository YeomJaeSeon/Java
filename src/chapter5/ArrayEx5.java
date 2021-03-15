package chapter5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0F;

        // 배열선언 int[] score(실제 배열 메모리공간 주소 저장할 메로리 생성, : 참조변수임 score는
        // 생성 new int[] : 실제로 저장될 메모리공간 생성(길이는 초기화를 해서 생략)
        // 초기화 {~ } 값을 초기화.
        int[] score = new int[]{100, 80, 100, 100, 90};
        // int[] score = {100, 80 ~ };
        // 배열의 길이는 int 양, 0도됨
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

        int[] arr = new int[0];
        int[] arr2 = {};
        int[] arr3 = new int[]{};
        System.out.printf("길이가 0인 녀서들이 진짜 0인지볼까? %d %d %d %n", arr.length, arr2.length, arr3.length);
    }
}
