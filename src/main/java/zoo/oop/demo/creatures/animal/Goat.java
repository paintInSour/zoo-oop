package zoo.oop.demo.creatures.animal;

import zoo.oop.demo.creatures.animal.type.Herbivorous;
import zoo.oop.demo.creatures.plant.Plant;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

public class Goat extends Animal implements Herbivorous {
    public Goat(String name) {
        super(name);
    }

    @Override
    public void eat(Eatable eatable) {
        if (!canEat(eatable)) {
            throw new CannotEatException(String.format("%s cannot eat %s%n", this.getClass(), eatable.getClass()));
        }
        this.eatableList.add(eatable);
    }

    @Override
    public boolean canEat(Eatable eatable) {
        return eatable instanceof Plant;
    }
}
