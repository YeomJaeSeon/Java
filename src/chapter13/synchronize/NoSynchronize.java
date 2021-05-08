package chapter13.synchronize;

// 동기화 : 특정쓰레드가 작업도중 다른쓰레드의 간섭을 막는것
// 임계영역을 설정해서 해당 영역내에선 하나의 쓰레드만 작업할수있또록함.
// lock을 가진 쓰레드만 해당 임계영역에 들어올수있음.

public class NoSynchronize {
    public static void main(String[] args) {
        Runnable r = new Th(); // 인터페이스 다형성
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);

        thread1.start();
        thread2.start();
    }
}

class Account{
    private int balance = 1000;

    // 동기화
    public synchronized int getBalance() {
        return balance;
    }
    public synchronized void withdraw(int money){
        if(balance >= money){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            balance -= money;
        }
    }
}

class Th implements Runnable{
    Account acc = new Account();
    //객체하나

    @Override
    public void run() {
        while(acc.getBalance() > 0){
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}