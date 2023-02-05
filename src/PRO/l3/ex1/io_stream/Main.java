package PRO.l3.ex1.io_stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
            // true – означає, що після виклику pw.println(…) можна викликати pw.flush().
            String s = "Привіт світ";
            System.out.println("System.out puts: " + s);
            pw.println("PrintWriter puts: " + s);
            int c = 0;
            pw.println("Посимвольне введення:");
            while ((c = br.read()) != -1)
                pw.println((char) c);
            pw.println("Порядкове введення:");
            do {
                s = br.readLine();
                pw.println(s);
            } while (!s.equals("q"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

