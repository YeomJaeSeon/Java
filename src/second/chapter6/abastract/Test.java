package second.chapter6.abastract;

abstract class Player{
    boolean pause;
    int currentPos;

    Player(){
        pause = false;
        currentPos = 0;
    }
    abstract void play(int pos);
    abstract void stop();
    //추상메서드
    void play(){
        play(currentPos);//추상메서드 호출가능
    }
    void pause(){
        if(pause){
            pause = false;
            play(currentPos);
        }else{
            pause = true;
            stop(); // 추상메서드 호출가능
        }
    }
}

class VCR extends Player{
    @Override
    void play(int currentPos){
        System.out.println("VCR play : " + currentPos + " 부터");
    }

    @Override
    void stop(){
        System.out.println("VCR stop ");

    }
}

class Audio extends Player{

    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}


public class Test {
    public static void main(String[] args) {


    }
}
