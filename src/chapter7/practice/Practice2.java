package chapter7.practice;

class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;


    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean getIsPowerOn(){
        return isPowerOn;
    }
    public void setPowerOn(boolean power){
        isPowerOn = power;
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL) {
            this.channel = MIN_CHANNEL;
            return;
        }
        if(channel < MIN_CHANNEL) {
            this.channel = MAX_CHANNEL;
            return;
        }
        prevChannel = this.channel;
        this.channel = channel;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        if(volume > MAX_VOLUME || volume < MIN_VOLUME) return;

        this.volume = volume;
    }
    void gotoPrevChannel(){
        setChannel(prevChannel);
    }
}
public class Practice2 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}

//7-12
/*
c : 지역변수는 접근제어자 사용X, 징ㄱ변수는 어짜핌 ㅔ서드끝나면 사라짐

 */

//7-13
/*
외부에서 인스턴스 생성 못하게하려고.
모든 멤버들이 static으로 되어있으므로 인스턴스 생성안해도 사용할수있게하기위해서.
 */

//7-14
/*
final int num;
final boolean isKwang;
// 상수 대문자로하자.
final int NUM;
final boolean IS_KWANG;
 */

//7-15
/*
e
 */

//7-16
/*
e
 */
