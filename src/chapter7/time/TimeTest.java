package chapter7.time;

class Time{
    //접근제어자 왜씀?
    // 접근제어자로 외부로부터데이터 보호, -> 캡슐화개념
    // 이렇게 캡슐화란 데이터는 외부에서 접근을 막고
    // 메서드를 통해서 간접 접근만 허용한다.
    
    // 데이터 외부로부터 접근막고(데이터 보호)
    private int hour;
    private int minute;
    private int second;
    // 클래스 내부의 데이터를 보호하기위해서 private접근제어자를사용한다 -> 캡슐화개념

    // 메서드를 통해서 데이터로 외부로부터 간접접근만허용
    public void setHour(int hour){
        if(isNotHourValue(hour)) return;
        this.hour = hour;
    }

    // 이것도 private으로하는게 좋다. 왜냐면 Time클래스의 setHour메서드내에서만사용되므로
    // Time클래스에서만 사용하므로 public으로할이유가없다.
    // 이렇게 좁은범위의 접근제어자릀용하는것이 나중에 테스트할때도 너무편하다.
    //이렇게 하면 나중에 테스트할때 아 이건 private이므로 이 클래스내부만 검사하면되겠다란생각이들어서 편하다. 즉 좁은범위의 접근제어자부터
    //넓혀나가는식으로한다.
    private boolean isNotHourValue(int hour) {
        return hour < 0 || hour > 23;
    }
    private boolean isNotMinuteOrSecond(int minute) {
        return minute < 0 || minute > 59;
    }

    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if (isNotMinuteOrSecond(minute)) return;
        this.minute = minute;
    }

    public int getMinute(){
        return  minute;
    }

    public void setSecond(int second){
        if (isNotMinuteOrSecond(second)) return;
        this.second =second;
    }
    public int getSecond(){
        return  second;
    }

    @Override
    public String toString() {
        return "hour : " + hour + ", minute : " + minute + ", second : " + second;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21);
        t.setHour(100);

        t.setMinute(59);
        t.setMinute(90);

        t.setSecond(300);
        t.setSecond(10);
        System.out.println(t);
    }
}
