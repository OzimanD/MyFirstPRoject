package PRO.l9_5.ex_003_interrupt.interrupt;

class Main extends Thread {
    static int howOften;
    Thread th;
    String word;

    Main(String whatToSay) {
        word = whatToSay;
    }

    void setThread(Thread t) {
        th = t;
    }

    public void run() {
        while (!interrupted()) {
            th.interrupt();
            for (int i = 0; i < howOften; i++) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        howOften = 2;
        Thread cur = currentThread();
        cur.setPriority(Thread.MIN_PRIORITY);
        Main th1 = new Main("Did");
        Main th2 = new Main("Did Not");
        th1.setThread(th2);
        th2.setThread(th1);
        th1.start();
        th2.start();
    }
}
