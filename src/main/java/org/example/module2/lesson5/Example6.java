package org.example.module2.lesson5;

public class Example6<EE, S> {

    private EE e;
    public <T> T method(T t) {
        return null;
    }

    public S methodS(){
        return null;
    }


    public static <E>  E staticMethod(Class<E> aClass){
        return null;
    }

    public static void main(String[] args) {
        Class<Integer> aClass = Integer.class;
        Integer i = staticMethod(aClass);

        Example6<Object, Object> objectObjectExample6 = new Example6<>();
//        String method = objectObjectExample6.method((Object) null);
    }
}

class MyException<T> /*extends Exception*/{

}
