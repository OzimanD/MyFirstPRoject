package PRO.l9_5.ex_001_threads.thread;

class Main extends Thread {
    String word;
    int delay; // тривалість паузи

    Main(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            for (; ; ) {
                System.out.print(word + " ");
                sleep(delay);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        new Main("ping", 33).start(); // 1/30 секунди
        new Main("PONG", 100).start(); // 1/10 секунди
    }
}
