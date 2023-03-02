package zoo.oop.demo.creatures.animal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@Slf4j
public abstract class Animal {
    private final List<Eatable> eatableList = new ArrayList<>();

    public <E extends Eatable> void eat(E meal) {
        if (this.getClass().isInstance(meal)) {
            throw new CannotEatException(String.format("%s cannot eat %s", this.getClass().getName(), meal.getClass().getName()));
        }
        eatableList.add(meal);
    }

}
