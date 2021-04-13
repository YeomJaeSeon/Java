package chapter9.wrapper;

// 오토박싱 , 언박싱
// 오토박싱 : 기본형 -> 래퍼클래스 타입객체
// 언박싱 : 래퍼클래스 객체 -> 기본형
public class Ex3 {
    public static void main(String[] args) {
        int i = 10;
        Integer intg = (Integer) i; // 안해도도미
        Integer intg2 = i; // 기본형을 래퍼클래스 객체로 오토박싱
        Object object = (Object) i;

        Long lng = 100L;
        int i2 = intg + 10;
        long l = intg + lng; // 
    }
}
