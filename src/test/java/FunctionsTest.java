import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FunctionsTest
{
    @Test
    public void unit_tests() {
        String[] arguments = new String[]{"test_01.txt"};
        String[] arguments = new String[]{"test_02.txt"};
        
        Functions obj = new Functions(arguments);
        Functions obj2 = new Functions(arguments2);
        try {
            assertEquals(obj._min(), 1);
            assertEquals(obj._max(), 8494);
            assertEquals(obj._sum(), 40913);
            assertEquals(obj2._min(), 0);
            assertEquals(obj2._max(), 9);
            assertEquals(obj2._sum(), 26);
            assertEquals(obj2._mult(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

