package chapter9.practice;

public class Num11 {
    public static void main(String[] args) {
        printGugu(3, 5);
    }
    static void printGugu(int a, int b){
        for(int i = a; i <= b; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d + %d = %d%n", i, j, i * j);
            }
        }
    }
}
