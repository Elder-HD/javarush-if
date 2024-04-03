package org.example.module2.project.domain.animal;

import org.example.module2.project.domain.island.Area;
import org.example.module2.project.util.SettingsUtil;

@Settings(filename = "duck.properties", isHunter = true)
public class Duck extends Herbivorous {
    private static final int WEIGHT = SettingsUtil.getWeight(Duck.class);
    private static final int FOOD_WEIGHT = SettingsUtil.getWeight(Duck.class);
    //weight, maxAnimalNumberPerArea, maxStep, foodWeight

    private static final UnitSettings UNIT_SETTINGS = SettingsUtil.getUnitSettings(Duck.class);

    @Override
    public void eat(Area area) {

    }

    @Override
    public Duck reproduce() {
        boolean condition = true;
        return condition ? new Duck():null;
    }
}
