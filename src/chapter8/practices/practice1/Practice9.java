package chapter8.practices.practice1;

public class Practice9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException{
    final private int ERR_CODE;
    UnsupportedFunctionException(String msg, int errCode){
        super(msg);
        this.ERR_CODE = errCode;
    }
    UnsupportedFunctionException(String msg){
        this(msg, 100);
    }

    public int getErrorCode(){
        return ERR_CODE;
    }
    public String getMessage(){
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}

/*
10번
2
4
7
5 // method1에선 예외 다시 발생해서 바로 예외던지느라 자기 호출한 메서드로간다.. method1은
예외가 다시발생해서 정상적으로 종료가안되었으므로 5는 출력되지않아..
 */