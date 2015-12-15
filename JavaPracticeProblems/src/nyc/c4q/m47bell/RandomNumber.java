package nyc.c4q.m47bell;

import java.util.Arrays;

/**
 * Created by c4q-marbella on 12/1/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class RandomNumber {


    public static int findNumber(int [] randNum){

        int result= 0;
        //sort the array
        Arrays.sort(randNum);
        int minValue = randNum[0];

        // find the min and add one and check ith value to value at position i
            for( int i = 0; i < randNum.length; i++ ) {
                if (minValue == randNum[i])
                    minValue++;
                else
                    result = randNum[i];
            }
            return result;
    }


    public static int max(int [] num){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< num.length;i++) {
            if (num[i] > max) max = num[i];
        }
        return max;
    }


    public static void main(String [] args){

        int[] randNum= {3,9,8,2,1,6,4};
        int [] num = {2,5,3,1};

//        System.out.println(findNumber(randNum));

        System.out.println(max(num));

    }

}
