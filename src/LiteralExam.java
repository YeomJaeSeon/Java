public class LiteralExam {
    public static void main(String[] args){
        float pi = 3.14F;
        double piDouble = 3.14;

        int octNum = 010;
        int hexNum = 0X17;
        int binNum = 0b101;

        System.out.println(binNum);

        char ch = 'J'; // 하나의 문자는 작은따음표
        String name = "Java"; // 두문자이상의 문자열은 큰따음표 -> 이게 문자열 리터럴

        String soccerTeam = ""; // 문자열은 문자열리터럴안에 아무문자가 없어도된다.
//        char soccerTeamRate = ''; 문자에는 문자리터럴 ''안에 최소 하나의 문자가있어야한다.

//        String은 클래스임(자바에서) 그러므로 아래와같이 new연산자로 String클래스의 객체를 생성하는게 적절하나 위와같이 new연산자 사용안해도됨.
//        참조타입이 String이겠다. primitive type이외엔 전부 참조타입이니 이것도 String클래스가 타입인 참조타입 변수 mywifeName이겠당..
//        String myWifeName = new String("Angellina jollie"); // 이런식으로 String객체를 생성하는 new 키워드로 String생성
        String myWifeName = "Angellina jollie";
        System.out.println(myWifeName);

        String myName = "염재"+"선임니다";
        String myIntroduction = myName + 26;
        System.out.println(myIntroduction);

//        기본형타입을 문자열로 변환하는법
        System.out.println("" + 7 instanceof String);
    }
}
