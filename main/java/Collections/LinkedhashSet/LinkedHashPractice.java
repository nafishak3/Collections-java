package Collections.LinkedhashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashPractice {
    public static void main(String[] args) {
        LinkedHashSet <String> names = new LinkedHashSet<>();
        names.add("Nk");
        names.add("pk");
        names.add("lk");
        names.add("sl");
        names.add("mk");
        names.add("lk");
        names.add("");

        Iterator itr = names.iterator();
        while (itr.hasNext()){
            System.out.println("Maintains insertion order: " + itr.next());
        }
        System.out.println("******************");

        System.out.println (names.remove("mk")+ " : Removing the element mk will return TRUE");

        System.out.println(names);

        System.out.println("******************");

        System.out.println(names.remove("Nothing") + " : This element nothing is not presented so FLASE");

        System.out.println("******************");



    }
}
