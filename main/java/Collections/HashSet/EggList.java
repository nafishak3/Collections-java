package Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class EggList {
    public static void main(String[] args) {

        //Creating the object for the class (EggHash)
        EggHash e1 = new EggHash("Chicken Egg", 12, 1);
        EggHash e2 = new EggHash("Goat Egg", 5, 2);
        EggHash e3 = new EggHash("Bird Egg", 3, 5);

        //Creating a hashlist
        HashSet <EggHash> list = new HashSet<>();
        list.add(e1); //Adding the objects from the class
        list.add(e2);
        list.add(e3);

        //Using for each loop to traverse through the list
        for (EggHash h:list){
            System.out.println("Hash-set DOESN'T KEEP ORDER : " + h.name + " " + h.quantity + " " + h.yolk);
        }
        System.out.println("****************");

        //Iterating through the list
        Iterator itr = list.iterator();

        //Traversing through the list
        while (itr.hasNext()){
            EggHash eg = (EggHash)itr.next();
            System.out.println("Iterator " + eg.name + " " + eg.quantity + " " + eg.yolk );


        }

        String s = "nafisha";
        char[] t = s.toCharArray();

        for(int i=t.length-1; i>=0; i--){
            System.out.print(t[i]);
        }
        System.out.println();


    }
}
