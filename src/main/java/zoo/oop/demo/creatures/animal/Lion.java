package zoo.oop.demo.creatures.animal;

import lombok.ToString;
import zoo.oop.demo.creatures.animal.type.Carnivorous;
import zoo.oop.demo.creatures.animal.type.Herbivorous;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

@ToString
public class Lion extends Animal implements Carnivorous {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat(Eatable eatable) {
        if (!canEat(eatable)) {
            throw new CannotEatException(String.format("%s cannot eat %s%n", this.getName(), eatable.getClass()));
        }
        eatableList.add(eatable);
    }

    @Override
    public boolean canEat(Eatable eatable) {
        return eatable instanceof Herbivorous;
    }
}
