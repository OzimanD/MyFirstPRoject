package PRO.l9.ex_002_synchronization.synchronization;

public class Ticket {
    boolean isBought;
    int place;

    Ticket(int place) {
        this.place = place;
    }

    // Квиток купуватиметься касиром
    synchronized void buy(Cashier c) {
        if (!isBought) {
            try {
                // Якщо квиток не куплено, на 1 сек засипаємо
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            // Квиток куплено
            isBought = true;
            System.out.println("Cashier " + c.id + " ticket " + this.place);
        }
    }
}
