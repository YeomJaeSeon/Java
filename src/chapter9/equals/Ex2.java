package chapter9.equals;
class Value{
    int value;
    public Value(int value){
        this.value =value;
    }

    // Object의 equals메서드를 나에맞게 오버라이딩한거임. iv끼리 비교해서같으면 true아니면 false
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Value){
            if (this.value == ((Value) obj).value){
                return true;
            }
        }
        return false;
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1.equals(v2));

        Value v3 = new Value(20);
        System.out.println(v1.equals(v3));
    }
}
