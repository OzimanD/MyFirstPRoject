package PRO.l3.ex3.buffered;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                            "D:\\Course\\Java Professional Course\\Java Professional Student\\003_IO_and_Strings\\" +
                                    "003_Samples\\src\\com\\itvdn\\javaProfessional\\ex_003_io_buffered\\buffered\\Main.java"), "Cp866"));
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
