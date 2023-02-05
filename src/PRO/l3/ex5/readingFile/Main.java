package PRO.l3.ex5.readingFile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Створили об'єкт файлу за посиланням
        File f1 = new File("D:\\Course\\Java Professional Course\\Java Professional Student\\003_IO_and_Strings\\" +
                "003_Samples\\src\\com\\itvdn\\javaProfessional\\ex_005_readingFile\\readingFile\\example");

        // Зчитуємо текстовий файл у пакеті
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
        FileWriter fw = new FileWriter(f1, true);  // Залишити коментар
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Good");
        pw.println("Luck");
        pw.flush();
        pw.close();
    }
}
