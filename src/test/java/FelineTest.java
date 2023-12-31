import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {


    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
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
