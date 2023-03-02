package zoo.oop.demo.creatures.animal;

import lombok.ToString;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

@ToString
public class Lion extends Animal {

    @Override
    public <E extends Eatable> void eat(E meal) {
        try {
            Animal animal = (Animal) meal;
            super.eat(animal);
        } catch (ClassCastException e) {
            throw new CannotEatException(String.format("%s cannot eat %s", this.getClass(), meal.getClass()));
        }
    }
}
