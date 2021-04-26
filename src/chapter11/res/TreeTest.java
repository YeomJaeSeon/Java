package chapter11.res;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {
        // TreeSet - BST기반
        Set set = new TreeSet();

        for(int i = 0; set.size() < 6; i++){
            set.add((int)(Math.random() * 45) + 1);
        }


        System.out.println("set = " + set);
        TreeSet treeSet = (TreeSet) set;

        System.out.println("hashSet. = " + treeSet.tailSet(10));

    }
}
