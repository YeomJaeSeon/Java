package second.chapter5.staticmethod;

class MyMath{
    long a, b;

    long add(){
        return a + b;
    }
    long subtract(){
        return a - b;
    }

    // 인스턴스 멤버를 사용하지않아! - static붙여
    static long add(long a, long b){
        // static에서는 인스턴스 멤버사용 불가
        MyMath math = new MyMath();
        math.add(); // 사용하려면 인스턴스를 직접 생성해야함. 인스턴스멤버를 static내에서 사용하려면
        return a + b;
    }
    static long subtract(long a, long b){
        return a - b;
    }
}

public class Test {
    public static void main(String[] args) {
        long addResult = MyMath.add(1L , 2L);
        long subtractResult = MyMath.subtract(10L, 3L);
        System.out.println("addResult = " + addResult);
        System.out.println("subtractResult = " + subtractResult);

        MyMath math = new MyMath();
        math.a = 200L;
        math.b = 300L;
        long add = math.add();
        long subtract = math.subtract();
        System.out.println(add);
        System.out.println(subtract);
    }
}
