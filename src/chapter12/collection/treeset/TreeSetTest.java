package chapter12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet();

        tree.add("ccc");
        tree.add("aaa");
        tree.add("bbb");

        System.out.println(tree);
    }
}
