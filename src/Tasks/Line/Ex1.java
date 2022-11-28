package Tasks.Line;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ex1
//        System.out.println("Input some number");
//        double a = sc.nextDouble();
//        double P = 4 * a;
//        System.out.println("P = " + P);
        //Ex2
//        System.out.println("Input some number");
//        double a = sc.nextDouble();
////        double s = Math.pow(a,2);
//        double s = a*a;
//        System.out.println("S = " + s);
        //Ex3
//        System.out.println("Input a");
//        double a = sc.nextDouble();
//        System.out.println("Input b");
//        double b = sc.nextDouble();
//        double s = a*b;
//        double p = 2*(a+b);
//        System.out.println("S = "+s +" P = " + p);
        //Ex4
//        System.out.println("Please input d");
//        double d = sc.nextDouble();
//        double l = Math.PI*d;
//        System.out.println("L = " + l);
        //Ex5
//        System.out.println("please input a");
//        double a = sc.nextDouble();
//        double v = Math.pow(a,3);
//        double s = 6 * (Math.pow(a,2));
//        System.out.println("V = " + v+" S = "+s);
        //Ex6
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
////S = 2·(a·b + b·c + a·c).
//        double v = a*b*c;
//        double s = 2*((a*b)+(b*c)+(a*c));
//        System.out.println("V = " + v + " S = " + s);
        //Ex7
        //L = 2·π·R, S = π·R^2
//        double r = sc.nextDouble();
//        double l = 2* Math.PI*r;
//        double s = Math.PI*(Math.pow(r,2));
//        System.out.println("L = " + l + " S = " + s);
        //Ex8
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double srArifm = (a+b)/2;
//        System.out.println("AVG = " + srArifm);
        //ex9
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double mn = a*b;
//        double srGeom = Math.sqrt(mn);
//        System.out.println("AVG = " + srGeom);
        //ex10
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double kvSum = (Math.pow(a,2)+(2*a*b)+(Math.pow(b,2)));
//        System.out.println("kv = " + kvSum);
        //ex11
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double kvSum = (Math.pow(a,2)+(2*a*b)+(Math.pow(b,2)));
//        System.out.println("kv = " + Math.abs(kvSum));
        //ex12
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double tmp = Math.pow(a,2)+Math.pow(b,2);
//        double c = Math.sqrt(tmp);
//        double p = a+b+c;
//        System.out.println("C = " + c + " P = "+ p);
        //ex13
//        double r1 = sc.nextDouble();
//        double r2 = sc.nextDouble();
//        double s1 = Math.PI*Math.pow(r1,2);
//        double s2 = Math.PI*Math.pow(r2,2);
//        double s3 = s1 - s2;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        //ex14
//        double r = sc.nextDouble();
//        double l = 2*Math.PI*r;
//        double s = Math.PI * Math.pow(r,2);
//        System.out.println(l);
//        System.out.println(r);
        //int
        //ex1
//        int l = sc.nextInt();
//        int vidstan = l / 100;
//        System.out.println(vidstan+"M");
        //ex2
//        int m = sc.nextInt();
//        int m1 = m / 1000;
//        System.out.println(m1+"T");
        //ex3
//        int b = sc.nextInt();
//        int mb = b / 1024;
//        System.out.println(mb+"MB");
        //ex4
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = a / b;
//        System.out.println(c);
        //ex5
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = a % b;
//        System.out.println(c);
        //ex6
//        int n = sc.nextInt();
//        int a = n / 10;
//        int b = n % 10;
//        System.out.println(a+"cile");
//        System.out.println(b+"ostacha");
        //ex7
//        int n = sc.nextInt();
//        int a = n / 10;
//        int b = n % 10;
//        int sum = a+b;
//        int mng = a*b;
//        System.out.println(sum);
//        System.out.println(mng);
        //ex8
//        int n = sc.nextInt();
//        int a = n / 10;
//        int b = n % 10;
//        int revers = (b*10)+a;
//        System.out.println(revers);
        //ex9
//        int n = sc.nextInt();
//        int sot = n / 100;
//        System.out.println(sot);
        //ex10
//        int n = sc.nextInt();
//        int od = n % 10;
//        int des = n / 10 % 10;
//        System.out.println(od);
//        System.out.println(des);
        //11-12
        int n = sc.nextInt();
        int od = n % 10;
        int des = n / 10 % 10;
        int sot = n / 100;
        int sum = od + des +sot;
        int mn = od * des * sot;
        System.out.println(sum);
        System.out.println(mn);
        int revers = (od*100)+(des*10)+sot;
        System.out.println(revers);


    }
}
