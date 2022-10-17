package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Sakif");
        map.put(2, "Nafisha");
        map.put(333, "Polin");
        map.put(4, "Arnob");
        map.put(5, "Ish");
        map.put(1, "Shad");
        map.put(1, "Shadman");
        map.put(0, "Tom");
        map.put(0, "Sakif");
        map.put(10, "");
        map.put(18, "");

        System.out.println(map.get(333));
        System.out.println(map.size());

        System.out.println(map);

        HashMap<String, String> ccMap = new HashMap<>();
        ccMap.put("USA", "Washington DC");
        ccMap.put("BD", "Dhaka");
        ccMap.put("UK", "London");
        ccMap.put("India", "New Delhi");
        ccMap.put(null, "New York");
        ccMap.put(null, "New Jersey");
        ccMap.put("China", null);
        ccMap.put("Korea", null);
        ccMap.put("Egypt", null);
        ccMap.put("USA", "Maryland");

        System.out.println(ccMap);


        ccMap.remove("Korea");
        System.out.println(ccMap);

//        ccMap.remove("BD", "Dhaka");
//        System.out.println(ccMap);

        System.out.println(ccMap.get("USA"));

        //iterator: over the keys: by using keySet()
        Iterator<String> it = ccMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            String value = ccMap.get(key);
            //System.out.println("key = " + key + " value = " + value);
            System.out.println(key + " " + value);
        }
        System.out.println("******************");

        //iterator: over the set(pair): by using entrySet
        Iterator<Map.Entry<String, String>> itr = ccMap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String,String> entry = itr.next();
            System.out.println("key = " + entry.getKey() + " value = "
                    + entry.getValue());
        }
    }
}
