package chapter9.practice;

public class Num5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
    public static int count(String src, String target) {
        int count = 0; // 찾은 횟수
        int pos = 0; // 찾기 시작할 위치

        // String 클래스의 indexOf메서드는 해당 문자나 문자열의 위치를찾으면 인덱스 리턴
        // 없으면 -1리턴
        for(int i = 0; i < src.length(); i++){
            int position = src.indexOf(target, pos);
            if(position != -1){
                pos = position + 1;
                ++count;
            }
        }
        return count;
    }

}
