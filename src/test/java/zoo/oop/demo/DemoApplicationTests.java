package zoo.oop.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zoo.oop.demo.creatures.animal.Animal;
import zoo.oop.demo.creatures.animal.Goat;
import zoo.oop.demo.creatures.animal.Lion;
import zoo.oop.demo.creatures.plant.Grass;
import zoo.oop.demo.creatures.plant.Plant;
import zoo.oop.demo.exception.CannotEatException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void assertLionCanEatGoat() {
        Animal lion = new Lion("Lion");
        Animal goat = new Goat("Goat");

        lion.eat(goat);
        assertEquals(lion.getEatableList().size(), 1);
    }

    @Test
    void assertGoatCanEatGrass() {
        Animal goat = new Goat("Goat");
        Plant grass = new Grass("Grass");

        goat.eat(grass);
        assertEquals(goat.getEatableList().size(), 1);
    }

    @Test
    void assertGoatCannotEatGoat() {
        Animal goat1 = new Goat("Goat1");
        Animal goat2 = new Goat("Goat2");

        assertThrows(CannotEatException.class, () -> goat1.eat(goat2));
    }

    @Test
    void assertLionCannotEatGrass() {
        Animal lion = new Lion("Lion");
        Plant plant = new Grass("Grass");

        assertThrows(CannotEatException.class, () -> lion.eat(plant));
    }

    @Test
    void assertLionCannotEatLion() {
        Animal lion = new Lion("Lion");
        Animal lion2 = new Lion("Lion2");

        assertThrows(CannotEatException.class, () -> lion.eat(lion2));
    }


}
