package chapter9.practice;

public class Num12 {
    public static void main(String[] args) {
        for(int i=0; i< 20; i++)
            System.out.print(getRand(1,-3)+",");

    }
    static int getRand(int from, int to){
        int range = 0;
        int min = Math.min(from, to);
        int max = Math.max(from, to);
        // 부호다르면
        if(from * to < 0){
            range = Math.abs(min) + max + 1;
        }else{
            //부호같으면
            if(from == 0 && to == 0)
                return range;
            range = Math.abs(min + max) + 1;
        }
        return (int)(Math.random() * range) + min;
    }
}
