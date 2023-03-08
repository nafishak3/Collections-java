package Sumo;

import java.awt.*;
import java.util.*;
import java.util.List;


public class high_priority {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static String reverseString(String str) {
        String rev = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;

    }

//    public static HashMap<String, Integer> words(String sentence, Integer count) {
//        sentence = " ";
//        count = 1;
////        String[] array = sentence.split(" ");
//
////        HashMap<String, Integer>str  = new HashMap<>();
////        int count = 1;
////        for(Map.Entry s : str.entrySet()){
////            if(str.containsValue(s)) {
////                str.put(sentence, count);
////                System.out.println(s, s.getValue() + " " + s.getKey());
////            }else {
////                str.put(sentence, count);
////            }
////
////        }
//        return str;
//    }
    public static void main(String[] args) {
        high_priority hp = new high_priority();

        System.out.println(reverseString("nafisha"));
        System.out.println("*********************");

        String sentence = "we the people of the people";

//        HashMap <String,Integer> hs = new HashMap<>(words(sentence));
//        for (Map.Entry e : hs.entrySet()){
//            System.out.println(e.getValue()+ " " + e.getKey());
//        }
//        System.out.println();

//        words(sentence, 1);

        int count = charString("nafisha", 'a');
        System.out.println("a= " + count);

        System.out.println("*******************************");

        equals();

        System.out.println("*******************************");

        highest();

        System.out.println("*******************************");

        sortAnArray();

        System.out.println("*******************************");
        arrayList();
















    }
    public static int charString(String name, char charactor){
//        name = " ";
//        Boolean contains = name.contains(" ");
        int count = 1;
        for (int i=0; i<name.length()-1; i++){
            if(name.charAt(i)== charactor){
                count++;
            }
        }
        return count;
    }




//    Array: {1,4,3,5,2,6}
//return equals to 6
    public static int[] equals(){
       int[] i = {1,4,3,5,2,6};
        for (int k=0; k<=i.length; k++){
            for(int j=k; j<i.length; j++){
                if(i[k] + i[j] == 6){
                    System.out.println(i[k] + " and " + i[j] + " = 6");
                }
            }
        }
        return i;
    }


//    Array: {1,2,3,5,6}
//4 is missing so which number is closest highest number to 4 if there uss 2 number then pick the hieghest one.
    public static int[] highest(){
        int[] array = {1,2,3,5,6};
        for (int i = 0; i<=array.length-1; i++){
                if(array[i] == 3 ){
                    System.out.println(array[i] + " less then 4");
                    break;
                }
                if(array[i] == 5){
                    System.out.println(array[i] + " greater than 4");
                     if (array[i] == 5 || 5> 4){
                        System.out.println("4 belongs front of the heightnum = " + array[i]);
                        break;
                    }
                }
        }
        return array;
    }

//    Array: sort an array {4, 7, 1, 3, 2}
    public  static void sortAnArray(){
        int [] array = {4, 7, 1, 3, 2};
        for (int e : array){
            System.out.println(e);
        }
        System.out.println("sorted list");
        Arrays.sort(array);
        for (int e : array){
            System.out.println(e);

        }

    }
//    Find same index for 2 differnt arrays and create another list
//    Array {1, 4, 5, 7}
//    Array {6, 4, 3, 7, 5}

    public static Set<Integer> arrayList(){
        Integer[] array1 = {1, 4, 5, 7};
        Integer[] array2 = {6, 4, 3, 7, 5};
//        1, 3, 4, 5, 6, 7
//        4, 5, 7

        HashSet <Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(array1));

        HashSet <Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(array2));

        for (Integer e : set){
            System.out.println(e);
        }
        System.out.println("New list");

        set.remove(1);
        set.remove(3);
        set.remove(6);

        Integer [] match = {};
        match = set.toArray(match);
        for (Integer e : match){
            System.out.println(e);
        }

        return set;

    }





}
