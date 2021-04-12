package chapter9.stringmethod;

public class Ex5 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);
        System.out.println(fileName);

        String ext = fullName.substring(index + 1);
        System.out.println(ext);

        String classFullName = "chapter9.stringmethod.Ex5.java";

        int lastIndex = classFullName.lastIndexOf('.');
        String substring = classFullName.substring(lastIndex + 1);
        System.out.println("확장자 명 : " +substring);

        String[] sss = classFullName.split("\\.");
        // java에서 .은 모든문자를 의미함...

        String animals = "dog,cat,bear";
        String[] arr = animals.split(","); // 문자열을 배열로 구분자를통해서 split!

        try{
            System.out.println(sss[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("범위벗어남.");
        }
        for (String s : sss) {
            System.out.println(s);
        }

        String joinResult = String.join("-", sss);
        System.out.println(joinResult);

        String fullName2 = "ToSTring.java";
        int i = fullName2.indexOf('.');
        String fileName2 = fullName2.substring(0, i);
        System.out.println(fileName2);

        String substring1 = fullName2.substring(i + 1);
        System.out.println(fileName2 + ", " + substring1);

        // substring으로 문자열 나누기가능..! 구분자를통해서
        // indexOf로 특정 문자의 인덱스 위치를 찾을수있음.

    }
}
