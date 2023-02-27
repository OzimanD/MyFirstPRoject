package PRO.l4.ex_004_gregorianCalendar.methods;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        // Місяць на 1 менше
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
//
        System.out.println((char) 27 + "[31m" + "===========================");
        gc.set(Calendar.MONTH, Calendar.AUGUST);
//        // День на 1 більше( 7 = 1 )
        gc.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
//
        System.out.println((char) 27 + "[32m" + "===========================");
        GregorianCalendar gc1 = new GregorianCalendar(2017, Calendar.JANUARY, 12);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));
//
        System.out.println((char) 27 + "[33m" + "===========================");
        GregorianCalendar gc2 = new GregorianCalendar(2016, Calendar.DECEMBER, 28);
        gc2.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(gc2.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc2.get(Calendar.MONTH));
        System.out.println(gc2.get(Calendar.YEAR));
//
        System.out.println((char) 27 + "[34m" + "===========================");
        // Перетворимо GregorianCalendar на Date
        Date d1 = gc2.getTime();
        System.out.println(d1);
//
//        // Перетворимо Date на GregorianCalendar
        gc.setTime(d1);
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.YEAR));
    }
}
