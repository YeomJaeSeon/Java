package chapter11;

import java.util.ArrayList;

class CarTest{

}

public class ExpValidCheck {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10); // initialCapacity잘 둬야함 - 배열기반으로 데이터를저장하기때문에 크기넘어가면 다시 배열생성하고 복사...시간 long!
        arrayList.add(1);
        arrayList.add(new CarTest());

        System.out.println(arrayList);

    }
}
