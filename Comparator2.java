import java.util.ArrayList;
import java.util.*;

class Student5{
    int age;
    String name;
    
    Student5(int age, String name){
        this.age=age;
        this.name=name;
    }
}

class AgeComparator implements Comparator<Student5>{
    public int compare(Student5 s1, Student5 s2){
        if (s1.age==s2.age)
            return 0;
        if(s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}
public class Comparator2 {
    public static void main(String[] args) {
        Student5 s11= new Student5(22,"Febin");
        Student5 s22 = new Student5(19,"Lolan");
        ArrayList<Student5> al = new ArrayList<>();
        al.add(s11);
        al.add(s22);
        Collections.sort(al,new AgeComparator());
        for(Student5 st:al)
            System.out.println(st.age+st.name);
    }
}
    

