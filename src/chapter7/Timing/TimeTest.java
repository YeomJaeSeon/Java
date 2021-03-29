package chapter7.Timing;

class Time{
    private int hour;
    private int minute;
    private int second;

    // 메서드로 데이터에 간접접근.
    public void setHour(int hour){
        if (isNotHourValue(hour, 23)) return;
        this.hour = hour;
    }

    // 이러한 TIme클래스에서만 사용하는 로직은 private으로 감추는게중요
    //접근제어자왜? 데이터보호 + 내부로직 숨기기위해 -> 캡슐화
    // 이렇게 접근제어자를 좁은범위부터 생각하는게 중요하다 테스트코드를 할때 이게 훨편함
    private boolean isNotHourValue(int hour, int i) {
        if (hour < 0 || hour > i) return true;
        return false;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (isNotHourValue(minute, 59)) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (isNotHourValue(second, 59)) return;
        this.second = second;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(20);
        t.setHour(200);

        System.out.println(t.getHour());
    }
}


