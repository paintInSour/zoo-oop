package zoo.oop.demo.creatures.animal;

import lombok.Getter;
import lombok.ToString;
import zoo.oop.demo.creatures.NaturalCreature;
import zoo.oop.demo.creatures.type.Eatable;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public abstract class Animal implements NaturalCreature, Eatable {
    private final String name;

    protected List<Eatable> eatableList = new ArrayList<>();

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(Eatable eatable);

    public abstract boolean canEat(Eatable eatable);
}
