package Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        set.add("Polin");
        set.add("Nafisha");
        set.add("Polin"); //Doesn't repeat this value
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println("Iterating through the set: " + itr.next());
        }

        System.out.println("**********************");

        for (String s:set){
            System.out.println("For each: " + s);
        }
        System.out.println("**********************");
        System.out.println("**********************");

        HashSet <Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(2);
        set2.add(15);
        set2.add(40);
        set2.add(60);
        for (Integer in:set2){
            System.out.println("Not in order :" + in);
        }

//        set2.add(30);
//        System.out.println(set2.size());
        HashSet <Integer> set3 = new HashSet<>();
        set3.add(31);
        set3.add(25);
        set3.add(16);
        set3.add(46);
        set3.add(16);

        set2.addAll(set3);
        System.out.println("Added set3 : " + set2.size());
        set2.removeAll(set3);
        System.out.println("Removing set3 : "+ set2.size());



    }
}
