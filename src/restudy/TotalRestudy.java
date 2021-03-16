package restudy;

import chapter5.Array;

import java.util.Arrays;
import java.util.Scanner;

// 1 ~ 5 chapter 복습시간!
public class TotalRestudy {
    public static void main(String[] args) {
        String[] players = new String[]{"박지성", "호날두", "메시", "손흥민"};
        String[] friends;
        friends = new String[]{"박지성", "손흥민"};
        String[] foods = {"라면", "바나나", "사과"};

        System.out.println(Arrays.toString(friends));

        char[] charArr = players[0].toCharArray();
        for(char value : charArr) System.out.println(value);

        int i = 100;

        final double PI = 3.14141523; // 상수 - final 키워드사용 - 상수는 한번밖에 저장할수없는 메모리공간. 선언과동시에 초기화해야하는게 특징!

        System.out.printf("%b %d %f%n", true, i, PI);
        // printf는 출력의 형태를 변환가능. 위는 지시자 복습한거고 변환해볼까?

        System.out.printf("%o %x%n", i, i);

//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        int stringToInteger = Integer.parseInt(inputString);
//        System.out.printf("문자열 int로변경 결과 : %d%n", stringToInteger);

        //반올림
        Scanner scanner = new Scanner(System.in);
        // 둘째자리에서 반올림 , 무조건 세자리수이상수나와라.!
//        int n = scanner.nextInt();
//
//        double result = n * 0.01 + 0.5;
//        int realResult = (int)result * 100;
        // result(double)을 형변환하면서 소수점 자리를 모두 버려버려! 이게 특징


//        System.out.println(realResult);

        double d1 = 3.14;
        double d2 = 3.6;
        float f1 = 10.5F;

        System.out.printf("%d %d %d %n", (int)d1, (int)d2, (int)f1);
        // 무적건 실수를 정수로 형변환하면 소수점이하를 버려버린다.

        double d3 = 10.3F; // 이런게 auto casting - 타입불일치시킬때 타입일치시킴. 작은거 -> 큰거넣을수잇음.
        // 무조건 loss of data가 없는 방향으로 자동 형변환해줌.

        byte a = 100;
        byte b= 110;
        int sumthing = a + b;
        System.out.println(sumthing);
        
        int i1 = 100;
        long l1 = 300_000L;
        long sumthing2 =i1 + l1; // 피연산자간 타입이 다르다. 이럴땐 산술변환으로 타입이 같은 방향으로 변환. 당연히 큰쪽으로
        System.out.println(sumthing2);

        // 산술변환 특 1, 피연산자간 타입다를때 큰타입으로 형변환, 2. 피연산자들이 int보다 작으면 int로 형변환뒤 연산->연산결과도 당연 int겠당.
        // 산술, 비교(> , < >= <=), 삼항연산자의 두식(? a : b) 이런 녀석들도 산술변환이 적용됨

        //리터럴연산
        char c1 = 'a';
//        char c2 = c1 + 1;
        char c3 = 'a' + 1; // 이녀석이 리터럴연산 이건된다 위에건아노디고. 위에건 ㅅ나술변환으로int로 변환9char 는 int보다 작으므로, int르 ㄹchar에 넣으려닌/까
        // 에러발생 자명!
        //근데 아래건 자바 컴파일러가 자바인터프리터 실행전에 이미 값을 계산해서 c3에 넣어놓음.(변수가아닌 리터럴만 있을떈) 이렇게 리터럴연산이 가능함

        int[] scores = new int[]{1, 2, 3, 4, 5};
        System.out.printf("scores의 실주소는 아니지만 그래도 주소는 : %s%n", scores);
        int[] scores2 = {1, 2, 3, 4, 5};
        int[] scores3;
        scores3 = new int[]{1, 3, 5, 7, 9};// 선언 초기화 다로하려면 생성문이 있어야함. 생성문에 배열 길이는 생략해야함.

        System.out.println(Arrays.toString(scores3));// 배열으 ㅣ출력 Arrrays.toSTring으로 쉽게한다.

        int[] originArr = {10, 20, 30, 40, 50};
        int[] copyArr = new int[5];

        System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
        // 복사하긔 ^^
        System.out.println(Arrays.toString(copyArr));

        char[] charArr2 = {'a', 'b', 'c', 'd', 'e'};
        char[] charArr3 = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.arraycopy(charArr2, 0, charArr3, 0, charArr2.length);
        System.out.println(Arrays.toString(charArr3));

        // PI 3.141592반올림 소수점 둘쨰에서 반올림해보자.
        double PI2 = 3.161592;
        PI2 = (int)((PI2 + 0.05) * 10) / 10.0;
        System.out.println("소수점 둘쨰자리에섭 ㅏㄴ올림한 PI : " + PI2);

        String[] myFrinends = {"염재선", "강수호", "박용우", "김유성"};
        System.out.println(Arrays.toString(myFrinends));

        String[] yourFriends = new String[5];
        // ref타입 (String도 ref타입)의 기본형은 null이므로 null값을 가지고있음 .사실가지고있다도웃김 가르키고있음. STring도 ref타입이므로

        // char배열 vs String (String배열아님, String클래스임)
        String name = "Fernando Torres";
        char[] torresNameToCharArr = name.toCharArray();
        System.out.println(torresNameToCharArr); // char배열은 그냥 println으로찍으면 주소가나오는게아니라 다붙어져서나오네 ㅋㅋ

        char firstWord = name.charAt(0);
        System.out.println(firstWord); // Strinㅎ클래스의 인덱스에 해당되는 문자가져오기
        // 중요한건 String도 배열마냥 length메서드가있다.
        System.out.printf("토레스 공백포함 이름길이 : %d%n", name.length());
        System.out.printf("토레스 성만 뽑아오자 : %s%n", name.substring(0, 8));

        String name2 = "Fernando Torres";
        System.out.printf("둘 이름같냐? : %b%n", name.equals(name2));

        char[] name2ToCharArr = name2.toCharArray();
        System.out.println(Arrays.toString(name2ToCharArr));

        int[][] board = {
                {1, 2, 3},
                {3, 4, 5},
                {5, 6, 7},
                {7, 8, 9},
        };
        System.out.println("board의 row길이 : " + board.length + " board의 col의길이 : " + board[0].length);

        // 2차원배열 가변길이 - 아무리 2차원이든 3차원이던 다 타입이 같아야함 배열자체가 타입이 같은녀석들을 한묶음으로 묶은 잘구조이므로
        int[][] board2 = new int[3][];
        board2[0] = new int[10];
        board2[1] = new int[5];
        board2[2] = new int[8];

        for(int i5 = 0; i5 < board2.length; i5++){
            for(int j = 0; j < board2[i5].length; j++){
                System.out.print(board2[i5][j] +" ");
            }
            System.out.println();
        }
    }
}
