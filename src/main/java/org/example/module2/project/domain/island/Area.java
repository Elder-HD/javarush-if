package org.example.module2.project.domain.island;

import org.example.module2.project.domain.animal.Animal;
import org.example.module2.project.domain.animal.Plant;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private List<Plant> plants = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();
    //....


    public List<Plant> getPlants() {
        return plants;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
