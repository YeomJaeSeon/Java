package chapter2;

public class VarEx2 {
    public static void main(String[] args){
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println(x);
        System.out.println(y);


        tmp = x;
        x = y;
        y = tmp;
        System.out.println(x);
        System.out.println(y);

        double headNumber = .1415;
        System.out.println(headNumber);
    }
}
