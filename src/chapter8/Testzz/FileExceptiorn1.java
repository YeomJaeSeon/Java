package chapter8.Testzz;

import java.io.File;

public class FileExceptiorn1 {
    // 각메서드는 메서드에 예외선언안하고 본인이 처리했다. main메서드는 예외 가 발생한지도모름.
    public static void main(String[] args) {
        File f =createFile("");
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }
    static File createFile(String fileName){
        try{
            if(fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
        }catch (Exception e){
            fileName = "제목없음.txt";
        }finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }
    static void createNewFile(File f){
        try{
            f.createNewFile();
        }catch (Exception e){ }
    }
}
