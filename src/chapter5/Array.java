package chapter5;

public class Array {
    public static void main(String[] args) {
        int[] score = new int[5];
        //배열 생성은 int score[] = new int[5]; 이렇게 해도되지만. int[] score이 더적절한듯. score은 참조변수 ref을 가질 변수이므로.(배열의)
        /*
        1. 배열 주소를 가질 score 참조변수 생성
        2. 배열이 실제 저장될 int 5개의 공간 생성
        3. default로 0으로 초기화(모든공간)
        4. score참조변수가 배열의 주소를 갖게됨.
         */
        System.out.println(score);
        for(int tmp : score){
            System.out.println(tmp);
        }

        score[3] = 100;
        System.out.println(score[3]);
        int value = score[3];
        System.out.printf("%d %d %n", score[3], value);

        for(int i = 0; i < 5; i++){
            System.out.println(score[i]);
        }
    }
}
