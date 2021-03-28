package chapter7;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Math.*;
// static import static메서드를 바로그냥 사용가능.

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        DeckTest deck1 = new DeckTest(); // 같은 패키지에속하는 클래스는 import필요없다.

        SimpleDateFormat date = new SimpleDateFormat("yyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 : " + date.format(today));
        System.out.println("지금 시간은 : " + time.format(today));

        round(10);
    }
}
