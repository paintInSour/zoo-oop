package zoo.oop.demo.creatures.animal;

import lombok.ToString;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

@ToString
public class Lion extends Animal {

    @Override
    public <E extends Eatable> void eat(E meal) {
        verifyMeal(meal);
        super.eat(meal);
    }

    private void verifyMeal(Object meal) {
        try {
            Animal.class.cast(meal);
        } catch (ClassCastException e) {
            throw new CannotEatException(String.format("%s cannot eat %s", this.getClass(), meal.getClass()));
        }

    }
}
