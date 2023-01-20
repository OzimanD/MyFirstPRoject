package Tasks.Line;

public class Ex4 {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,7,9,4,5};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

//        int [] arr = {1,2,3,7,9,4,5};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2==1){
//                sum += arr[i];
//            }
//        }
//        System.out.println(sum);

//        int [] arr = {-7,7,9,33,77,-58,43,-108};
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println(min);
//        int [] arr = {-7,7,9,33,77,-58,43,-108,1000};
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > max)
//                max = arr[i];
//        }
//        System.out.println(max);
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] sum = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum[i][j] = arr[i][j] * arr1[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
