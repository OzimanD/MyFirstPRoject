package PRO.l2.ex_004_set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        //
        //��������� �������� ���-���
        Set<String> set = new HashSet<>();
        set.add("�����");
        set.add("�����");
        set.add("����");
        set.add("������");
        set.add("����");
        set.add("��������");
        for (String text : set) {
            System.out.println(text + " " + text.hashCode());
        }
    }
}
