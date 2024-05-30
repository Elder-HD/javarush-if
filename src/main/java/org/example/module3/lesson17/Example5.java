package org.example.module3.lesson17;

public class Example5 {

    public static void main(String[] args) {
        new Cold().nextState(true)
                .nextState(false);
    }
}

interface State {
    State nextState(boolean isSwitchedOn);
}

class Cold implements State {

    @Override
    public State nextState(boolean isSwitchedOn) {
        return isSwitchedOn ? new Hot() : this;
    }
}

class Hot implements State {

    @Override
    public State nextState(boolean isSwitchedOn) {
        if(isSwitchedOn){
            System.out.println("prepare food");
        }
        return isSwitchedOn? new OverHot(): new Cold();
    }
}

class OverHot implements State {
    @Override
    public State nextState(boolean isSwitchedOn) {
        return isSwitchedOn? this: new Hot();
    }
}
