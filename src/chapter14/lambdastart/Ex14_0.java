package chapter14.lambdastart;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b // 람다식 - 익명객체(익명함수아님.)
    Object obj = new Object(){
        int max(int a, int b){
            return  a > b ? a : b;
            }
        };
//    int value = obj.max(3, 5); // 함수형인터페이스가 필요하다. 뭐 리모컨에 max가 없어
    // Object타입의 참조변수로는 max에 접근할수가없음. 실제로 익명 객체가 max라는 메서드를 가지고있어도
        // 참조변수가 리모컨에 버튼이없으니 접근할수가없음
        // 형변환을 해야겠다. 근데 익명객체인데 타입이 뭐야 뭘로 형변홚애ㅑ해
    }
}
