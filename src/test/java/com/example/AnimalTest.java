package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    @Test
    public void shouldGetExceptionWhenAnimalKindUnknown() {
        Animal animal = new Animal();
        Exception exceptionText = assertThrows(Exception.class, () -> animal.getFood("Насекомое"));
        String expectedExceptionText = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedExceptionText, exceptionText.getMessage());
    }

    @Test
    public void shouldGetFamilyText() {
        Animal animal = new Animal();
        String expectedText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualText = animal.getFamily();
        assertEquals(expectedText, actualText);
    }

}
//add some text to do right instructions about committing my project. this text is insignificant for project containing.