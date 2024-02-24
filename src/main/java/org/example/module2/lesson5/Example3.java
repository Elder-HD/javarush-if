package org.example.module2.lesson5;

public class Example3 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4};
        Double[] doubles = {2D, 3.0, 1D};
        NumbersContainer<Integer> integerNumbersContainer = new NumbersContainer<>(integers);
        NumbersContainer<Double> doubleNumbersContainer = new NumbersContainer<>(doubles);
        NumbersContainer<Number> numberNumbersContainer = new NumbersContainer<>(null);
//        NumbersContainer<String> stringNumbersContainer = new NumbersContainer<>(null);


        System.out.println(integerNumbersContainer.compare(doubleNumbersContainer));
        System.out.println(integerNumbersContainer.compare(numberNumbersContainer));
    }
}

class NumbersContainer<T extends Number> {
    private final T[] items;

    public NumbersContainer(T[] items) {
        this.items = items;
    }

    public double average() {
        double sum = 0;
        for (T item : items) {
            sum += item.doubleValue();
        }

        return sum / items.length;
    }


    // this.items.length > that.items.length  >0
    // this.items.length = that.items.length  0
    // this.items.length < that.items.length  <0
    public int compare(NumbersContainer<? extends Number> that) {
        return this.items.length - that.items.length;
    }

}
