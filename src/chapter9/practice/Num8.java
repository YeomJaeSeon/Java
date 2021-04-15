package chapter9.practice;

public class Num8 {
    static double round(double d, int n){
        double v = d * Math.pow(10, n);
        double round = Math.round(v) / Math.pow(10, n);
        return round;
    }
    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));

    }
}
