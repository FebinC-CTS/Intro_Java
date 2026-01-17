class Table{
    synchronized void printTable(int n){
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

class Thread11 extends Thread{
    Table t;
    Thread11(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Thread22 extends Thread{
    Table t;
    Thread22(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(10);
    }
}

public class Scheduler2 {
    public static void main(String[] args) {
        Table obj = new Table();
        Thread11 t1 = new Thread11(obj);
        Thread22 t2 = new Thread22(obj);
        t1.start();
        t2.start();
    }
}
