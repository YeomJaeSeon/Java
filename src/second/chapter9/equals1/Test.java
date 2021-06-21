package second.chapter9.equals1;
class Person{
    private String name;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person person = (Person) obj;
            return person.name.equals(this.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Yeom");

        Person person2= new Person();
        person2.setName("Yeom");

        System.out.println(person1.equals(person2));
        System.out.println(person1 + ", " + person2);



    }
}
