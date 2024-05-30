package org.example.module3.lesson17;

public class Example6 {
}

class SortStrategyDecider<T> implements SortStrategy<T>{

    private final SortStrategy<T> sortStrategy1;
    private final SortStrategy<T> sortStrategy2;

    SortStrategyDecider(SortStrategy<T> sortStrategy1, SortStrategy<T> sortStrategy2) {
        this.sortStrategy1 = sortStrategy1;
        this.sortStrategy2 = sortStrategy2;
    }

    @Override
    public T[] sort(T[] items) {
        if(items.length <100){
           return sortStrategy1.sort(items);
        } else {
          return  sortStrategy2.sort(items);
        }
    }
}

interface SortStrategy<T>{
    T[] sort(T[] items);
}

class BobbleSortStrategy<T> implements SortStrategy<T>{

    @Override
    public T[] sort(T[] items) {
        return null;
    }
}

class MultiThreadingSort<T> implements SortStrategy<T>{

    @Override
    public T[] sort(T[] items) {
        return null;
    }
}
