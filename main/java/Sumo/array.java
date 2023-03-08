package Sumo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array {
    public static void main(String[] args) {
  //    1. Write a Java program to create a new array list, add some colors (string) and print out the collection

        ArrayList <String> str = new ArrayList<>();
        str.add("yellow");
        str.add("green");
        str.add("purple");

        for(String s : str){
            System.out.println(s);
        }
        System.out.println("***************************");

        ArrayList<String> st = new ArrayList<>(Arrays.asList("yellow, greeen, purple, blue, skublue"));
        for(String e : st){
            System.out.println(e);
        }
        System.out.println("***************************");

//        2 Write a Java program to insert an element into the array list at the first and last positions.
        str.add(0, "first-yellow");
        str.add("lastlast");
        for(String s : str){
            System.out.println(s);
        }
        System.out.println("***************************");
//        3 Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(str.get(4));

        System.out.println("***************************");

//        4 Write a Java program to update specific array element by given element
        str.set(2, "purple");
        System.out.println(str.get(2));
        System.out.println("***************************");

//        5. Write a Java program to remove the third element from a array list.
        str.remove(3);
        System.out.println(str);
        System.out.println("***************************");

//        6. Write a Java program to search an element in a array list.
            if (str.contains("lastlast")){
                System.out.println("lastlast is there");
            }else {
                System.out.println("wrong search");
            }
        System.out.println("***************************");

//        7 Write a Java program to reverse elements in a array list
        ArrayList<String> rev = new ArrayList<>();
            for(int i=str.size()-1; i>=0; i--){
                rev.add(str.get(i));
            }
        System.out.println(rev);
        System.out.println("***************************");

//        8. Write a Java program to extract a portion of a array list.
        ArrayList<String> portion = new ArrayList<>();
        portion.add(str.get(0));
        portion.add(str.get(1));
        portion.add(str.get(2));
        for(String e: portion){
            System.out.println(e);
        }
        System.out.println(str.subList(0, 2));

        System.out.println("***************************");


//        ******** 9. Write a Java program of swap two elements in an array list.********
        ArrayList<String> swap = new ArrayList<>();
        swap.add("can't");
        swap.add("wait");
        swap.add("to sleep");
        swap.add("on my bed");
        for(String e: swap){
            System.out.println(e);
        }
        System.out.println("___________");
        Collections.swap(swap, 0, 1);
        for(String e: swap){
            System.out.println(e);
        }
        System.out.println("***************************");

//        10. Write a Java program to empty an array list.
        swap.removeAll(swap);
        for(String e: swap){
            System.out.println(e);
        }
        System.out.println("___________");

        for(String e: str){
            System.out.println(e);
        }
        System.out.println("***************************");
//        11. Write a Java program to trim the virtual capacity of an array list the current list size.
        str.trimToSize();
        for(String e: str){
            System.out.println(e);
        }
        System.out.println("***************************");
//        12. Write a Java program to print all the elements of a ArrayList using the position of the element
        int count = 0;
        for(String e: str){
            System.out.println(count+" "+e);
            count++;
        }

        System.out.println("********************************");


        int [] i = new int[3];
        i[0] = 1;
        i[1] = 13;
        i[2] = 14;
//        i[3] = 15;
//        System.out.println(i.length);
        int [] oneDementional = {2,4,3,3,10};
        System.out.println(oneDementional[2]);
        System.out.println(oneDementional[3]);
        if(oneDementional[1] > 0){
            System.out.println(oneDementional[1] + oneDementional[2]);
        }


        Integer[][] array2 = new Integer[2][3];
        array2[0][0] = 00;
        array2[0][1] = 11;
        array2[0][2] = 22;
//        array2[0][3] = 57;


        array2[1][0] = 111;
        array2[1][1] = 222;
        array2[1][2] = 333;
//        System.out.println(array2.length);


        int[][] www2 = {{1, 2, 3, 4, 5}, {2, 3, 4}, {5, 6},{0, 0, 0}};
//        System.out.println(www2.length);























    }
}
