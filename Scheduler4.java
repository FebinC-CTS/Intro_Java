class Print{
    public synchronized void printMsg(String s){
        for (int i=0;i<4;i++){
            System.out.print("Goodnight: ");
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

class MyThread extends Thread{
    Print p;
    String s;
    MyThread(Print p, String s){
        this.p=p;
        this.s=s;
    }
    public void run(){
        p.printMsg(s);
    }
}

public class Scheduler4 {
    public static void main(String[] args) {
        Print p1=new Print();
        Print p2=new Print();
        MyThread t1= new MyThread(p1,"Dhoni");
        MyThread t2 = new MyThread(p2, "Sachin");
        t1.start();
        t2.start();
    }
}
