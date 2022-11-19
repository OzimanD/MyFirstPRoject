package Chepter5.Loops;

import java.util.Scanner;

public class C13_DijkstraLoop {
    // Цикл Дейкстри.

    // При виконанні циклу Дейкстри в кожній ітерації відбувається обчислення умов, що охороняються.
    // Якщо хоча б одне з них істинно, виконується відповідна команда, що охороняється, після чого починається нова
    // ітерація (якщо істинні кілька умов, що охороняються, виконується тільки одна команда, що охороняється).
    // Якщо всі умови, що охороняються помилкові, цикл завершується.
    // Цикл Дейкстри з однією охоронною умовою і однією командою, що охороняється, являє собою, по суті, звичайний цикл
    // з передумовою (цикл «while»).
    // Класичний опис циклу Дейкстри.
    // do
    //   P1 ? S1,
    //     …
    //   Pn ? Sn
    // od

    // де:
    // do — маркер початку конструкції циклу,
    // od — маркер завершення конструкції циклу,
    // Pi — i-та умова, що охороняє (логічне вираження, яке може мати значення «істинно» або «хибно»),
    // Si — i-та охороняєма команда.

    // Цикл складається з однієї або декількох гілок (виразів, що охороняються),
    // кожна з яких являє собою пару з охороняючої умови і команди, що охороняється.

    public static void main(String[] args) {
        char character;
        Scanner in = new Scanner(System.in);

        for (; ; ) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l': // 'l' - охоронна умова 1.
                    System.out.println("Go left");    // команда, що охороняється.
                    continue;

                case 'r': // 'r' - охоронна умова 2.
                    System.out.println("Go right");   // команда, що охороняється.
                    continue;
            }
            break;  // Переривання циклу.
        }
    }
}
