import java.util.*;

class Student4 implements Comparable<Student4>{
    int age; 
    String name;
    
    Student4(int age, String name){
        this.age=age;
        this.name=name;
    }

    /*To sort by age
    public int compareTo(Student4 st) {
    return Integer.compare(this.age, st.age); }

    To sort by name
    public int compareTo(Student4 st) {
    return this.name.compareTo(st.name);
}*/

    public int compareTo(Student4 st){
        if (age==st.age)
            return 0;
        if(age>st.age)
            return 1;
        else
            return -1;
    }
}

public class Comparable1{
    public static void main(String[] args) {
        ArrayList <Student4> al = new ArrayList<>();
        Student4 s1 = new Student4(21,"Febin");
        Student4 s2 = new Student4(23, "Lolan");
        al.add(s1);
        al.add(s2);
        al.add(new Student4(24, "Ammani"));
        Collections.sort(al);
        for(Student4 st: al)
        System.out.println(st.age+st.name);


    }
}