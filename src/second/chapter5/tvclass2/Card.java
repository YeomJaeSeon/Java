package second.chapter5.tvclass2;

public class Card {
    private String kind;
    private int num;
    public static int height = 100;
    public static int width = 50;

    public Card(String kind, int num){
        this.kind = kind;
        this.num = num;
    }

    public String getKind() {
        return kind;
    }

    public int getNum() {
        return num;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
