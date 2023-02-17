package PRO.l3.ex3.buffered;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                            "C:\\other\\CucumberFramework\\MyFirstPRoject\\src\\PRO\\l3\\ex2\\fileInfo\\Main.java"), "Cp866"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Main.txt"), "Cp866"));
            int c = 0;
            while ((c = br.read()) != -1) {
                bw.write((char) c);
            }
            br.close();
            bw.flush();
            bw.close();
            System.out.println("The job's finished.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
