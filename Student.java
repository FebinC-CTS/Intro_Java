class Std {
    int id;
    String name;
    String std;
    int marks;

    Std(){};

    Std(int id, String name, String std, int marks){
        this.id=id;
        this.name=name;
        this.std=std;
        this.marks=marks;
    }

    void attendClasses(){
        System.out.println(name+" is attending the class");
    }
    void writingAssignments(){
        System.out.println(name+" is writing assingments");
    }
    void writingExams(){
        System.out.println(name+" is writing exams");
    }
}

public class Student{
    public static void main (String[] args){
        Std studentObj = new Std(101, "Febin", "Final Year Eng.",98);

        studentObj.attendClasses();
        studentObj.writingAssignments();
        studentObj.writingExams();
    }
}
