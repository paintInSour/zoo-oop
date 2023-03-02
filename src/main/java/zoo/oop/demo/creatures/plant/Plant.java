package zoo.oop.demo.creatures.plant;

import zoo.oop.demo.creatures.NaturalCreature;
import zoo.oop.demo.creatures.type.Eatable;

public abstract class Plant implements NaturalCreature, Eatable {
    private final String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
