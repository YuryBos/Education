package Algorithms._2023_07_31;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    public int count;
    public ArrayList<T> items;

    public Stack(){
        this.count = 0;
        this.items = new ArrayList<>();
    }

    public void push(T element){
        this.items.add(element);
        this.count++;
    }

    public T pop(){
        if (this.count==0){
            throw new EmptyStackException();
        }
        T deleteItem = this.items.remove(this.count-1);
        this.count--;
        return deleteItem;
    }
}
