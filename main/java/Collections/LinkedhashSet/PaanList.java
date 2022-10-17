package Collections.LinkedhashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PaanList {
    public static void main(String[] args) {
        PaanLinkedHashSet p1 = new PaanLinkedHashSet(1, "paan");
        PaanLinkedHashSet p2 = new PaanLinkedHashSet(2, "Chupari");
        PaanLinkedHashSet p3 = new PaanLinkedHashSet(3, "Choon");
        PaanLinkedHashSet p4 = new PaanLinkedHashSet(4, "Jorda");

        LinkedHashSet <PaanLinkedHashSet> linkset = new LinkedHashSet<>();
        linkset.add(p1);
        linkset.add(p2);
        linkset.add(p3);
        linkset.add(p4);

        for (PaanLinkedHashSet p:linkset){
            System.out.println(p.eat + " " + p.paan);
        }
        System.out.println("****************");

        Iterator itr = linkset.iterator();

        while (itr.hasNext()){
            PaanLinkedHashSet p = (PaanLinkedHashSet)itr.next();
            System.out.println(p.eat + " " + p.paan);
        }
    }
}
