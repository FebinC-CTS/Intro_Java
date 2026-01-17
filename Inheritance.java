class Salary{
    int sal=100000;
}
class Fees extends Salary{
    int fee=100;
}

public class Inheritance{
    public static void main(String[] args) {
        Fees a = new Fees();
        System.out.println(a.sal);
        System.out.println(a.fee);
    }
}