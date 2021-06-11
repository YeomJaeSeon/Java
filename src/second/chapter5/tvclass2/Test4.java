package second.chapter5.tvclass2;

class Data{
    private int x;
    public Data(int x){
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

public class Test4 {
    static int a;
    void add(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        int beforeX = 10;
        System.out.println("before : " + beforeX);
        change(10);
        System.out.println("after : " + beforeX);
        System.out.println("//===================//");
        int beforeY = 10;
        Data d = new Data(beforeY);
        System.out.println("before : " + d.getX());
        change2(d);
        System.out.println("before : " + d.getX());

    }
    static void change(int x){
        x = 1000;
        System.out.println("change to : " + x);
    }

    static void change2(Data d){
        d.setX(1000);
        System.out.println("change to : " + d.getX());
    }
}
