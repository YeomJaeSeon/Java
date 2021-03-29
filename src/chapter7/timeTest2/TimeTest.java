package chapter7.timeTest2;

class Time{
    private int hour;
    private int minute;
    private int second;
    // 접근제어자를 통한 데이터 보호 - 데이터엔 직접접근막고 public메서드로 간접접근ㅁ나 허용 이렇게되면장점이
    //메서드에서 조건을 걸수있지 함부러 접근못하게할수있따.


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isNotHourValue(hour)) return;
        this.hour = hour;
    }

    private boolean isNotHourValue(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (isNotMinSecondValue(minute)) return;
        this.minute = minute;
    }

    private boolean isNotMinSecondValue(int time) {
        return (time < 0 || time > 59);

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (isNotMinSecondValue(second)) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":"+ minute + ":" + this.second;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();

        t.setHour(3);
        t.setHour(30);

        System.out.print(t.getHour() + ":");

        t.setMinute(50);
        t.setMinute(25);
        System.out.println(t.getMinute() + ":" + t.getSecond());

        System.out.println("time : " + t);
        // Object클래스의 메서드 toSTring알아서호출. 참조변수만 sout하던가 문자열 +연산으로 더해서 해도 toString 메서드호출
    }
}
