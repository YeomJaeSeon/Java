package restudy.reresre;

class Tv{
    boolean power = true;
    int channel = 100;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
class SmartTv extends Tv{
    String text;
    SmartTv(String text){
        this.text =text;
    }
    void caption(){
        System.out.println(text + "출력");
    }
}

public class Test {
    public static void main(String[] args) {
        SmartTv t1 = new SmartTv("디버그야 물좀떠와");
        Tv t2 = new SmartTv("시리야 물좀떠와");

        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.caption();
        // t2.cation() - 다형성, 참조변수 타입에 따라서 사용할수있는 멤버의 개수가 달라질수있따.
        // t1은 참조변수타입이 인스턴스 타입과같으므로 인스턴스의 모든 멤버사용가능
        // t2는 참조변수타입이 부모이므로 사용할수있는 멤버가 5개, 그러나 인스턴스는 사용할수있는 멤버가 7개이다.
        // t2에선 text와 caption()멤버가 없으니 사용할수없다 . 리모컨에 버트이없는ㄲ꼴
        // 부모타입이 참조변수로 자식의 인스턴스 참조할수있는 이것이 다형성인데 딱히 좋아보이진안흔다. 그러나 이것이 장점이 될때가있따.

        Tv t3 = (Tv)t1;
        // t3.caption(); t3리모컨에는 catpion멤버가없음
        // 참조변수형변환 -> 사용할수있는 멤버갯수 조절, + 부모자시고간계까근ㅇ
        Tv tv = new Tv();
        SmartTv smartTv = (SmartTv) t3;
        smartTv.caption();
        smartTv.text = "시리";
        smartTv.caption();

        Tv tv5 = (Tv) smartTv;
        System.out.println(tv5.channel); // 다시 Tv타입으로 형변환하면 Tv 에는 리모턴중 test caption이없으므로
        // 사용할수있는 멤버가 다시줄어듬.
        // 이런식으로 참조변수형변환은 사용할수있는 멤버갯수를 참조변수 타입을 바꿈으로써 ,리모턴의 버튼 개수르 ㄹ바꿈으로서 변경할수있따.

        SmartTv st = new SmartTv("zz");

        System.out.println(st instanceof SmartTv); // st를 형변환가능

        // 참조변수를 해당 타입으로 형변환가능? - 참조변수형변환하기전에 체크하는ㅇ ㅕㄴ산자
        if(st instanceof Tv){
            System.out.println("형변환 가능");
            Tv newTv = (Tv)st;
            System.out.println(newTv.channel);
        }
        Test.isTrue(new Tv());
        Test.isTrue(new SmartTv("zz"));
    }
    static void isTrue(Object obj){
        if(obj instanceof Tv){
            Tv tv = (Tv)obj;
            System.out.println("Tv로 형변환가능.");
        }
        if(obj instanceof SmartTv){
            SmartTv smartTv = (SmartTv) obj;
            System.out.println("Smart Tv로 형변환가능");
        }
    }
}
