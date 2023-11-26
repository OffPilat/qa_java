import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getKittensTest() {
        //Mockito.when(feline.getKittens()).thenReturn(0);
        Feline feline = new Feline();
        int actualResult = feline.getKittens();
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);
    }

}
