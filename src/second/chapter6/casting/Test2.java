package second.chapter6.casting;

class Champion{
    int level;
    int hp;

    void attack(){
        System.out.println("평타 평타!");
    }
}

class Garen extends Champion{
    void spinAttack(){
        System.out.println("풍차 공격");
    }
}
class Lux extends Champion{
    void lightAttack(){
        System.out.println("데마시아 빛공격");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Garen garen = new Garen();
        Champion champion = null;
        Lux lux = null;
        Garen garen1 = null;


//        lux = (Garen)garen - 참조변수 형변환은 무조건! 상속관계만 가능
        champion = garen;
        champion.attack();
        garen1 = (Garen) champion;
        garen1.spinAttack();
        //참조변수에 따라서 사용할수있는 멤버가 달라짐. 스킬이 달라지잖아.

        Lux lux1 = new Lux();
        Champion champion1 = null;

        lux1.lightAttack();
        champion1 = lux1;
        champion1.attack();
//        champion1.lightAttack();
        test2();

    }
    static void test2(){
        System.out.println("====test2=====");
        Champion champion = new Champion();
        Garen garen = null;
        Lux lux = null;

        champion.attack();
        try{
            garen.spinAttack();
        }catch (NullPointerException npe){
            System.out.println("null에 .찍으면 NPE");
        }

//        garen = (Garen) champion;
//        Garen garen1 = new Champion(); - 위아래 문장이 같으의미임
        // 자식타입의 참조변수론 부모타입 참조못함. 참조변수의 타입의 멤버의 개수가 더 적거나 같아야함
        // 이러면 없는걸 가르킬수있음(프로그래밍적으로 에러)

    }
}
