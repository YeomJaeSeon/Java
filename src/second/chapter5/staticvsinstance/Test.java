package second.chapter5.staticvsinstance;

class Army{
    static String sex = "male";
    int age;
    Strength strength;

    public Army(int age, Strength strength){
        this.age = age;
        this.strength = strength;
    }

    static void printSex(){
        System.out.println(sex);
    }

    String displayAgeAndStrength(){
        return age + " , " + strength;
    }

    enum Strength{
        LOW, MIDDLE, HIGH
    }
}

public class Test {
    public static void main(String[] args) {
        Army army = new Army(10, Army.Strength.HIGH);
        Army.printSex();
        System.out.println(army.displayAgeAndStrength());

        Army army2 = new Army(12, Army.Strength.MIDDLE);
        Army.printSex();
        System.out.println(army2.displayAgeAndStrength());

    }
}
