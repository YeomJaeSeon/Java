package second.chapter11.list1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(0);
        list.add(10);
        list.add(7);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        List<Integer> subList = list.subList(0, 4); // 0 ~ 3
        System.out.println(subList);

        System.out.println("포함함? : " + list.containsAll(subList));

        System.out.println(list.contains(3));
        System.out.println(list.contains(1));

        subList.add(200);
        subList.add(300);
        subList.set(2, subList.get(2) * 100);
        System.out.println(subList);
        subList.set(0, -100);
        System.out.println(subList);
        subList.add(2, 1000);
        System.out.println(subList);

        System.out.println("list : " + list);
        System.out.println("subList : " + subList);


        System.out.println("변화 후 subList : " + subList);

        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List list2 = new ArrayList();
        list2.add(0);
        list2.add(2);
        list2.add(4);
        list2.add("AA");
        list2.add('A');

//        for(int i = list1.size() - 1; i >= 0; i--){
//            if(list2.contains(list1.get(i))) list1.remove(i);
//        }

        list1.removeIf(list2::contains);

        System.out.println(list1);

        // 배열을 리스트로
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> listArr = Arrays.asList(arr);
        System.out.println(listArr);

        List<Integer> newListArr = new ArrayList<>(listArr);
        newListArr.add(30);
        System.out.println(newListArr);

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list3);
        List<Integer> list4 = new ArrayList<>(list3);
        list4.add(-10);
        System.out.println(list4);
        //asList가 반환한 List는 읽기전용, 수정불가 -> 새로운 리스트를 만들면됨 어려운거아님

    }
}
