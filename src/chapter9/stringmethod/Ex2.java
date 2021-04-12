package chapter9.stringmethod;

import java.util.StringJoiner;

public class Ex2 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(","); // 문자열을 배열로 구분자를통해서 split!

        System.out.println(String.join("-", arr));

        // 배열을 문자열로 합치기! join말고 StringJoiner를 이용.
        StringJoiner sj = new StringJoiner("/","[","]");
        for (String s : arr) {
            sj.add(s);
        }
        System.out.println(sj);
    }
}
