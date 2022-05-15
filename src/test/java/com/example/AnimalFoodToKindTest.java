package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalFoodToKindTest {

    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalFoodToKindTest(String animalKind, List<String> food) {
        this.animalKind = animalKind;
        this.expectedFood = food;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodList() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void shouldBeFoodAccordToAnimalKind() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expectedFood, actual);
    }
}
//add some text to do right instructions about committing my project. this text is insignificant for project containing.