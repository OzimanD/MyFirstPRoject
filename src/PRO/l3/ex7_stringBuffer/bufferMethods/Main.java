package PRO.l3.ex7_stringBuffer.bufferMethods;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("������� -> " + sb.length());
        System.out.println("����� -> " + sb.capacity());
//        sb = "Java"; // �������, ����� ��� ����� String ����� ����� ������ ����������
        sb.append("Javaaafdsagafgsdfhgsdhdshsfhgsd");
        System.out.println("����� -> " + sb);
        System.out.println("������� -> " + sb.length());
        System.out.println("����� -> " + sb.capacity());
        System.out.println("������ -> " + sb.reverse());
    }
}

