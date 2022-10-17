package Collections.ArrayList;

import java.util.*;

public class ArrayListConcept {
    public static void main(String[] args) {

        ArrayList<String> city1 = new ArrayList<>(Arrays.asList("Flushing, Jamaica, Richmond"));

        ArrayList<String> city = new ArrayList<>();
        city.add("Jamaica");
        city.add("Bayside");
        city.add("Ozone Park");
        city.add("Flushing");
        city.add("Jamaica");


        System.out.println(city); //whole arrayList

        System.out.println(city.get(1)); //value of index 1

        System.out.println(city.size()); //size of arrayList

        System.out.println("-----------------");

        //to print all the values
        //for loop
        for (int i=0; i<city.size(); i++) {
            System.out.println(city.get(i));
        }
        System.out.println("-----------------");

        //for-each loop
        for (String s : city) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        //iterator
        Iterator<String> it = city.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("UK");
        country.add("BD");
        country.add("China");
        country.add("Jamaica");
        System.out.println(country);

        ArrayList<String> blackCountry = new ArrayList<>();
        blackCountry.add("Nigeria"); //0
        blackCountry.add("Uganda"); //1
        blackCountry.add("Haiti"); //2
        blackCountry.add("Okanda"); //3
        blackCountry.add("Jamaica"); //4
        System.out.println(blackCountry);

        //addAll() method:
        country.addAll(blackCountry);
        System.out.println(country);
        System.out.println(blackCountry);

        //remove()
        country.remove("BD");
        System.out.println(country);

        country.remove(2);
        System.out.println(country);

        //removeAll():
        country.removeAll(blackCountry);
        System.out.println(country);

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(11);
        num.add(321);
        num.add(98511);

        List<Integer> num1 = new ArrayList<>(Arrays.asList(11,25,1,9,89));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(11,31,25,78,9));

        System.out.println(num1);

        Collections.sort(num1); // for sorting
        System.out.println(num1);

        //num1.removeAll(num2); //for diffrences
        //System.out.println(num1);

        num1.retainAll(num2); //for common
        System.out.println(num1);
    }
}
