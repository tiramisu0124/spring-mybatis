package sync;

public class Sync {
    public synchronized void test() {
        System.out.println("test开始..");
        System.out.println(this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test结束..");
    }



    public static void main(String[] args) {
        Sync sync = new Sync();
        for (int i = 0; i < 3; i++) {
            /*Thread thread = new MyThread();
            thread.start();*/

            Thread thread = new MyThreadA(sync);
            thread.start();
        }
    }
}
class MyThread extends Thread {

    public void run() {
        Sync sync = new Sync();
        sync.test();
        //System.out.println(sync);
    }
}

class MyThreadA extends Thread {
    private Sync sync;
    MyThreadA(Sync sync) {
        this.sync = sync;
    }
    public void run() {
        //Sync sync = new Sync();
        sync.test();
    }
}

