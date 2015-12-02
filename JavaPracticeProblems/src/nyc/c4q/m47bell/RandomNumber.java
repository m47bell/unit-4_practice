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



    public static void main(String [] args){
    


    }

}
