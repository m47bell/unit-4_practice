package nyc.c4q.m47bell;

import java.util.ArrayList;

/**
 * Created by c4q-marbella on 10/11/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class ListStack<E> extends ArrayList<E> {

    //add to stack
    public void push(E e) {
        this.add(e);
    }

    //remove last element
    public E pop() {
      if(!this.isEmpty()){
          return this.remove(this.size() - 1);
      } throw new StackOverflowError();

    }

    //getting the last item
    public E top(){
        if(!this.isEmpty()){
            return this.get(this.size()-1);
        } throw new StackOverflowError();
    }
}
