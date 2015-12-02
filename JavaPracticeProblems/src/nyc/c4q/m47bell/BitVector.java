package nyc.c4q.m47bell;

import java.util.List;

/**
 * Created by c4q-marbella on 11/24/15.
 */
public class BitVector {
    boolean[] b;
    List<Boolean> list;
    int index = 0;
    int size = b.length;


    public BitVector(int size, int index) {
        this.size = size;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    // need a AND operator  to get the specified bit

    //get---need an method that returns the boolean value


}
