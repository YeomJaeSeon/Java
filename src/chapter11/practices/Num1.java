package chapter11.practices;

import java.util.ArrayList;

public class Num1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList hap = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo.addAll(list1); // list1의 데이터를 kyo로
        kyo.retainAll(list2); // 공통의 것만 남기고 다 삭제

        cha.addAll(list1);
        cha.removeAll(list2);

        hap.addAll(list1); // list1의 데이터 hap으로 다옮겨
        for(int i = 0; i < list2.size(); i++){
            if(!hap.contains(list2.get(i))){ // hap에 list1.get(i)데이터가없으면
                hap.add(list2.get(i)); // 그걸 hap에추가
            }
        }
        //합집합

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);

    }
}

/*
2.
7 6 3 2

3. d. 중간에 새로운 요소 추가 (ArrayList는 배열기반)

4. 가운데(6번쨰) (원형연결ㄹ리스트이므로 중간노드까지 접근하는게 제일오래거림)

5.
 */