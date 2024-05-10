import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FunctionsTest
{
    @Test
    public void unit_tests() {
        String[] arguments = new String[]{"src/main/resources/test_01.txt"};
        String[] arguments2 = new String[]{"src/main/resources/test_02.txt"};
        
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
    
    @Test
    public void speed_test() {
        String[] arguments = new String[]{"src/main/resources/test_01.txt"};
        String[] arguments2 = new String[]{"src/main/resources/test_03.txt"};
        
        Functions obj = new Functions(arguments);
        Functions obj2 = new Functions(arguments2);
        long start_point = System.currentTimeMillis();
        for (int i = 0; i < 1000; ++i) {
            assertEquals(obj._min(), 1);
        }
        long inter_point = System.currentTimeMillis();
        for (int i = 0; i < 1000; ++i) {
            assertEquals(obj2._min(), 1);
        }
        long end_point = System.currentTimeMillis();
        
        assertTrue(inter_point - start_point < end_point - inter_point);
    }
    
    @Test 
    public void another_test() {
        String[] arguments = new String[]{"src/main/resources/test_04.txt"};
        
        Functions obj = new Functions(arguments);
        
        assertEquals(obj._min(), obj._max());
    }
}

