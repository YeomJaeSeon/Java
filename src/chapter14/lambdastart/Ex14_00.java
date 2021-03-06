package chapter14.lambdastart;

public class Ex14_00 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b
        // 람다식은 메서드(함수) 식으로 간단하게 표현한것
        //메서드 : 클래스에 종속적 (객체지향 용어)
        // 함수 : 클래스에 독립적
        // 람다식은 타입과 함수이름을 생략하여 메서드를 간단하게하는데
        // 익명함수이다.
        // 사실 익명 객체읻.
        // java에선 함수나 메서드가 독립적으로 존재불가
        // 클래스내에 메서드가존재하고객체를 생성하여 참조변수로 해당 메서드에 접근해서 사용함.  java는
        // 그래서 메서드를 사용하려면 무조건 클래스와 객체를 생성해야함
        // 람다식도 사실 익명 객체이다.
        //익명객체이므로 '객체', 참조변수를 통해서 멤버에 접근해야한다.
        // 참조변수는뭘로..?
        // 함수형인터페이스
        Object obj = new Object(){
            int max(int a, int b){
                return a > b ? a : b;
            }
        }; //익명클래스 - 클래스선언과 객체생성 동시(일회용)
        // 이 익명객체가 바로 람다식
        // 그런데 이 멤버인 메서드 max에 어떻게접근하지?
//        System.out.println(obj.max(1, 5)); // Object에는 max리모컨이없음
        //참조변수 형변환해줘야하는데 핡수가없음..
    }
}
