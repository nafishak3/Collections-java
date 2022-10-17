package Collections.ArrayList;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Blue");
        color.add("Green");
        color.add("Yellow");
        color.add("Red");
        color.add("Green");

        //Traversing color through iterator
        Iterator itr = color.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("*****************");

        //for each loop
        for (String col:color)
            System.out.println("For each Loop = " + col);

        System.out.println("*****************");
        //sorting the list
        Collections.sort(color);
        System.out.println("Sorting the list = " + color);

        System.out.println("*****************");

        //accessing the element (GET)
        System.out.println("Returning 3rd elemnet " + color.get(3));

        //Changing the element (SET)
        color.set(2, "Green-one");
        System.out.println("Changed 2nd element " + color.get(2));

        System.out.println("*****************");

        //iterating in reverse order
        ListIterator<String> list = color.listIterator(color.size());
        while (list.hasPrevious()){
            System.out.println("Iterating in reverse order =" + list.previous());
        }

        System.out.println("*****************");
        System.out.println("*****************");


        //Sorting the List using (Collection.sort)
        ArrayList <Integer> in = new ArrayList<>(Arrays.asList(10, 3, 5, 20));

        Collections.sort(in);
        for (Integer in1:in)
            System.out.println("Sorting the list = " + in1);

        System.out.println("*****************");
        ArrayList <Integer> in2 = new ArrayList<>(Arrays.asList(10, 6, 8, 40));

        //Add two methods (in & in2)
        in.addAll(in2);
        System.out.println("Adding all inside in = " + in);
        System.out.println("Nothing was added inside in2 = " + in2);

        System.out.println("*****************");

        // remove from in
        in.remove(2);
        System.out.println("Removing index 2: 10 = " + in);

        System.out.println("*****************");
        //Removing all in2 from in
        in.removeAll(in2);
        //It will delete the common value from both methods
        System.out.println("Removing in2 from in = " + in);

        System.out.println("*****************");

        //Using for loop
        for (int i=0; i<in.size();i++){
            System.out.println("Using for loop for in array = " + in.get(i));
        }
        System.out.println("*****************");
        System.out.println("*****************");

        ArrayList <String> s = new ArrayList<>();
        //using the (isEmpthy) method we can have return boolean type
        System.out.println("Is arraylist empty " + s.isEmpty());
        s.add("nk");
        s.add("shad");
        System.out.println("Is arraylist empty " + s.isEmpty());





    }
}
