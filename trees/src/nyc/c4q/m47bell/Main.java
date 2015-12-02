package nyc.c4q.m47bell;

public class Main {
    private static void printRecursively(int i){

        System.out.println(i);

        if(i == 10) return;

        printRecursively(i +1);
    }

    // works from the top down
    private static void printTailRecursively(int i){

        System.out.println(i);

        if(i == 10) return;

        printRecursively(i +1);
    }

    // works from the bottom up
    private static void printHeadRecursively(int i){
        if(i == 0) return;

        printHeadRecursively(i - 1);

        System.out.println(i);

    }

    public static void main(String[] args) {
	// write your code here
//        printRecursively(1);
//        printTailRecursively(1);
//        printHeadRecursively(1);
    }
}
