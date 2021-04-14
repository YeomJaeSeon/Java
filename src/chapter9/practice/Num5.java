package chapter9.practice;

public class Num5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
    public static int count(String src, String target) {
        int count = 0; // 찾은 횟수
        int pos = 0; // 찾기 시작할 위치
        for(int i = 0; i <src.length(); i++){
            int j = src.indexOf(target, pos);
            if(j != -1) {
                ++count;
                pos += target.length();
            }else
                break;
        }
        return count;
    }

}
