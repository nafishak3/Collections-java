package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class SubjectList {
    public static void main(String[] args) {

        // This is the Object for (subject) class
        Subject s1 = new Subject("(History)", "American history-", 400);
        Subject s2 = new Subject("(Math)", "Algabra-", 20);
        Subject s3 = new Subject("(Music)", "hip-hop-", 10);

        //Making a arraylist
        ArrayList <Subject> List = new ArrayList<>();
        //Adding the Subjects to list
        List.add(s1);
        List.add(s2);
        List.add(s3);

        //getting the iterator
        Iterator itr = List.iterator();

        //Traversing list
        while (itr.hasNext()){
            Subject l = (Subject) itr.next();
            System.out.println("Using iterator: " + l.subjects + " " + l.book + " " + l.page);
        }

        System.out.println("***********************");

        //Using for each
        for (Subject s: List){
            System.out.println("Using for each: " + s.subjects + " " +s.book + " " + s.page);
        }





    }
}
