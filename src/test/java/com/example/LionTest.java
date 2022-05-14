package com.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;

    @Before
    public void setLion() throws Exception {
       lion = new Lion("Самка", feline);
    }
    @Mock
    Feline feline;

    @Test
    public void shouldSeeExceptionWhenSexIsUnknown() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Небинарный", feline));
        String expectedExceptionText = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals
                (expectedExceptionText, exception.getMessage());
    }

    @Test
    public void shouldLionEatMeat() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLionHaveOneKitten() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

}