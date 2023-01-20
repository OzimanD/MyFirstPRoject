package Demo.AQATest;


public class Test4 {
    public static void main(String[] args) {
        Test3 test3 = new Test3(8,9,10);
        test3.setAge(18);
        System.out.println(test3.getAge()+" "+test3.getPrice());
        test3.setAge(34);
        System.out.println(test3.getAge());

    }
}
