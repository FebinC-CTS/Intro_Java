//Sort ArrayList by marks of students

import java.util.*;

class Student{
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class CollectionPractHashMap {
    public static void main(String[] args) {
        Student s1 = new Student(102, "Febin", 92);
        Student s2 = new Student(109, "Soha", 95);
        Student s3 = new Student(152, "Rohith", 80);

        ArrayList<Student> st = new ArrayList<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);

        //st.sort(Comparator.comparingInt((Student s) -> s.marks));
        st.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());


        for(Student e:st)
            System.out.println(e);
    }
    

}

