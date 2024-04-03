package org.example.module2.lesson18;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.example.module2.lesson18.TestAssertions.assertEquals;
import static org.example.module2.lesson18.TestAssertions.assertException;

public class Example3 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        new TestRunner().run(CalculatorTest.class);
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface BeforeEach {

}

// task1 handle annotation afterEach in the same way as beforeEach, but after each test
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AfterEach {

}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }


    public int div(int divided, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor is zero");
        }

        return divided / divisor;
    }
}

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    public CalculatorTest() {
    }

    @BeforeEach
    public void init1() {
        System.out.println("init1 context");
    }

    @BeforeEach
    public void init2() {
        System.out.println("init2 context");
    }

    @AfterEach
    public void cleanUp1() {
        System.out.println("cleanUp1....");
    }

    @AfterEach
    public void cleanUp2() {
        System.out.println("cleanUp2....");
    }

    // test method should be public, void and without parameters, start with test word

    @Test
    public void testAdd() {
        int actual = calculator.add(1, 2);
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    public void divValidValues() {
        int actual = calculator.div(10, 3);
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    public void divNotValidValues() {
        IllegalArgumentException expectedException =
                assertException(() -> calculator.div(10, 0), IllegalArgumentException.class);

        assertEquals(expectedException.getMessage(), "divisor is zero");
    }

    // task 2 should failed in the right way
    @Test
    public void divNotValidValues2() {
        IllegalArgumentException expectedException =
                assertException(() -> calculator.div(10, 1), IllegalArgumentException.class);

        assertEquals(expectedException.getMessage(), "divisor is zero");
    }
}

class TestAssertions {

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            throw new AssertionRuntimeException(actual, expected);
        }
    }

    public static void assertEquals(Object actual, Object expected) {
        if (!Objects.equals(actual, expected)) {
            throw new AssertionRuntimeException(actual, expected);
        }
    }

    public static <T extends Exception> void assertEquals(Exception actual, Class<T> expected) {
        if (!Objects.equals(actual.getClass(), expected)) { // ???
            throw new AssertionRuntimeException(actual, expected);
        }
    }


    public static <T extends Exception> T assertException(Executor executor, Class<T> exceptionClass) {
        try {
            executor.execute();
            return null;
        } catch (Exception e) {
            assertEquals(e, exceptionClass);
            return (T)e;
        }
    }
}

interface Executor {
    void execute();
}

class AssertionRuntimeException extends RuntimeException {
    private final Object actual;
    private final Object expected;

    public AssertionRuntimeException(Object actual, Object expected) {
        super("Assertion failed, actual: " + actual + ", expected: " + expected);
        this.actual = actual;
        this.expected = expected;
    }

    public Object getActual() {
        return actual;
    }

    public Object getExpected() {
        return expected;
    }
}

class TestRunner {
    void run(Class<?> testClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?> constructor = testClass.getConstructor();
        Object testClassInstance = constructor.newInstance();
        Method[] publicMethods = testClass.getMethods();

        List<Method> testMethods = findByAnnotation(publicMethods, Test.class);
        List<Method> beforeEachMethods = findByAnnotation(publicMethods, BeforeEach.class);

//        for (Method testMethod : publicMethods) {
////            if (testMethod.getName().startsWith("test")) {  // junit 3
//            if (testMethod.isAnnotationPresent(Test.class)) {  // junit 4
//                try {
//                    testMethod.invoke(testClassInstance);
//                    System.out.println("Test green: " + testMethod.getName());
//                } catch (InvocationTargetException e) {
//                    if (e.getCause() instanceof AssertionRuntimeException) {
//                        System.err.println(e.getCause().getMessage());
//                    } else {
//                        throw e;
//                    }
//                }
//            }
//        }

        testMethods.forEach(
                test -> {
                    executeMethods(testClassInstance, beforeEachMethods);
                    executeMethod(testClassInstance, test);
                    System.out.println("Test green: " + test.getName());
                }
        );
    }

    List<Method> findByAnnotation(Method[] methods, Class<? extends Annotation> annotationClass) {
        List<Method> foundMethods = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(annotationClass)) {
                foundMethods.add(method);
            }
        }

        return foundMethods;
    }

    void executeMethods(Object testClassInstance, List<Method> methods) {
        methods.forEach(method -> executeMethod(testClassInstance, method));
    }

    void executeMethod(Object testClassInstance, Method method) {
        try {
            method.invoke(testClassInstance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof AssertionRuntimeException) {
                System.err.println(e.getCause().getMessage());
            } else {
                throw new RuntimeException(e);
            }
        }
    }
}
