
class Table {

    void printTable(int m) {
        synchronized(this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i * m);
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

    class MyThread1 extends Thread{
        Table t;
        MyThread1(Table t){
            this.t =t;
        }

        public void run(){
            t.printTable(4);
        }
    }

    class MyThread2 extends Thread {
        Table t;
        MyThread2(Table t) {
            this.t=t;
        }

        public void run(){
            t.printTable(5);
        }
    }


public class ThreadSynchronization {
    public static void main(String[] arg) {
        Table table = new Table();
        MyThread1 my1 = new MyThread1(table);
        MyThread2 my2 = new MyThread2(table);

        my1.start();
        my2.start();
    }
}
