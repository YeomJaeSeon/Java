package chapter6;

public class BlockTest2 {
    static int[] arr = new int[10];
    int number;
    String color;
    static{
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100) + 1;
        }
    } // 클래스 최기화 블럭 - 한번ㅁ나호출(클래스가 메모리위에 올라가ㅓㅅ 생성될떄)
    {
        number = 100;
        color = "red";
    } // 인스턴스 초기화블럭 - 인스턴스변수초기화 -> 인스턴스 생성될때마다 호출됨. 그런데 생성자랑똑같네? 노노 생성자보다 먼저호출됨
    //인스턴스초기화블럭은 인스턴스 변수 초기화하는데 사용되는데 복잡한 인스턴스변수 최고하에사용됨. 그렇다고 생성자와가탼? ㄴㄴㄴ
    // 생성자보다 먼저호출됨
    BlockTest2(){

    }

    BlockTest2(int number, String color){
        this.number = number;
        this.color = color;
    }
    BlockTest2(BlockTest2 another){
        this(another.number, another.color);
    }

    public static void main(String[] args) {
        for(int i =0 ; i< BlockTest2.arr.length; i++){
            System.out.println("arr[" + i + "] :" + BlockTest2.arr[i]);
        } // 이렇게 클래스변수는 클라스 이름으로 접근간으하고 인스턴스 생성과 상관없다이말이야 메모리위에 클래스가 올라가면 생성이되기 때문이제~

        BlockTest2  b1 = new BlockTest2();
        System.out.println(b1.number + b1.color);
        // 인스턴스 초기화블럭에의해서 인스턴스 변수가 초기화딤
        
        //이렇게 변수 명시적으로 최과하근앟지만 이건 기본적인거고 초기화블럭을 이용하면 복잡한 인스턴스변수와 클래스변수 초기화가 가느앟다
        // 참고로 클래스 초기화블럭은 단한번, 인스턴스초기화블럭은 인스턴스 생성될때마다 호출이되서 각변수 초기화하고
        // 생성자보다 인스턴스 초기화블럭이 먼저호출된다는점 ! 기어갛자



    }
}
