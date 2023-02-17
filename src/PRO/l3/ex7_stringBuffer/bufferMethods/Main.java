package PRO.l3.ex7_stringBuffer.bufferMethods;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("äîâæèíà -> " + sb.length());
        System.out.println("ğîçì³ğ -> " + sb.capacity());
//        sb = "Java"; // ïîìèëêà, ò³ëüêè äëÿ êëàñó String ìîæíà ÷åğåç ë³òåğàë ñòâîğşâàòè
        sb.append("Javaaafdsagafgsdfhgsdhdshsfhgsd");
        System.out.println("ğÿäîê -> " + sb);
        System.out.println("äîâæèíà -> " + sb.length());
        System.out.println("ğîçì³ğ -> " + sb.capacity());
        System.out.println("ğåâåğñ -> " + sb.reverse());
    }
}

