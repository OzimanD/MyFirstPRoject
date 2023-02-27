package PRO.l9.ex_002_synchronization.synchronization;

public class Cashier extends Thread {
    int id;
    Ticket[] t;

    Cashier(int id, Ticket[] t) {
        this.id = id;
        this.t = t;
    }

    // synchronized вказує на те, що все, що відбувається в методі run робиться як єдине ціле
    public synchronized void run() {
        for (int i = 0; i < t.length; i++) {
            // Касир переглядає масив квитків, якщо якийсь квиток не куплено, змінює прапор на true
//            if (!t[i].isBought) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    System.out.println(e);
//                }
//                t[i].isBought = true;
//                System.out.println("Cashier " + id + " ticket " + t[i].place);
//            }
            t[i].buy(this);
        }
    }
}
