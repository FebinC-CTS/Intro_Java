// 1) Creating Thread by Extending Thread Class


public class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread is Running!");
            try {
                Thread.sleep(1000);
            }   
            catch (InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread2 t1 = new Thread2();
        //t1.run(); // Just a normal method call → prints "Thread is Running!" in main thread
        //System.out.println(t1.getState());
        System.out.println(t1.getState());
        t1.start(); // Creates a new thread → prints "Thread is Running!" in parallel
        System.out.println(t1.getState());
        System.out.println(t1.getPriority());
        t1.setPriority(3);
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        t1.join(1000);
        System.out.println(t1.getState());
        for(int i=0;i<3;i++){
            System.out.println("Hey there...");
        }
        t1.join();
        System.out.println(t1.getState());    
            
    }
}

