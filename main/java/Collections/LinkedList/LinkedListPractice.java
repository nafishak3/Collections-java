package Collections.LinkedList;

import java.util.*;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList <String> str = new LinkedList<>(Arrays.asList("Nafisha", "Polin", "Fish"));
        Iterator itr = str.iterator();
        while (itr.hasNext()){
            System.out.println("Iterating through the list: " +itr.next());
        }
        System.out.println("**************");
        for (String s:str){
            System.out.println("For each in linkedlist: " + s);
        }
        System.out.println("**************");
        System.out.println("*********");
        System.out.println("SOMETHING NEW");
        System.out.println("**************");
        System.out.println("*********");

        str.addFirst("My Fulll name:");
        System.out.println(str);

        str.addLast("NO Last name");
        System.out.println("--> " + str);

        Collections.sort(str);
        System.out.println("Sorting the list " + str);

        System.out.println("**************");
        System.out.println("*********");
        System.out.println("IS EMPTY, ADDALL AND REMOVE");
        System.out.println("**************");
        System.out.println("*********");

        LinkedList <Integer> in = new LinkedList<>(Arrays.asList(5,10,15));
        System.out.println("Is the list empty: " + in.isEmpty());

        LinkedList <Integer> in2 = new LinkedList<>(Arrays.asList(4,8,9,15));

        in.addAll(in2);
        System.out.println("ADD-ALL form in2: " + in);

        in.removeAll(in2);
        System.out.println("Remove-All from in2: " + in);










    }
}
