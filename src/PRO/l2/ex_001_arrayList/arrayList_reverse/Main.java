package PRO.l2.ex_001_arrayList.arrayList_reverse;

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

        // ������ ��������� �� ��� ������ arrayList
        for (int i = 0; i < 3; i++) {
            // �������� �������� ���������� �������� � ����� j
            int j = list.size() - i - 1;
            // �������� �� ����� ���� j
            System.out.println(list.get(j));
        }
    }
}
