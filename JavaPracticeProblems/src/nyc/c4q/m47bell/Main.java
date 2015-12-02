package nyc.c4q.m47bell;

public class Main {

    //in place
    public static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        int index = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            b[index++] = a[i];
        }

        return b;
    }

    public static void reverseArray2(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {

            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        // write your code here
        int[] a = {3, 7, 4, 5};
//        int [] result = reverseArray(a);
//        for(int i :result){
//            System.out.print(i + "");
//            System.out.println();
//        }
        reverseArray2(a);

        for (int i : a) {
            System.out.print(i + "");
            System.out.println();
        }
    }
}
