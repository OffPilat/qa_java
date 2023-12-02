import com.example.Alex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {


    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex();
        int actualResult = alex.getKittens();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex();
        List actualResult = alex.getFriends();
        List expectedResult = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex();
        String actualResult = alex.getPlaceOfLiving();
        String expectedResult = "Нью-Йоркский зоопарк";
        assertEquals(expectedResult, actualResult);
    }


}
