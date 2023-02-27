package PRO.l9.ex_001_threads.threadAndRunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Примірник класу OtherThread передається до конструктора об'єкта класу Thread
        Thread other = new Thread(new OtherThread());

        other.start();

        for (int i = 0; i < 5; i++) {
            // Метод sleep() присипляє потік на кількість мілісекунд
            Thread.sleep(2000);
            System.out.println("i = " + i);
            if (i == 2) {
                // Метод join(), зупиняє потік, у якому виконується метод join()
                // і буде заблокований (потік main), доки не закінчиться потік Other
                other.join();
            }
        }
    }
}

class OtherThread implements Runnable {
    // Для того, щоб потік виконувався паралельно
    public void run() {
        for (int j = 0; j < 5; j++) {
            // Метод sleep() присипляє потік на кількість мілісекунд
            try {
                Thread.sleep(2000);
                System.out.println("j = " + j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}