package PRO.l9.ex_001_threads.threadInfo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Статичний метод currentThread() інкапсулює поточний потік у цей об'єкт
        Thread myThread = Thread.currentThread();
        // Дізнаємось ім'я потоку
        System.out.println("Name of Thread: " + myThread.getName());
        // Змінюємо ім'я потоку
        myThread.setName("MyThread");
        System.out.println("Thread name: " + myThread.getName());
        // Дізнаємось пріоритет потоку, за замовчуванням 5 у main
        System.out.println("Priority: " + myThread.getPriority());
        // Змінюємо пріоритет потоку
        myThread.setPriority(10);
        System.out.println("Priority: " + myThread.getPriority());
        // Перевіряємо, чи живий потік
        System.out.println("Is Thread Alive?: " + myThread.isAlive());

        // Який потік виконається першим – не відомо
        new OtherThread().start();

        for (int i = 0; i < 4; i++) {
            // Метод sleep() присипляє потік на кількість мілісекунд
            Thread.sleep(2000);
            System.out.println("i = " + i);
        }
    }
}

class OtherThread extends Thread {
    // Для того, щоб потік виконувався паралельно
    public void run() {
        for (int j = 0; j < 4; j++) {
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