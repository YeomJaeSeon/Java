package chapter8.practices.practice1;


import java.util.Scanner;

//8번
public class Practice1 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기 위한 변수

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력해라 :");
            try{
                input = new Scanner(System.in).nextInt();
            }catch (Exception e){
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                continue;
            }
            if(answer > input) {
                System.out.println("더 큰수를 입력해라 .");
            } else if(answer < input) {
                System.out.println("더 작은수를 입력해라 .");
            } else {
                System.out.println("맞췄습니다 .");
                System.out.println("시도횟수는 "+count+"번입니다..");
                break; // do-while문을 벗어난다
            }
        } while(true); // 무한반복문

    }
}
/*
1. 예외처리란 예외가 발생할수도 있는 코드에 대비하는 것이고 목적은
예외가 발생해 프로그램이 비정상적으로 종료한는걸막아 정상적으로 동작하게끔하는데있다.

2.
d 메서드 1이 메서드2를 호출함.

3.
오버라이딩 규칙
1. 접근제어자 더좁을수없음
2. 예외 더많을수없음(예외 상속관계고려)

d - Exception은 예외 최고조상 클래스
e - NumberException은 오버라이딩할 메서드에 선언한 예외의 부모이므로 안됨.

4.
c. 뒤의 catch문은 unreacheable

5.번
1
3
5
6 // 6실행안됨. return;문때문에 finally는 실행되지만 fianlly문끝나면 메서드나가버림.
1
2
5
6

try문에서 예외발생하면 catchㅁ누하나씩돌면서 instacneof로 true인 catch문에가고 끝나면 finally
하고 예외처리되면 정상종료.. finally는 return;해도 동작

6.번
3
5

답안 : method2에서 예외발생 -> method1에서 예외를 받았음. 그런데 처리할 catch문존재 X 그래도여기서
finally문은 실행되고 예외를다시 호출한 메서드로던짐!! (main) 여기서 처리할 catch문이있으므로 여기서
// 받은 예외를 처리한다.. 결국 정상적으로 프로그램종료

(이거 헷갈린다. unchecked예외라 throws 안해준거는 알겠고.. method1에서 catch못해서 예외처리못했으면
main에 예외 던지는데 그럼method1의 finally와 try-catch밖의 문장은 main에서 예외처리 되고실행되나?

7번 - System.exit(0) 프로그램 정상종료라는데 이거 예외발생한건가?
1
 System.out(0)은 프로그램 즉시종료롤 finally도 실행안됨(return;)은 finally실행됬었다.

8번

 */