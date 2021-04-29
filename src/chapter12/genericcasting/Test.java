package chapter12.genericcasting;

import java.util.ArrayList;
import java.util.List;

class Noodle{
    void type(){
        System.out.println("면요리");
    }
}
class Ramyeon extends Noodle{
    void flavor(){
        System.out.println("매움");
    }

    @Override
    public String toString() {
        return "라면";
    }
}
class MyeolchiNoodle extends Noodle{
    void flavor(){
        System.out.println("시원함");
    }

    @Override
    public String toString() {
        return "멸치국수";
    }
}

class BibimNoodle extends Noodle{
    void flavor(){
        System.out.println("매콤함");
    }

    @Override
    public String toString() {
        return "비빔국수";
    }
}

public class Test {
    public static List<Noodle> list = new ArrayList<>();
    public static void main(String[] args) {
        //다형성
        Noodle noodle = (Noodle)new MyeolchiNoodle();
        noodle.type();

        ((MyeolchiNoodle)noodle).flavor();

        //다형성 2
        Noodle noodle1 = new Ramyeon();
        noodle1.type();
        ((Ramyeon)noodle1).flavor();

        //부모타입의 참조변수로 자식타입의 인스턴스 참조가능! -  다형성!
        Noodle noodle2 = new Noodle();
//        Ramyeon ramyeon = (Ramyeon) noodle; - ramyeon참조변수가 없는 멤버를 가르킬수있으므로 에러

        Ramyeon ramyeon = new Ramyeon();
        Noodle noodle3 = (Noodle) ramyeon;
        noodle.type();
//        noodle.flavor(); - Noodle 멤버는 flavor()멤버가없음

        Noodle noodle4 = (Noodle) new Ramyeon();
        ((Ramyeon)noodle4).flavor();

        Noodle noodle5 = (Noodle) new MyeolchiNoodle();
        ((MyeolchiNoodle)noodle5).flavor();

        // 다형성의장점
        Noodle[] noodleArr = new Noodle[10];

        noodleArr[0] = new MyeolchiNoodle();
        noodleArr[1] = new Ramyeon();
        noodleArr[2] = new MyeolchiNoodle();
        noodleArr[3] = new Ramyeon();
        noodleArr[4] = new MyeolchiNoodle();
        noodleArr[5] = new Ramyeon();

        for (Noodle noodle6 : noodleArr) {
            if(noodle6 == null) break;
            System.out.print(noodle6+"의 맛은 :");
            if(noodle6 instanceof MyeolchiNoodle){
                ((MyeolchiNoodle)noodle6).flavor();
            }else if(noodle6 instanceof Ramyeon){
                ((Ramyeon)noodle6).flavor();
            }
        }

        buy(new Ramyeon());
        buy(new MyeolchiNoodle());
        buy(new Ramyeon());
        buy(new BibimNoodle());
        buy(new Ramyeon());
        buy(new MyeolchiNoodle());
        buy(new Ramyeon());
        buy(new BibimNoodle());

        System.out.println(list);

    }
    //다형성 장점2  - 매개변수다형성
    public static void buy(Noodle noodle){
        list.add(noodle);
    }

}
