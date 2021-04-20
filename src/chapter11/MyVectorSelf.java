package chapter11;

public class MyVectorSelf {
    Object[] data = null;//객체를 담기위한 Object배열, 어떠한 데이터의 타입도 들어올수있또록 Object로함. - 다  형  성
    int capacity = 0; // 용량
    int size = 0; // 데이터 크기

    public MyVectorSelf(int capacity){
        if(capacity < 0)
            throw new IllegalArgumentException("유효하지 않은값입니다 : " + capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }
    public MyVectorSelf(){
        this(10);
    }
    public void ensureCapacity(int capacity){
        if(capacity - data.length > 0){}
//            setCapacity(capacity);
    }
    public boolean add(Object obj){
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }
    public Object get(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 넘어섰습니다.");
        return data[index];
    }

}
