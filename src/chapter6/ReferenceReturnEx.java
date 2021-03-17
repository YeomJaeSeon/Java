package chapter6;

class Datas{
    int x;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Datas d = new Datas();

        d.x = 10;
        copy(d);

        Datas d2 = copy(d);

        System.out.println(d.x);
        System.out.println(d2.x);

    }
    static Datas copy(Datas x){
        Datas tmp = new Datas();
        tmp.x = x.x;

        return tmp;
        // copy메서드끝나면서 tmp참조변수는 사라졌지만~ 주소를 리턴값으로넘김
    }
}
