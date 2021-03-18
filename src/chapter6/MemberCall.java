package chapter6;

// 클래스내의 멤버끼리의 호출
// 결론부터 말하면 인스턴스멤버는 클래스 멤버 호출가능하지만
// 클래스 멤버는 인스턴스 멤버 호출할수없다. 클래스멤버는 인스턴스 생성상관없ㄴ지만 인스터스멤버는 인스턴스가 생성되야 존재하므로
//클래스 멤버가 인스턴스 멤버 호출할때 인스턴스 멤버가 존재하지 않을수도 있기 때문이다.

// 클래스멤버는 클래스 변수, 클래스 메서드(static변수 static메서드라고도함.)




public class MemberCall {
    int iv = 10; // 인스턴스 변수
    static int cv = 20; // static변수 - 클래스변수

    int iv2 = cv; // 인스턴스변수에 static변수 넣는건가능
    //static int cv2 = iv; //이건에러임. static변수에 인스턴스 변수넣는건 에러

    static int cv2 = new MemberCall().iv; // 객체를 생성, 즉 인스턴스를 생성해야만 클래스 변수에 인스턴습ㄴ수값넣을수잇음.
    // 클래스변수가 인스턴스 변수호출할때 인스턴스 가 생성되지않아 인스턴스 변수가 없을수도있으므로 에러가나는건데 이렇게 객체, 인스턴스 생성하면 에러안남.

    static void staticMethod(){
        System.out.println(cv);
//        System.out.println(iv); 당연히에러임 . static에서 인스턴스는 호출불가
        System.out.println(new MemberCall().iv); // 인스턴스를 생성하면 인스턴스 변수 호출가능해.
    }

    // static이 없으므로 인스턴스 메서드 - 인스턴스 생성되야만 존재
    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); //인스턴스 메서드는 당연하게! 둘다 접근가능
    }
    static void staticMethod2(){
        staticMethod();
//        instanceMethod1(); 클래스 메서드가 인스턴스 메서드 호출불가, 클래스 메서드가 호ㅊㄹ할대 인스턴스 생성안되서 업승ㄹ수도잇으므로
        new MemberCall().instanceMethod1(); // 인스턴스 생성하면 static메서드에서 인스턴스 메서드 호출가능
    }
    void instanceMethod2(){
        staticMethod2();
        staticMethod();

        instanceMethod1(); // 인스턴스 메서드에선 뭘 아무것나 호출가능
        //인스턴스 생성될 당시엔 당연히 메모리에 클래스가 올라가서 static(클래스 메서드)가 생성되어있으므로 호출가능함.
    }
}
