package chapter7.abstract2;

interface Car{
    void move();
    void stop();
    void excel();
    void slow();
}

class Audi implements Car{

    @Override
    public void move() {
        
    }

    @Override
    public void stop() {

    }

    @Override
    public void excel() {

    }

    @Override
    public void slow() {

    }
    
    public void print(){
        System.out.println("난 프린트함수야");
    }
}

public class Testss {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.print();
        
    }
}
