import static org.junit.Assert.*;	
import org.junit.*;

public class DemoTest {
    @Test
    public void testMultiplcation(){
        assertEquals(6,Demo.multiplication(2, 3));
    }
}
