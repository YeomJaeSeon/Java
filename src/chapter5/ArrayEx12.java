package chapter5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"YEOM", "KIM", "PARK"};// String배열도 마찬가지로 생성 생략가능 new String[] 생략가능.
        for(int i = 0; i < names.length; i++){
            System.out.println("names["+i+"]:"+names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp:"+tmp);

        names[0] = "YOON";

        for(String str : names)
            System.out.println(str);
        // String배열도 다른 배열들과 똑같은데 차이점은 배열원소에 저장되는게 값이아니라 STring이므로 String객체으 ㅣ주소가 저장됨.
        //
    }
}
