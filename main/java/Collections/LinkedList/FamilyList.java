package Collections.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class FamilyList {
    public static void main(String[] args) {

        //Creating the object for (Family) class
        Family f1 = new Family(1, "Mustafizur", 60);
        Family f2 = new Family(2, "Zobayada", 52);
        Family f3 =  new Family(3, "Munatsir", 27);
        Family f4 = new Family(4, "Nafisha", 23);

        //Making the list of family
        LinkedList <Family> list = new LinkedList<>(Arrays.asList());
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);

        //Iterating through the list
        Iterator itr = list.iterator();

        //Traversing through the list
        while (itr.hasNext()){
            Family f = (Family)itr.next();
            System.out.println("Iterator: " + f.members + " " + f.names + " " + f.age);
        }
        System.out.println("***********************");

        //using for each to traverse through the list
        for (Family y:list) {
            System.out.println("For each Loop: " + y.members +" " + y.names + " " + y.age);
        }
     }
}
