package chapter13.practice;

import java.util.Scanner;
import java.util.Vector;

public class Num8 {
    Vector<String> words = new Vector<>();
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
    int interval = 2 * 1000; // 2초
    WordGenerator wg = new WordGenerator();

    public static void main(String[] args) {
        Num8 game = new Num8();
        game.wg.start();
        Vector words = game.words;
        while(true) {
            System.out.println(words);
            String prompt = ">>";
            System.out.print(prompt);
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();
            int index = words.indexOf(input);
            if(index!=-1) {
                words.remove(index);
            }
        }
    }
    class WordGenerator extends Thread {
        public void run() {
            int idx = (int)(Math.random() * data.length);
            words.add(data[idx]);
            while(true){
                try{
                    Thread.sleep(interval);
                }catch (InterruptedException e){}
                idx = (int)(Math.random() * data.length);
                words.add(data[idx]);
            }

        } // end of run()
    } // class WordGenerator

}
