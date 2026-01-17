class MyThread extends Thread{
    private String threadName;
    MyThread(String name){
        threadName=name;
    }
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(threadName + " - Count: "+i);
            try{
                Thread.sleep(1000); //Waits for 1s
            }catch(InterruptedException e){
                System.out.println(threadName + " Interrupted");
            }
        }
        System.out.println(threadName + " Finished");
    }
}


public class Thread1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        //Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();

        try{ //Waiting for the threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("All threads have been finished");
    }
}
