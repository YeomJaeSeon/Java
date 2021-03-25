package chapter6;

// 클래스변수와 인스턴스 변수의 차이를 보자
public class DocumentTest {
    static int count = 0;
    String name;

    DocumentTest(){
        this("재목없음" + ++count); // 매개변수없는 생성자호출할때마다 클래스변수는 1씩증가함.
    }
    DocumentTest(String name){
        this.name = name;
        System.out.println(name + "이 생성되었습니다.");
    }

    public static void main(String[] args) {
        DocumentTest document = new DocumentTest();
        DocumentTest document2 = new DocumentTest("java.txt");
        DocumentTest document3 = new DocumentTest();
        DocumentTest document4 = new DocumentTest();
    }
    // 이 예제는 클래스변수와 인스턴스변수의차이를 알아보는 예제
    // 클래스변수는 메모리위에 클래스가 올라갈대 한번만 생성됨
    // 인스턴스변수는 인스턴스 생성될때마다 호출이됨.
    // 그래서 count는 증가된 상태임 계속.. instance변수로했으면 인스턴스 생성될때마다 0으로 초기화된당.
    // 클래스변수 : 기본값 -> 명시적 -> 클래스초기화블럭
    // 인스턴습녀수 : 기본값 -> 명시적 -> 인스턴스초기화블럭 -> 생성자
}
