package chapter6;

class Cars{
    String color;
    String gearType;
    int door;

    Cars(){
        this("white","3단기어", 4);
        // 생성자에서 다른 생성자호출은 무조건 첫번째줄, 그리고 this를 통해서 접근
    }
    Cars(String color){
        this(color, "4단기어", 5);
    }
    Cars(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
        Cars c2 = new Cars("노란색");
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door);

        Cars c3 = new Cars("검정색", "1003단기어", 100);
        System.out.println(c3.color + ", " + c3.gearType + ", " + c3.door);
    }
}
