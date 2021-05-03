package chapter12.createanno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 에너테이션 사용하는법은 많이해봐서알아. 그런데 생성하는법은 첨해봄
@ResponseBody(count = 1, types = {"HTML", "TEXT", "JSON"}, direction = Direction.SOUTH, dateTime = @DateTime(yymmdd = 210503, hhmmss = 202030))
public class AnnoTest {
    public static void main(String[] args) {
        Class<AnnoTest> annoTestClass = AnnoTest.class;

        ResponseBody anno = (ResponseBody) annoTestClass.getAnnotation(ResponseBody.class);
        System.out.println(anno.count());
        System.out.println(anno.dateTime());
        System.out.println(anno.dateTime().hhmmss() +" " + anno.dateTime().yymmdd());
        System.out.println(anno.direction());

        String[] types = anno.types();
        for (String type : types) {
            System.out.println(type);
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface ResponseBody{
    int count ();
    String name () default "Hello";
    String[] types () default {"HTML", "API"};
    Direction direction (); // Enum
    DateTime dateTime(); // 다른 애너테이션

}
// 애너테이션 요소는 추상메서드로.. 인터페이스 와 거의비슷함. 만드는법이.
@interface DateTime{
    int yymmdd ();
    int hhmmss();
}
enum Direction { EAST, SOUTH, WEST, NORTH}
