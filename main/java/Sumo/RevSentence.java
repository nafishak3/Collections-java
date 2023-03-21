package Sumo;

public class RevSentence {

    public static void main(String[] args) {
        RevString rv = new RevString();
        System.out.println(rv.reverse("We are the people"));

        String s = "we      are  th    em";
        System.out.println(removeSp(s));


    }
    public String revSen(String str){
        String[] strSplit = str.split(" ");
        String n = " ";
        for(int i=strSplit.length; i>=0; i--){
           n = n + strSplit[i];

        }
        return n;

    }
    public static String removeSp(String str){
        String s = str.replaceAll(" ",  " //e");
        String n =  s.trim();
        return n;
    }

}
