package chapter9.wrapper;

// 자바엔 8개의 primitive type - boolean char byte short int long float double -> 이러한
// primitive타입도 객체로 필요로할때가있따 이럴떄 primitive타입의 객체를 만들어주는 래퍼클래스가 존재 각 8개의 래퍼클래스가존재
public class Ex1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);
        Integer i3 = 100;

        int i4 = new Integer("100").intValue();
        int i1 = Integer.parseInt("101");
        Integer integer = Integer.valueOf("103");

        System.out.println(i==i2);
        System.out.println(i.equals(i2));// Object클래스의 equals메서드가 Integer래퍼클래스내에서 오버라이딩되어서 이게같다고나옴.
        System.out.println(i.compareTo(i2));
        System.out.println(i.toString());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE+"bits");
        System.out.println(Integer.BYTES+"bytes");
        System.out.println(Integer.TYPE);
    }
}
