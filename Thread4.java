// 3) Using the Thread Class: Thread(String Name)

public class Thread4 {
    public static void main(String[] args) {
        Thread t = new Thread("My Thread");
        t.start();

        String str=t.getName();
        System.out.println(str);
    }
}
