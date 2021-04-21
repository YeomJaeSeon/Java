package chapter11.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTest {
    static Queue q = new LinkedList(); // Queue는 이넡페이스이므로 해당 인터페이스 구현한 클래스를 통해서 큐를 이용
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("명령어를 입력해주세요.");
            System.out.printf(">>");
            String input = scanner.nextLine().trim();
            if(input.equalsIgnoreCase("help")){
                save(input);
                System.out.println("HELP");
                System.out.println("q또는 Q 는 종료");
                System.out.println("history - 최근에 입력한 명령어를 보여줌");
            } else if(input.equalsIgnoreCase("q")){
                break;
            } else if(input.equalsIgnoreCase("history")){
                save(input);
                final int SIZE = q.size();

                for(int i = 0; i < SIZE; i++){
                    Object poll = q.poll();
                    System.out.println(poll);
                    q.offer(poll);
                }
            }else{
                save(input);
            }

        }
        System.out.println("프로그램 종료");

    }
    static void save(String command){
        if(!"".equals(command)){
            q.offer(command);
        }

        if(q.size() > MAX_SIZE){
            q.poll(); // 제일오래된거 하나버림
        }
    }
}
