package chapter7.abstracts;

// 다형성  : 부모타입으 참조변수로 자식 인슽너스 참조가능
//장점 : 매개변수 다형성 , 하나의 배열로 여러 종류 객체 저장가능. (ㄷ형성으로)

// 추상클래스 : 추상메서드가있는 클래스(미완성 메서드가있는 미완성 클래스) - 미안성 설게도 -> 인스턴스 생성불가
// 추상메서드 : 구현부가 없는 메서드{}가 없음.
// 추상메스드는 호출가능. 메서드호출할땐 선언부만 이씅면되닌까..

abstract class Player{
   abstract void play(int pos); 
   abstract void stop();
}

class AudioPlayer extends Player{
    void play(int pos){
        System.out.println(pos + "부터 재생");
    }
    void stop(){
        System.out.println("음악 재생 멈춤");
    }
}
public class Test {
    public static void main(String[] args) {
//        AudioPlayer ap = new AudioPlayer();
        Player p = new AudioPlayer();  // 다형성
        // 부모타이브이 참조변수 로 자식 참조가능
        // Player는 추상클래스여도 리모컨은 그대로있어. 실제구현 인스턴스는 play멤버 stop멤버가 닥 ㅜ현디어있어.(메서드의 구현부가 정의되어ㅣㅇㅆ음)
        // 그러므로 문제없다.
        p.play(100);
        p.stop();
    }
}
