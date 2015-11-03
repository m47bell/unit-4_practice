package nyc.c4q.m47bell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Created by c4q-marbella on 10/11/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class ListSet<E> extends ArrayList<E> implements Set<E> {

    //runtime: linear search, lists are not sorted
    //add is worst case time, its constant time
    //KEy interview: best case: contains is linear, add is linear, true is constant
    //worst case: contains, add is linear and true is constant
    @Override
    public boolean add(E o) {
        if(!this.contains(o)){
            this.add(o);
            return true;
        }
        return false;
    }


 //for loop is linear, remove method is linear search
 // (have to look for the first instance so you have to assume the last place (WCS)
 // is linear (List.remove is linear search!!!)//if you remove an object is linear search
 // to make remove an index  constant time so that list  doesn't trunicate, so you have to swap it with last element then remove it.
  //  wCS: N^2
    public boolean removeAll(ArrayList<E> c) {
      for(E e: c){
          this.remove(e);
      }
        return true;
    }

    //for loop is linear,if is constant, contains linear, add is constant (assumption),
//N^2 + N + N + 1 ---> domandant term--> N^2
    public boolean retainAll(ArrayList<E> c) {

        ListSet<E> temp = new ListSet<E>();
        // N^2 -- for loop block
        for(E e :c){
            if(this.contains(e)){
                temp.add(e);
            }
        }
        //clear is linear, addAll is linear, true is constant
        this.clear();
        this.addAll(temp);
        return true;

    }


}
