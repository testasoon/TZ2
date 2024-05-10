import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FunctionsTest
{
    @Test
    public void check() {
        String[] arguments = new String[]{"test_01.txt"};
        arguments[0] = filename;

        Functions obj = new Functions(arguments);
        
        try {
            assertEquals(obj._min(), 1);
            assertEquals(obj._max(), 8494);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

