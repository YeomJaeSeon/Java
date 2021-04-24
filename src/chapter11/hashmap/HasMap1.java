package chapter11.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HasMap1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        System.out.println("map = " + map);
        map.put("asdf", "1234");
    // 같은 key이면 에러발생 x, 그냥 덮어씀
        System.out.println("map = " + map);

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("id, pwd입력,");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.print("password : ");
            String password = s.nextLine().trim();

            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신id없어요");
                continue;
            }
            if(!(map.get(id)).equals(password)){
                System.out.println("비밀번호가 일치하지 않습니다.");
            }else{
                System.out.println("일치!");
                break;
            }

        }

    }
}
