package chapter7;

import java.util.HashMap;
import java.util.Map;

public class SingleCon {
    public static void main(String[] args) {
        Repository member = Repository.getInstance();
        System.out.println(Repository.age);
        System.out.println(Repository.name);
    }
}

final class Repository{
    static Repository instance = new Repository();
    static int age = 20;
    static String name = "염재선";

    private Repository(){
    }
    public static Repository getInstance(){
        return instance;
    }

}

