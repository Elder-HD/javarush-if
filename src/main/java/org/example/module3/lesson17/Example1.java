package org.example.module3.lesson17;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Example1 {
    public static void main(String[] args) {
        Container container = new Container(1, -2, 4);

        for (Integer item : container) {
            System.out.println(item);
        }

        System.out.println("===============================");
        Iterator<Integer> iterator = container.iterator();

        while (iterator.hasNext()){
            Integer item = iterator.next();
            System.out.println(item);
        }
    }
}


class Container implements Iterable<Integer> {
    private final int value1;
    private final int value2;
    private final int value3;

    public Container(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ContainerIterator();
    }

    private class ContainerIterator implements Iterator<Integer> {
        private int iterationCounter = 0;

        @Override
        public boolean hasNext() {
            return iterationCounter < 3;
        }

        @Override
        public Integer next() {
            ++iterationCounter;
            if (iterationCounter == 1) {
                return value1;
            } else if (iterationCounter == 2) {
                return value2;
            } else if (iterationCounter == 3) {
                return value3;
            } else {
                throw new NoSuchElementException();
            }

        }
    }
}
