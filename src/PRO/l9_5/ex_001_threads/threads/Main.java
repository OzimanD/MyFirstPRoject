package PRO.l9_5.ex_001_threads.threads;

public class Main {
    // Побічний потік
    static EggVoice mAnotherOpinion;

    public static void main(String[] args) {
        // Створення потоку
        mAnotherOpinion = new EggVoice();
        System.out.println("Суперечка розпочата...");
        // Запуск потоку
        mAnotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                // Зупиняє потік на 1 секунду
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("курка!");
        }

        // Слово «курка» сказано 5 разів
        // Якщо опонент ще не сказав останнє слово
        System.out.println(mAnotherOpinion.isAlive());

        if (mAnotherOpinion.isAlive()) {
            try {
                // Почекати поки що опонент закінчить висловлюватися.
                mAnotherOpinion.join();
            } catch (InterruptedException e) {
            }
            System.out.println("Першим з'явилося яйце!");
            // Якщо опонент вже перестав висловлюватися
        } else {
            System.out.println("Першою з'явилася курка!");
        }
        System.out.println("Суперечка закінчена!");
    }
}

class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Зупиняє потік на 1 секунду
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("яйцо!");
        }
        // Слово «яйце» сказано 5 разів
    }
}