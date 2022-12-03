package StarterLevel.L2Operathions;

public class C10_Concatenation {

    public static void main(String[] args) {
        String word1 = "Hello ";
        String word2 = "everybody!";
        String phrase = word1 + word2;
        System.out.println(phrase);

        System.out.println("Hello " + "World!");

        System.out.println(word1.concat(word2));
    }
}


