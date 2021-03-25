package chapter6;

public class InstanceBlock {
    int count;
    int serialNum;
    String color;
    String geraType;

    InstanceBlock(){
        System.out.println("생성자");
        color = "red";
        geraType = "auto";
    }
    InstanceBlock(String color, String geraType){
        System.out.println("생성자");
        this.color = color;
        //this.는 인스턴스 자신을 가르키는 참조변수이다.
        this.geraType = geraType;
    }
    {
        System.out.println("{ }");
        ++count;
        serialNum = count;
    }
    // 중요한건 인스턴스 초기화블럭을 ㅇ용하면 객체지햐읖로그래밍의 장점인 코드의 재사용, 유지보수, 중복된코드의 제거 를 해결할수잇다.
    // 이렇게 인스턴스 변수 초기화하는 생성자들이 공통으로사용하는 로지긍ㄹ 인스턴스 초기호블럭에서사요앟면..
    // 인스턴스초기화블럭 호출-> 생성자 호출 잊지말자.

    public static void main(String[] args) {
        InstanceBlock instance1 = new InstanceBlock();
        System.out.println(instance1.count + ", " + instance1.serialNum + ", " + instance1.color + ", " + instance1.geraType);

        InstanceBlock instance2 = new InstanceBlock("black", "not auto");
        System.out.println(instance2.count + ", " + instance2.serialNum + ", " + instance2.color + ", " + instance2.geraType);
    }
}
