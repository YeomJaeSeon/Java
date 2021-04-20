package chapter11;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {

        Vector v = new Vector(5);
        
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("=========AFTER trimToSize()========");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=========AFTER ensureCapacity()========");
        print(v);

        v.setSize(7);
        System.out.println("=========AFTER setSize(7)========");
        print(v);

        v.clear();
        System.out.println("=========AFTER claer()========");
        print(v);

    }
    static void print(Vector v){
        System.out.println(v);
        System.out.println("v.size() = " + v.size());
        System.out.println("v.capacity() = " + v.capacity());
    }
}
