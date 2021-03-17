package chapter6;

import java.util.Arrays;

class Tv4{
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelDown(){
        --channel;
    }
    void channelUp(){
        ++channel;
    }
}

public class TvTest4 {
    public static void main(String[] args) {
        Tv4[] tvArr = new Tv4[3]; // 배열에 객체를 저장하겠다는 배열만 선언하고 생성한거다. 객체를 초기화한게아니니 배열내부엔 null로 초기화되어있음.
        // 배열에 객체를 저장하겠다는 배열만 선언하고 생성한거임.
        int[] numArr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numArr));

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv4();
            tvArr[i].channel = i + 10;
        }
        for(int i = 0; i < tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
        }

        Tv3[] tv3Arr = new Tv3[5]; // 5개의 길이인 배열생성하고 참조변수가 배열 주소 담고있음. 배열 내부엔 null값이있음(초기화안햇으니)
        // 객체를 할다애서 각 배열을 초기화해야함

        tv3Arr[0] = new Tv3();
        tv3Arr[1] = new Tv3();
        tv3Arr[2] = new Tv3();
        tv3Arr[3] = new Tv3();
        tv3Arr[4] = new Tv3();

        tv3Arr[0].channel = 100;
        tv3Arr[0].channelDown();
        System.out.println(tv3Arr[0].channel);
    }
}
