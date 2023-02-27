package PRO.l9.ex_004_correctWaiting.correctWaiting;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Producer pr = new Producer(p, 5);
        Consumer cons = new Consumer(p, 5);

        pr.start();
        cons.start();
    }
}

class Product {
    int id;
    boolean isProduced;

    synchronized void getIdProduct() {
        // Якщо товар не зроблено, споживач засинає
        if (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Get " + this.id);
        isProduced = false;
        // Метод notify() виводить із блокування інший потік, який знаходився у методі wait()
        notify();
    }

    synchronized void setIdProduct(int id) {
        // Якщо товар виготовлено, тоді засинаємо
        if (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.id = id;
        System.out.println("Set " + this.id);
        isProduced = true;
        notify();
    }
}

class Producer extends Thread {
    Product p;
    int count;

    Producer(Product p, int count) {
        this.p = p;
        this.count = count;
    }

    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.setIdProduct(i);
        }
    }
}

class Consumer extends Thread {
    Product p;
    int count;

    Consumer(Product p, int count) {
        this.p = p;
        this.count = count;
    }

    // Отримання товару
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.getIdProduct();
        }
    }
}
