package chapter8.makeexceptionclass;

public class UserException {
    public static void main(String[] args) {
        try{
            startInstall(); // 1. startInsatll메서드가호출되는데 이 메서드는 throws로 예외 선언한 메서드이다. 예외를 main에게 던질거다.
            copyFiles(); // 이코드는 실행이안됨. 위코드에서 예외발생해서 catch로감.

        }catch (SpaceException e){ //3.  여기에 잡힘 SpaceException인스턴스가 이 클래스와 instanceof true가됨.
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보먼저 해줘요.");
        }catch (MemoryException e){
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("다시 설치해봐요");
        }finally {
            deleteTempFiles(); //4 그리고 삭제함.
        }
    }
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace())
            throw new SpaceException("설치할 공간이 없어요.."); //2.  실제로 여기서 예외를 발생시킴
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족해요..");
    }
    static void copyFiles(){
        System.out.println("UserException.copyFiles");
    }
    static void deleteTempFiles(){
        System.out.println("UserException.deleteTempFiles");
    }
    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
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
