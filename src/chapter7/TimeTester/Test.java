package chapter7.TimeTester;

class Time{
    //접근제어가자 붙을수있는 건 클래스, 메서드 멤버변수, 생성ㅈ,. 참고로 클래스엔 public과 default, 지역변수느 못붙어. 당연한거임 생각해보면
    private int hour;
    private int minute;
    private int second;

    // 접근제어자는 데이터보호하기위해서. 그리고

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isNotHour(hour)) return;
        this.hour = hour;
    }

    // 외부로부터 내부 로직 숨기기위해서 - 캡슐화
    // 이렇게 멤버변수 데이터는 privae으로 접근 막고 메서드는 public으로 데이터 간접접근
    private boolean isNotHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}

public class Test {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(23);
        t.setHour(24);
        System.out.println(t.getHour());
    }
}
