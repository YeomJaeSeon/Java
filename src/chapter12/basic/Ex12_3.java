package chapter12.basic;

class Products{
    int a;
    int b;
}
class Tvs extends Products{
    int c;
}

public class Ex12_3 {
    public static void main(String[] args) {
        Products products = returnThings();
//        Tvs tvs = (Tvs)returnThings();

        Products products1 = new Products();
        Products products2 = new Tvs();

        Products products3 = (Products) products;

//        Tvs tvs = (Tvs)products1;
//        System.out.println(tvs.c);

        getThing(new Tvs());

        getThing(new Products());

    }
    static Products returnThings(){
        return new Products();
    }
    static void getThing(Products p){
        System.out.println(p);
    }
}
