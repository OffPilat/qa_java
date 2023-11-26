import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {
    @Mock
    Feline feline;

    @Parameterized.Parameter
    public int countKittens;
    @Parameterized.Parameter(1)
    public int expectedKittens;
    @Parameterized.Parameter(2)
    public String sex;
    @Parameterized.Parameter(3)
    public Boolean expectedSex;

    @Parameterized.Parameters(name = "Количество котят {0}, ожидаемое количество {1}; Пол {2} Значение {3}")
    public static Object[][] data() {
        return new Object[][]{
                {1, 1, "Самец", true},
                {5, 5, "Самка", false}
                //,{2, 2, "НедопустимоеЗначение", false} Как можно реализовать кейс с недопустимым значением чтобы он не падал?
        };
    }

    @Before
    public void setUpMock() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(countKittens);
        int actualResult = lion.getKittens();
        int expectedResult = expectedKittens;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex);
        Boolean actualResult = lion.doesHaveMane();
        Boolean expectedResult = expectedSex;
        assertEquals(actualResult, expectedResult);
    }
}
