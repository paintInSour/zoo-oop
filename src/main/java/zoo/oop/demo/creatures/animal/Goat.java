package zoo.oop.demo.creatures.animal;

import zoo.oop.demo.creatures.plant.Plant;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

public class Goat extends Animal implements Eatable {

    @Override
    public <E extends Eatable> void eat(E meal) {
        try {
            Plant plant = (Plant) meal;
            super.eat(plant);
        } catch (ClassCastException e) {
            throw new CannotEatException(String.format("%s cannot eat %s", this.getClass(), meal.getClass()));
        }
    }

}
