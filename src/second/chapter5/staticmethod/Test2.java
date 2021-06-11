package second.chapter5.staticmethod;

public class Test2 {
    String color;
    int door;
    static int width = 100;
    static int height = 200;

    public static void main(String[] args) {
        System.out.println(width);
        System.out.println(height);
        Test2 test2 = new Test2();
        test2.color = "red";
        test2.door = 2;
        System.out.println(test2);

        Test2 test3 = new Test2();
        System.out.println(Test2.width);
        System.out.println(Test2.height);
        test3.color = "black";
        test3.door = 4;
        System.out.println(test3);
        System.out.println(test3.printColorAndDoorCount());

    }

    @Override
    public String toString() {
        return String.format("color : %s, door : %d\n", color, door);
    }
    //인스턴스멤버는 이미 스태틱 멤버들 모두 존재할떄미으로 사용가능
    String printColorAndDoorCount(){
        System.out.println("calculateSize() = " + calculateSize());
        System.out.println("height = " + height);
        return String.format("color : %s, door : %d\n", color, door);
    }
    // static멤버는 인스턴스 멤버사용불가, static멤버는 클래스 로드될때, 인스턴스 멤버는 인스턴스 생성될때 생서됨
    // 스태틱멤버 사용될때 인스턴스 멤버없을수도있으므로 사용불가 사용하려면 인스턴스 스태틱 내부에서 생성해라..
    static int calculateSize(){
        return width * height;
    }

    // 어? 인스턴스 멤버 사용안하네? -> static을붙여야함 일반적으로..
    int calculateSize2(){
        return width * height;
    }
}
