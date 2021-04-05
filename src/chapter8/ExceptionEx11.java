package chapter8;

public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException(); //예외 일부러 만들었는데 컴파일이 또잘되네.. 왜이러지
        // 이건 unchecked예외라서그럼 프로그래머에 의해서발생할수있는 예외들은 예외처리를 강제하지않는다.
        // 그러나 그전과같이 사용자에의해서발생할수있는 예외는 예외처리를 강제한다. 이걸 checked예외라고한다.
    }
}
