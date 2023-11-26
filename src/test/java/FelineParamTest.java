import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    @Spy
    Feline feline = new Feline();

    @Parameterized.Parameter
    public int countKittens;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters(name = "Количество котят {0}, ожидаемое количество {1}")
    public static Object[][] data() {
        return new Object[][]{
                {1, 1},
                {5, 5},
                {2, 2}
        };
    }


    @Test
    public void getKittensTest() {
        int actualResult = feline.getKittens(countKittens);
        assertEquals(actualResult, expectedResult);
    }
}
