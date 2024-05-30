package org.example.module3.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
}

class Button implements Listenable {

    private List<Listener> listeners = new ArrayList<>();

    public void click() {
        listeners.forEach(Listener::invoke);

        //some logic
    }

    @Override
    public void register(Listener listener) {
        listeners.add(listener);
    }
}

interface Listener {
     void invoke();
}

interface Listenable {
    void register(Listener listener);
}


