package org.example.module3.lesson17;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println(invoker.execute(1, "&", 2));
    }
}

class Invoker {
    private static final Map<String, Operation> OPERATION_MAP = new HashMap<>();
    private static final Operation EXCEPTION_OPERATION = (a, b) -> {
        throw new IllegalArgumentException();
    };

    static {
        OPERATION_MAP.put("+", new AddOperation());
        OPERATION_MAP.put("-", (a, b) -> a - b);
        OPERATION_MAP.put("*", (a, b) -> a * b);
        OPERATION_MAP.put("/", (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("message");
            }

            return a / b;
        });
    }

    public int execute(int a, String operationName, int b) {
        Operation operation = OPERATION_MAP.getOrDefault(operationName, EXCEPTION_OPERATION);

        return operation.execute(a, b);
    }
}

interface Operation {
    int execute(int a, int b);
}

class AddOperation implements Operation {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}


