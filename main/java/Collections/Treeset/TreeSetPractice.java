package Collections.Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet < Integer> in = new TreeSet<>();
        in.add(5);
        in.add(15);
        in.add(50);
        in.add(10);
        in.add(100);
        in.add(23);

        Iterator itr = in.iterator();
        while (itr.hasNext()){
            System.out.println("TreeSet maintains Ascending order: " +itr.next());
        }

        System.out.println("****************");
        System.out.println("***********");
        System.out.println("NEWWWW");
        System.out.println("****************");
        System.out.println("***********");

        TreeSet < Integer> in2 = new TreeSet<>();
        in2.add(500);
        in2.add(2);
        in2.add(5);
        in2.add(10);
        in2.add(55);
        System.out.println("Lowest Value: " + in2.pollFirst());
        System.out.println("Highest Value: " + in2.pollLast());

        System.out.println("****************");
        System.out.println("NevigableSet operators");
        System.out.println("****************");

        TreeSet <Integer> n = new TreeSet<>();
        n.add(10);
        n.add(11);
        n.add(6);
        n.add(0);
        n.add(50);
        n.add(31);
        n.add(26);
        n.add(19);
        n.add(29);
        System.out.println("Printing the List" + n);
        System.out.println("Printing the list revers " + n.descendingSet());

        System.out.println("**************************");

        //headSet means to print everything before that object

        System.out.println("Prints everything before 19 " + n.headSet(19));
        System.out.println("Prints everything before & including 19 " + n.headSet(19, true));

        System.out.println("***************************");

        //subSet means to find the middle objects between two objects

        System.out.println("DEFAULT: subSet object between 10-31 " + n.subSet(10, 31));
        System.out.println("Middle object between 10-31 " + n.subSet(10, false, 31, false));
        System.out.println("Middle object between 10-31--* 31-IS-INCLUDED " + n.subSet(10, false, 31, true));
        System.out.println("Middle object between 10-31--* 10-IS-INCLUDED " + n.subSet(10, true, 31, false));

        System.out.println("***************************");

        //TailSet fidn the ending obejcts fROM a obejct
        System.out.println("DEFAULT of tailSet " + n.tailSet(26));
















    }
}
