import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Spy
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actualResult = cat.getSound();
        String expectedResult = "Мяу";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> actualResult = cat.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actualResult, expectedResult);
    }
}
