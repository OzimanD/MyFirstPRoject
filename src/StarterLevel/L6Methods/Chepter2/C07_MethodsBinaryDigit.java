package StarterLevel.L6Methods.Chepter2;

public class C07_MethodsBinaryDigit {
    // Висновок у двійковому форматі числа, переданого у десятковому форматі

    static void converter(int n) {
        int temp;

        temp = n % 2;

        if (n >= 2)
            converter(n / 2);

        System.out.print(temp);
    }

    public static void main(String[] args) {
        int n = 27;

        converter(n);
    }
}
