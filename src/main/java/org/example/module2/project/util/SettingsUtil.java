package org.example.module2.project.util;

import org.example.module2.project.domain.animal.Duck;
import org.example.module2.project.domain.animal.UnitSettings;

public final class SettingsUtil {

    public static int getWeight(Class<?> aClass){

        return 0;
    }

    public static int getFoodWeight(Class<?> aClass){
        return 0;
    }

    public static UnitSettings getUnitSettings(Class<Duck> duckClass) {
        return null;
    }

    public static void main(String[] args) {
        UnitSettings unitSettings = SettingsUtil.getUnitSettings(Duck.class);

        System.out.println(unitSettings.getWeight());
    }
}
