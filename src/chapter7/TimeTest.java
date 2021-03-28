package chapter7;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(3, 30, 50);
        System.out.println(t); //toString호출
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}

class Time{
    private int hour, min, second;

    Time(int hour, int min, int second){
        setHour(hour);
        setMin(min);
        setSecond(second);
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if(hour < 0 || hour > 24) return;
        this.hour = hour;
    }
    public int getMin(){
        return min;
    }
    public void setMin(int min){
        if(min < 0 || min > 60) return;
        this.min = min;
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if(second < 0 || second > 60) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + min + ":" + second;
    }
}