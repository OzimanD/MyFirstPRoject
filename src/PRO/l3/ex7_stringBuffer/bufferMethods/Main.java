package PRO.l3.ex7_stringBuffer.bufferMethods;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("довжина -> " + sb.length());
        System.out.println("розмір -> " + sb.capacity());
//        sb = "Java"; // помилка, тільки для класу String можна через літерал створювати
        sb.append("Java");
        System.out.println("рядок -> " + sb);
        System.out.println("довжина -> " + sb.length());
        System.out.println("розмір -> " + sb.capacity());
        System.out.println("реверс -> " + sb.reverse());
    }
}

