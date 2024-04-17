import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import timeUtils.TimeUtils;

public class TimeUtilsTest {

    @ParameterizedTest
    @CsvSource({
        "'1:30:15', 5415",
        "'0:00:00', 0",
        "'8:53:19', 31999",
        "'0:00:10', 10"
    })
    public void timeToSecConvertsCorrectly(String time, int expectedSeconds) {
        int result = TimeUtils.timeToSec(time);
        assertEquals(expectedSeconds, result);
    }

    @ParameterizedTest
    @CsvSource({
        "5415, '1:30:15'",
        "0, '0:00:00'",
        "31999, '8:53:19'",
        "32000, '-1'",
        "10, '0:00:10'"
    })
    public void secToTimeConvertsCorrectly(int seconds, String expectedTime) {
        String result = TimeUtils.secToTime(seconds);
        assertEquals(expectedTime, result);
    }
    
}