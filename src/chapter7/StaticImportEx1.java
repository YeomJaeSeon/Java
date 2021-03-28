package chapter7;

//static import문으로 static멤버만호출해서 간단하게된다.
// 다른패키지 클래스 import 패키지다르면 이렇게 import해서 해당클래스의 패키지가 무엇인지 컴파일러에게 알려줘야함
//해당 패키지의 모든 클래스 import할라면
import restudy.*;

import static java.lang.Math.*;
import static java.lang.System.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        out.println("static import 하이");

        out.println((int)(random() * 10));

        out.println("Math.PI : " + PI);

        ConstructorEx c1 = new ConstructorEx();

        SuperClassTest s1 = new SuperClassTest();
        //그치만 같은 패키지의 클래스는 import하지않아도됨. 왜냐면 클래스의 풀네임이 패키지가 포함되어있으므로
        //같은 패키지의 클래스는 컴파일러가 안다~
    }
}
