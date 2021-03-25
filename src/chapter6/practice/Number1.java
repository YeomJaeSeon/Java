package chapter6.practice;

// 1번, 2번
class SutdaCard{
    private int num;
    boolean isKwang;

    public void setNum(int num){
        if(num < 1 || num > 10) return;
        this.num = num;
    }
    public int getNum(){
        return num;
    }

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    String info(){
        String returnString = "";
        if(isKwang == true) returnString = "K";

        return num + returnString;
    }
}

public class Number1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
