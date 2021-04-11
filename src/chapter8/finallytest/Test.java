package chapter8.finallytest;

public class Test {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFiles();
//            deleteTempFiles(); //
        }catch (Exception e){
            e.printStackTrace();
//            deleteTempFiles(); // 이메서드는 예외가발생하던 안하던 실행해야함. 이럴때 try - catch- finally를 이용
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall(){
        System.out.println("Test.startInstall");
    }
    static void copyFiles(){
        System.out.println("Test.copyFiles");
    }
    static void deleteTempFiles(){
        System.out.println("Test.deleteTempFiles");
    }
}
