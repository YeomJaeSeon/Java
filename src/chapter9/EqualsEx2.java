package chapter9;

class Person{
    long id;

    // Object클래스로부터 상속받은 메서드 오버라이딩함. - 메서드 선언부가같고.
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) // 파라미터로받은 객체의 타입이 Person
            return this.id ==  ((Person)obj).id;
        else // 인자로오는 객체가 Person타입이아니면.
            return false;
    }

    public Person(long id) {
        this.id = id;
    }
}

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(12345L);
        Person p2 = new Person(12345L);

        if(p1 == p2)
            System.out.println("p1 == p2");
        else
            System.out.println("p1 != p2");

        if(p1.equals(p2))
            System.out.println("p1 == p2");
        else
            System.out.println("p1 != p2");
    }
}
