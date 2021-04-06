package chapter8;

public class FinallyTest {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteFiles();
        }
    }
    static void startInstall(){
        System.out.println("프로그램설치중..");
    }
    static void copyFiles(){
        System.out.println("파일 복사중..");
    }
    static void deleteFiles(){
        System.out.println("임시파일 삭제중.");
    }
}
