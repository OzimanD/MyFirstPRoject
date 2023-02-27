package PRO.l9_5.ex_004_daemonThread.daemonThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Daemon d = new Daemon();
        Daemon daemon = new Daemon();
        daemon.setDaemon(true);
        daemon.start();
        d.start();
    }
}

class Daemon extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("старт потоку-демону");
                sleep(1000);
            } else {
                System.out.println("старт звичайного потоку");
                sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.print("Error" + e);
        } finally {
            if (!isDaemon())
                System.out.println("завершення роботи звичайного потоку");
            else
                System.out.println("завершення роботи потоку-демону");
        }
    }
}

