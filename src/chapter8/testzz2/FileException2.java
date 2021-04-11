package chapter8.testzz2;

import java.io.File;

public class FileException2 {
    public static void main(String[] args) {
        try{
            File f = createFile("");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었씁니다.");
        }catch (Exception e){
            System.out.println(e.getMessage() + " 다시 입력해주세요.");
        }
    }
    static File createFile(String fileName) throws Exception{ // 메인메서드로 예외 떠넘기기 이메서드 호출한 곳에서 예외처리해라~
        if(fileName == "" || fileName == null){
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);
        f.createNewFile(); // 실제 파일 생성
        return f;
    }
}
