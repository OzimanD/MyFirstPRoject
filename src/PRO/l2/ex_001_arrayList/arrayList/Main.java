package PRO.l2.ex_001_arrayList.arrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // ��������� ��'��� arrayList
        ArrayList<String> list = new ArrayList<>();

        // ��������� ��'��� BufferedReader ��� ���������� �������� � ���������
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // ������ ���������� ����� arrayList ����������
        for (int i = 0; i < 3; i++) {
            System.out.println("������ �������� [" + i + "]");
            String s = reader.readLine();
            // ������ �������� � ����� ������
            list.add(s);
        }

        // ��������� ������� ����� � ������ ���� �� �������
        for (int i = 0; i < 5; i++) {
            String s1 = list.remove(list.size() - 1);
            list.add(0, s1);
        }

        // �������� �� ����� ���� ����
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
