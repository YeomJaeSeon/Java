package chapter11.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("asdf", "1234");
        map.put("aaaa", "1234");
        map.put("aaaa", "1111");

        System.out.println("map = " + map);
        // map은 key중복 X 덮어씀
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("아이디 입력해주세요");
            String id = scanner.nextLine().trim();
            System.out.println("비밀번호 입력해주세요");
            String pwd = scanner.nextLine().trim();

            // key가 포함되는지
            if(!map.containsKey(id)){
                System.out.println("일치하는 아이디가 없어요");
                continue;
            }
            if(!map.get(id).equals(pwd)){
                System.out.println("비밀번호가 일치하지않아요.");
                continue;
            }else{
                System.out.println("일치!");
                break;
            }
        }
    }
}
