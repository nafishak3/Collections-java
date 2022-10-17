package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.size());

        names.add("Sakif"); //0
        names.add("Polin"); //1
        names.add("Ish"); //2
        names.add("Shad"); //3
        System.out.println(names.size());
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        names.add(4, "Arnob");
        System.out.println(names);

        names.add(1, "Nafisha");
        System.out.println(names);

        //Collections.sort(names);
        //System.out.println(names);

        names.addFirst("Khanom");
        System.out.println(names);

        names.addLast("Shadman");
        System.out.println(names);

        names.removeFirst();
        System.out.println(names);

        names.removeLast();
        System.out.println(names);

        //names.clear();
        //System.out.println(names);

        System.out.println(names.get(2));

    }
}
