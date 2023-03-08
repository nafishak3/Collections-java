package Sumo;

public class If_else {

    public int ifElse(int i, int n){
        if(i<n){
            System.out.println("i is less " + i);
        }
        else {
            System.out.println("blah");
        }
        return i;
    }

    public void forloop( int n){
        for(int i=n;i<n; i++ ){
            System.out.println(i);
        }
    }
    public char oneMethod(int whereToStart, int whereToFinish, char thing) {
        for (int i = whereToStart; i < whereToFinish; i++) {
            System.out.println(thing);
        }
        return thing;
    }

    public static void main(String[] args) {
        If_else i = new If_else();
        i.ifElse(10, 20);
        System.out.println("***********************");
        i.forloop(10);


    }
}

