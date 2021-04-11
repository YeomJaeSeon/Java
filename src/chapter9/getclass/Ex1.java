package chapter9.getclass;

// getClass메서드는 Class객체를 리턴함 여기서 Class객체란 클래스에 대한 정보를 가지고있는 Class라는 타입의 객체이다.(Class가 하나의타입임)
final class Card{
    String kind;
    int num;
    Card(){
        this("SPADE", 1);
    }
    Card(String kind ,int num){
        this.kind =kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return kind + ":" + num;
    }

}
public class Ex1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Card c = new Card("HEART", 3);
        Card c2 = Card.class.newInstance();

        Class cObject = c.getClass(); //getClass메서드로 Card클래스에대한 정보를 가지고있는 Class객체 생성가능
        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObject.getName());
        System.out.println(cObject.toGenericString());
        System.out.println(cObject.toString());

        Class cObj1 = new Card().getClass();
        Class cObj2 = Card.class;
        try{
            Class cObj3 = Class.forName("Card"); // 요런식으로 Class객체를 만들수있음
        }catch (ClassNotFoundException e){
            System.out.println("이클래스 없는디유.?");
            e.getMessage();
            e.printStackTrace();
        }
        System.out.println(cObj1.getName());
    }
}
