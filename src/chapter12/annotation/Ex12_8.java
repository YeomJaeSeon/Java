package chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "false",testTools = {"JUnit1", "JUnit2"}, testDate = @DateTime(yymmdd = "160101", hhmmss = "235959")) // 애너테이션적용할땐 요소들 값을 지정해줌. default는안해도됨.
public class Ex12_8 {
    public static void main(String[] args) {
        Class<Ex12_8> cls = Ex12_8.class;

        TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
        System.out.println(anno.testedBy());
        System.out.println(anno.testDate().yymmdd());
        System.out.println(anno.testDate().hhmmss());

        for (String str : anno.testTools()) {
            System.out.println(str);
        }

        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();
        for (Annotation a : annoArr) {
            System.out.println(a);
        }


    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    int count() default 1;
    String testedBy();
    String[] testTools() default {"JUnit", "Junit5"};
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@ interface DateTime{
    String yymmdd();
    String hhmmss();
}

enum TestType {FIRST, FINAL }