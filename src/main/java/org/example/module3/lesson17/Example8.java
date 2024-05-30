package org.example.module3.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
}

class DocumentMementor {
    private String state;
}

class DocumentHolder {
    private List<DocumentMementor> operatioDo = new ArrayList<>();
    private List<DocumentMementor> operatioUnDo = new ArrayList<>();

    private DocumentMementor currentState;


    public void doOp() {
        if (!operatioUnDo.isEmpty()) {
            currentState = operatioUnDo.get(0);
            operatioDo.add(currentState);
        }
    }

    public void unDoOp() {
        if (!operatioDo.isEmpty()) {
            currentState = operatioDo.get(0);
            operatioUnDo.add(currentState);
        }
    }

    public DocumentMementor getCurrentState() {
        return currentState;
    }
}
