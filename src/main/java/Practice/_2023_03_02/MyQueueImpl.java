package Practice._2023_03_02;

import java.util.ArrayList;

public class MyQueueImpl<T> implements MyQueue<T>{
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(Object el) {
        //at the end of this list
        el = list.add((T) el); //add at the end of this list
    }

    @Override
    public T remove() {
        //first and return
        return list.remove(0);  //remove first
    }

    @Override
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public T get() {
        //only first
        return list.get(0);
    }
}
