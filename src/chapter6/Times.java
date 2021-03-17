package chapter6;

class Time{
    private int hour;
    private int minute;
    private float second;
    // 변수와 메서드가 함꼐있는 클래스.. 연관되어있으므로 이런식으로 함께잇을수있다.

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public float getSecond(){
        return second;
    }
    public void setHour(int h){
        if(h >= 0 && h <= 23) hour = h;
    }
    public void setMinute(int m){
        if(m >= 0 && m <= 59) minute = m;
    }
    public void setSecond(float s){
        if(s >= 0 && s <= 59) second = s;
    }
}

public class Times {
    public static void main(String[] args) {

        Time[] timeArr = new Time[]{new Time(), new Time(), new Time()};

        timeArr[0].setHour(12);
        timeArr[0].setMinute(30);
        timeArr[0].setSecond(30);

        System.out.printf("미국의 시간은 : %d시 %d분 %.0f초 입니다.%n", timeArr[0].getHour(), timeArr[0].getMinute(), timeArr[0].getSecond());
    }
}
