class Tablee2{
    void printTable(int n){
        synchronized(this){
            for (int i=1;i<=5;i++){
                System.out.println(i*n);
            }
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

class Thread111 extends Thread{
    Tablee2 t;
    Thread111(Tablee2 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Thread222 extends Thread{
    Tablee2 t;
    Thread222(Tablee2 t){
        this.t=t;
    }

    public void run(){
        t.printTable(10);
    }
}

public class Scheduler3 {
    public static void main(String[] args) {
        final Tablee2 obj = new Tablee2();
        Thread111 t1 = new Thread111(obj);
        Thread222 t2 = new Thread222(obj);
        t1.start();
        t2.start();
    }
}