package chapter11.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test6 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1"); setA.add("2");setA.add("3");setA.add("4");setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4"); setB.add("5"); setB.add("6"); setB.add("7"); setB.add("8");
        System.out.println("B = " + setB);

        Iterator iterator = setA.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            if(setB.contains(next))
                setKyo.add(next);
        }

        System.out.println("A n B = " + setKyo);

        Iterator iterator1 = setA.iterator();
        while(iterator1.hasNext()){
            setHab.add(iterator1.next());
        }
        Iterator iterator2 = setB.iterator();
        while(iterator2.hasNext()){
            setHab.add(iterator2.next());
        }
        System.out.println("A U B = " + setHab);

        Iterator iterator3 = setA.iterator();
        while(iterator3.hasNext()){
            Object tmp = iterator3.next();
            if(!setB.contains(tmp)) {
                setCha.add(tmp);
            }
        }

        System.out.println("A - B = " + setCha);

        //간단하게 교집합 합집합 차집합
        // 합집합
//        setA.addAll(setB);
//        System.out.println(setA);
        // 교집합
//        setA.retainAll(setB);
//        System.out.println(setA);
        //차집합
        setA.removeAll(setB);
        System.out.println(setA);
    }
}
