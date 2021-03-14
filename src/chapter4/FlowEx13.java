package chapter4;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
            System.out.printf("1부터 %2d까지의 합 : %d%n", i, sum);
        }

        for(int i = 1, j = 10; i <= 10; i++, j--){
            System.out.printf("%d \t %d%n", i, j);
        }
    }
}
