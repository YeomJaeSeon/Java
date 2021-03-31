package chapter7.abstract2;

// 공통의 부분은 부모클래스에서.. 추상클래스로
abstract class MacComputer{
    int monitor;
    int keyboard;
    
    abstract void inputKeyboard(String inputValue); // 키보드르 ㄹ입력하는 동작은 동일함 뭔 맥 노트북종류던간에
}
// 구체저깅ㄴ 부분은 자식클래스에서..
class MacAir extends MacComputer{

    @Override
    void inputKeyboard(String inputValue) {
        System.out.println(inputValue + "를 맥 에어에 입력");
    }
}
class MacPro extends MacComputer{

    @Override
    void inputKeyboard(String inputValue) {
        System.out.println(inputValue + "를 맥 프로에 입력");
        
    }
}

public class Test {
    public static void main(String[] args) {
        MacComputer[] coms = new MacComputer[3];
        coms[0] = new MacAir();
        coms[1] = new MacPro();
        coms[2] = new MacAir();

        for(MacComputer com : coms){
            com.inputKeyboard("ㅋㅋ");
        }
    }
}
