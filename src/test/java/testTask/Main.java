package testTask;

import fb.TestTask1;

import java.util.*;

public class Main extends TestTask1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.size());

    }
}
