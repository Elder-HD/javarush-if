package org.example.module2.project.domain.animal;

import org.example.module2.project.domain.island.Area;

public abstract class Animal {
    protected int healthPoint; // 0, 100


    public abstract void eat(Area area);

    //
    public Direction chooseDirection() {
       // we can implement it here

        return null;
    }

    public abstract Animal reproduce();
}
