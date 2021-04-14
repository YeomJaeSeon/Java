package chapter9.util;

public class RandomEx3 {
    public static void main(String[] args) {
        for(int i = 0; i < 10;i++){
            System.out.println(getRand(5, 10) + ",");
        }
        System.out.println();

    }
    public static int getRand(int from, int to){
        return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
    }
}
