package chapter12.t1;

public class T4 {
    public static void main(String[] args) {
        //지네릭 클래스 객체생성 - 참조변수, 생성자에 타입대입(타입변수에 타입대입)
        Box<String> box = new Box<String>();
        box.setItem("ABC");
        System.out.println(box.getItem());
//        box.setItem(new Object());

//        Box<Object> box2 = new Box<>();
//        box2.setItem(new Object());

    }
}

// 지네릭클래스는 클래스옆에 타입변수 딱 놔두면됨
class Box<T>{
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}