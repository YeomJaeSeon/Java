package restudy;
class Data{
    int x;
}
public class PrimitiveRe {
    public static void main(String[] args) {
        int[] x = {10};

        System.out.println("main : " + x[0]);

        change(x); // 배열의 주소를 가지고있는 ref변수

        System.out.println("after : " + x[0]);
    }
    static void change(int[] d){
        d[0] = 100;
        System.out.println("change : " + d[0]);
    }
    // 메인 메서드에서 x배열의 주소가 change의 d로 복사가됨. 그닌까 두개의 ref변수가 같은 주소를 가지고있고 같은 배열을 가르키고있음
    // change 메서드 끝나면 콜stack에서 pop되서 사라지지만 값은 그래도 변경된상태로 유지되어있음.
}
