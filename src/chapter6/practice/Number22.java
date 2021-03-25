package chapter6.practice;

public class Number22 {
    static boolean isNumber(String checkString){
        for(int i = 0; i < checkString.length(); i++){
            if(checkString.charAt(i) < '0' || checkString.charAt(i) > '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+" 는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+" 는 숫자입니까? ? "+isNumber(str));
    }
}
