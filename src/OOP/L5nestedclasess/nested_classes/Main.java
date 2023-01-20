package OOP.L5nestedclasess.nested_classes;

 class OuterClass {

    int x = 10;
     static void show(){
        System.out.println("1");
    }
//     int sum = y + x;

    class InnerClass {

        int y = 5;
        int sum = y + x;

        public static void main(String[] args) {
            show();
        }

    }

}

public class Main {

    public static void main(String[] args) {

        OuterClass myOuter = new OuterClass();
        myOuter.x = 10;

        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        myInner.y = 15;

        System.out.println(myInner.y + myOuter.x);

    }

}