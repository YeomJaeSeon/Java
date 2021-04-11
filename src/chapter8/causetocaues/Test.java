package chapter8.causetocaues;

public class Test {
    public static void main(String[] args) {
        try{
            install();
        }catch (InstallException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void install() throws InstallException{
        try{
            startInstall();
            copyFiles();
        }catch (SpaceException se){
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        }catch (MemoryException me){
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 없어요.");
        }
        if(!enoughMemory()){
//            throw new MemoryException("메모리가 부족합니다.");
            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }
    static void copyFiles(){
        System.out.println("Test.copyFiles");
    }
    static void deleteTempFiles(){
        System.out.println("Test.deleteTempFiles");
    }
    static boolean enoughSpace(){
        System.out.println("Test.enoughSpace");
        return true;
    }
    static boolean enoughMemory(){
        System.out.println("Test.enoughMemory");
        return false;
    }
}
class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}
class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}
class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}