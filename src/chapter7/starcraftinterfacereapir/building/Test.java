package chapter7.starcraftinterfacereapir.building;

class Building{
    final int MAX_HP;
    
    Building(int hp){
        this.MAX_HP = hp;
    }
}

interface Liftable{
    void liftOff();
    void move(int x, int y);
    void stop();
    void land();
}
class LiftableImple implements Liftable{
    public void liftOff(){
        System.out.println("건물띄움");
    }
    public void move(int x, int y){
        System.out.println(x + ", " + y + "로 이동");
    }
    public void stop(){
        System.out.println("건물 이동중 멈춤");
    }
    public void land(){
        System.out.println("건물 착륙");
    }
}

class Academy extends Building{
    Academy(){
        super(200);
    }
}
class Bunker extends Building{
    Bunker(){
        super(300);
    }
}

class Factory extends Building implements Liftable{
    LiftableImple i = new LiftableImple();

    public void liftOff(){
        i.liftOff();
    }
    public void move(int x, int y){
        i.move(x, y);
    }
    public void stop(){
        i.stop();
    }
    public void land(){
        i.land();
    }
    Factory(){
        super(350);
    }
}

class Barrak extends Building implements Liftable{
    LiftableImple i = new LiftableImple();

    public void liftOff(){
        i.liftOff();
    }
    public void move(int x, int y){
        i.move(x, y);
    }
    public void stop(){
        i.stop();
    }
    public void land(){
        i.land();
    }
    Barrak(){
        super(400);
    }
}

public class Test {
    public static void main(String[] args) {
        Building[] buildings = {new Bunker(), new Academy(), new Barrak(), new Factory()};

        for (Building building : buildings) {
            if(building instanceof Liftable){
                Liftable liftableBuilding = (Liftable) building;
                liftableBuilding.liftOff();
                liftableBuilding.move(100, 200);
                liftableBuilding.stop();
                liftableBuilding.land();
            }
        }
    }
}
