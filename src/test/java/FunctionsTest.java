import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FunctionsTest
{
    @Test
    public void check() {
        String[] arguments = new String[]{"tests/test_01.txt"};

        Functions obj = new Functions(arguments);
        
        try {
            assertEquals(obj._min(), 1);
            assertEquals(obj._max(), 8494);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

