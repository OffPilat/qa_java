import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineTest {

    @Mock
    Animal animal;


    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

}
