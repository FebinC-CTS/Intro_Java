class Student1{
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println("Name: "+name);
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("Febin");
        s.getName();
    }
}