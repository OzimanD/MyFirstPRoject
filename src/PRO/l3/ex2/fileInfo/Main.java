package PRO.l3.ex2.fileInfo;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
            File f = new File("D:\\Course\\Java Professional Course\\Java Professional Student\\" +
                    "003_IO_and_Strings\\003_Samples\\src\\com\\itvdn\\javaProfessional\\ex_002_file\\fileInfo");
            pw.println();
            pw.println("Файл \"" + f.getName() + "\" " + (f.exists() ? "" : "не ") + "існує");
            pw.println("Ви " + (f.canRead() ? "" : "не ") + "можете читати файл");
            pw.println("Ви " + (f.canWrite() ? "" : "нe ") + "можете записувати у файл");
            pw.println("Довжина файлу " + f.length() + " б");
            pw.println();
            File d = new File("C:/Windows");
            pw.println("Вміст каталогу:");
            if (d.exists() && d.isDirectory()) {
                String[] s = d.list();
                for (int i = 0; i < s.length; i++)
                    pw.println(s[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

