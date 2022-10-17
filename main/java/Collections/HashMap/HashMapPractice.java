package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap <String,Integer> StudentId = new HashMap<>();
        StudentId.put("Nk", 31);
        StudentId.put("shad", 29);
        StudentId.put("polin", 01);
        StudentId.put("Sakif", 19);
        StudentId.put("sumo", 17);

        for (Map.Entry m : StudentId.entrySet()){
            System.out.println(" for each through map: " + m.getKey() + " " + m.getValue());
        }

        System.out.println("**********  Add Elements *************");


        StudentId.put("nah", 3);
        StudentId.putAll(StudentId);
        for (Map.Entry m2 : StudentId.entrySet()){
            System.out.println("After using put method: " + m2.getKey()+ " " + m2.getValue());
        }
        System.out.println("**************************");

        StudentId.putIfAbsent("sumo", 20);
        for (Map.Entry m3 : StudentId.entrySet()){
            System.out.println("After putIfAbsent : " + m3.getKey() + " " + m3.getValue() );
        }

        System.out.println("********* Remove elemnents *********" );

        StudentId.remove("sumo");
        for( Map.Entry r : StudentId.entrySet()){
            System.out.println("After removing key sumo: " + r.getValue() + " " + r.getKey());
        }
        System.out.println("********* Replace elements *********" );
        HashMap<Integer, String> famage = new HashMap<>();
        famage.put(23, "nk");
        famage.put(53, "amma");
        famage.put(27, "MK");
        famage.put(104, "Students");

        for (Map.Entry a:famage.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
        System.out.println("******************");
        famage.replace(104, "Myself");
        for (Map.Entry r1: famage.entrySet()){
            System.out.println("Afetr replacement of the value: " + r1.getKey() + " " + r1.getValue());
        }







    }
}
