package chapter13.waitandnotify;

// wait & notify : 동기화 효율 증가 한객체에 하나의락박에없어서 동기화된 임게영역에서 하나의 쓰레드가 작업중인데 엄청 오랫동안 끝나지않을떄
// 다른쓰레드는 해당 객체의 락을 가지고 임계영역에 들어갈수가없음 이럴떄 wait()으로 락을 가지고 임계영역에 오래머무는녀석은 대기시키고 락을 반납하게하고
// 락이 필요한 쓰레드에게 전달하여 락을 받은 쓰레드가 해당 임계영역을 작업하고 끝나면 대기실에 있던 락을 반납한 쓰레드를 notify()메서드로 통보한다.
// notifyAll()로 통보하는건 대기실 대기중인 모드 쓰레드중 하나에게 lock을 전달.

import java.io.IOException;
import java.util.ArrayList;

// 동기화만 사용 (wait(), notify()싸용안했ㅇㄹ때 효율성이 얼마나 안좋은지 봐보자)
class Table{
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){
        if(dishes.size() >= MAX_FOOD){
            // 테이블에 최대 음식이있으면
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting");
            try{
                wait();
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
//        System.out.println(dish + "요리 끝");
        dishes.add(dish);
        notify();
//        System.out.println("추가된 후 Dishes : " + dishes);
    }

    public synchronized void remove(String dishName){
        String name = Thread.currentThread().getName();
        while(dishes.size() == 0){
            System.out.println(name + " is waiting.");
            try{
                wait();
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }


        while(true){
            for(int i = 0; i < dishes.size(); i++){
                if(dishName.equals(dishes.get(i))){
                    dishes.remove(i); // 테이블의 해당음식 하나먹고
                    notify();
                    return; // 함수끝
                }
            }
            try{
                System.out.println(name + " is waiting.");
                wait();
                Thread.sleep(500);
            }catch (InterruptedException e) {}
        }
    }

    public int dishNum(){
        return dishNames.length; // 나올수있는 음식의수(도넛 둘, 버거 하나)
    }
}

class Customer implements Runnable{
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){}
            String name = Thread.currentThread().getName(); // 해당쓰레드의 이름
            table.remove(food);
            System.out.println(name + "ate a " + food);
        }

    }

}

class Cook implements Runnable{
    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true){
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]); // 테이블에 음식 추가
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){}
        }
    }
}
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUSTOMER1").start();
        new Thread(new Customer(table, "burger"), "CUSTOMER2").start();

        Thread.sleep(100);
        System.exit(0);
    }
}
