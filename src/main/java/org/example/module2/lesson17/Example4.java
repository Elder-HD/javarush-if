package org.example.module2.lesson17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//https://www.baeldung.com/java-dynamic-proxies
public class Example4 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        StaticMyClassProxy staticMyClassProxy =
                new StaticMyClassProxy(myClass);

        staticMyClassProxy.method();
        System.out.println("===================");

        MyInterface proxy = createDynamicProxy(myClass, MyInterface.class );

        proxy.method();
    }

    // we need to have interface for current class T
    private static <T, I> I createDynamicProxy(T instance, Class<I> aInterface) {
        InvocationHandler dynamicINvocationHandler =
                new DynamicInvocationHandler(instance);

        I proxy =(I) Proxy.newProxyInstance(
                instance.getClass().getClassLoader(),
                new Class[]{aInterface},
                dynamicINvocationHandler
        );
        return proxy;
    }
}

interface MyInterface {
    void method();
}

class MyClass implements MyInterface {

    @Override
    public void method() {
        System.out.println("real class");
    }
}

class StaticMyClassProxy implements MyInterface {

    private final MyInterface delegator;

    StaticMyClassProxy(MyInterface delegator) {
        this.delegator = delegator;
    }

    @Override
    public void method() {
        long start = System.currentTimeMillis();
        delegator.method();
        long end = System.currentTimeMillis();

        System.out.println("time: " + (end - start) + "ms");
    }
}

class DynamicInvocationHandler implements InvocationHandler{

    private final Object instance;

    public DynamicInvocationHandler(Object instance) {
        this.instance = instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        method.setAccessible(true);
        long start = System.currentTimeMillis();
        Object result = method.invoke(instance, args);
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + "ms");

        return result;
    }
}