package chapter9.practice;

public class Num10 {

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0)); // 왼쪽 정렬
        System.out.println(format(str,7,1)); // 가운데 정렬
        System.out.println(format(str,7,2)); // 오른쪽 정렬
    }
    static String format(String str, int length, int alignment){
        if(length < str.length()){
            return str.substring(0, length);
        }
        char[] charArr = new char[length];
        for(int i = 0; i <charArr.length; i++){
            charArr[i] = ' ';
        }
        if(alignment == 0){
            System.arraycopy(str, 0, charArr, 0, str.length());
        }else if(alignment == 1){
            System.arraycopy(str, 0, charArr, length / 2, str.length());
        }else{
            System.arraycopy(str, 0, charArr, length - str.length(), str.length());
        }
        return str;

    }
}
