package chapter6;

public class BlockTest {
    static{
        System.out.println("static { } : 클래스초기화블럭 호출");
    }
    {
        System.out.println("{ } : 인스턴스 초기화 블럭 호출");
    }
    public BlockTest(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        BlockTest b = new BlockTest();

        BlockTest b2 = new BlockTest();
    }
}
