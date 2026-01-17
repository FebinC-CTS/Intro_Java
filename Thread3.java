// 2) Java Thread Example by implementing Runnable interface

public class Thread3 implements Runnable{
    public void run(){
        System.out.println("Thread is Running!");
    }

    public static void main(String[] args) {
        Thread3 m1 = new Thread3();
        Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)  
        t1.start();
        t1.run(); //works even if not using constructor
    }
}
