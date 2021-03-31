package chapter7.SingleTester;

class SingleTon{
    
    private static SingleTon instance = new SingleTon(); // private인 생성자는 같은 클래스에선 접근가능 
    //public > protected > default > private;
    
    private SingleTon(){
        
    }
    // 외부에서 SingleTon클래스의 인스턴스를 새엇ㅇ할수없음(생성자가 private)이므로 그래서 static으로함.
    public static SingleTon getInstance(){
        return instance; //사용하는 멤버도 클래스멤버여야함 그래서 맨위줄에 멤버변수 static으로함
    }
}

public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        // 이 클래스의 객체는 싱글턴으로 존재
    }
}
