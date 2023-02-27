package PRO.l9_5.ex_001_threads.runnable;

public class Main implements Runnable {
    private String word;
    private int delay;

    Main(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            for (; ; ) {
                System.out.print(word + " ");
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        Runnable ping = new Main("ping", 33);
        Runnable pong = new Main("PONG", 100);
        new Thread(ping).start();
        new Thread(pong).start();
    }
}
