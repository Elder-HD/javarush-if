package org.example.module2.lesson18;

public class Example1 {
    public static void main(String[] args) {
        Object item = new MyClass1();
        if(item instanceof Marker){
            System.out.println("this class is marked with Marker");
        }

        if(item.getClass().isAnnotationPresent(MyAnnotation.class)){ // we use Reflection API here
            System.out.println("this class is marked with MyAnnotation");
        }
    }
}

interface Marker {

}

@MyAnnotation(value = "1", names = "A")
class MyClass1 implements Marker {

    @MyAnnotation(value = "2", names ={"B"}, c= 100)
    public String method(){
        return null;
    }
}
