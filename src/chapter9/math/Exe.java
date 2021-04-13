package chapter9.math;

import static java.lang.Math.PI;

public class Exe {
    public static void main(String[] args) {
        int x1= 1, y1 = 1;
        int x2 = 2, y2 = 2;

        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
        double a = c * Math.sin(PI / 4);
        double b = c * Math.cos(PI / 4);
    }
}
