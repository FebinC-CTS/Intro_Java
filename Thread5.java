// 4) Using the Thread Class: Thread(Runnable r, String name)

public class Thread5 implements Runnable{
    public void run(){
        System.out.println("The Thread is running");
    }

    public static void main(String[] args) {
        Runnable r1 = new Thread5();
        Thread t1 = new Thread(r1, "My New Thread");
        t1.start();

        System.out.println(t1.getName());
    }
}
