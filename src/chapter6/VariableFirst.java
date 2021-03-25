package chapter6;

class InitTest1{
    int x;
    int y = x;
    //멤버변수인 인스턴스변수나 뭐 클래스변수는 초기화안해도 자동적으로 초기화됨.
    {
        x = 10;
        System.out.println(" 인스턴스 초기화 블럭 {}");
    }

//    void method1(){
//        int i;
//        int j = i; // 지역변수는 무조건 초기화해줘야함
//    }
}

public class VariableFirst {
    public static void main(String[] args) {

    }
}
