package zoo.oop.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zoo.oop.demo.creatures.animal.Animal;
import zoo.oop.demo.creatures.animal.Cow;
import zoo.oop.demo.creatures.animal.Goat;
import zoo.oop.demo.creatures.animal.Lion;
import zoo.oop.demo.creatures.plant.Grass;
import zoo.oop.demo.creatures.type.Eatable;
import zoo.oop.demo.exception.CannotEatException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void assertGoatCannotEatGoat() {
        Animal goat1 = new Goat();
        Eatable goat2 = new Goat();
        assertThrows(CannotEatException.class, () -> goat1.eat(goat2));
    }

    @Test
    void assertLionCanEatGoat() {
        Lion lion = new Lion();
        Goat goat = new Goat();

        lion.eat(goat);
        assertEquals(lion.getEatableList().size(), 1);
    }

    @Test
    void assertCowCannotEatGoat() {
        Cow cow = new Cow();
        Goat goat = new Goat();

        assertThrows(CannotEatException.class, () -> cow.eat(goat));
    }

    @Test
    void assertLionCannotEatGrass() {
        Lion lion = new Lion();
        Grass grass = new Grass();

        assertThrows(CannotEatException.class, () -> lion.eat(grass));
    }


}