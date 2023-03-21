package Sumo;

public class RevString {

    public static void main(String[] args) {
        RevString rv = new RevString();
        System.out.println(rv.reverse("Why"));

    }
    public String reverse(String str) {
        String rev = " ";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
