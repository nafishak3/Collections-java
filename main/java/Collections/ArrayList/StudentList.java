package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    public static void main(String[] args) {
        //Creating the (Students) class object
        Students s1 = new Students(01, " Nafisha ", 22);
        Students s2 = new Students(02, " Shad ", 99);
        Students s3 = new Students(3, " Polin ", 22);

        //Creating an arraylist
        ArrayList <Students> student = new ArrayList<>();
        student.add(s1); //the object from (Students class)
        student.add(s2);
        student.add(s3);

        //Getting the iterator
        Iterator i = student.iterator();

        //traversing though iterator objects
        while (i.hasNext()){
            Students s = (Students)i.next();
            System.out.println(s.students + s.names + s.studentId);
        }



    }
}
