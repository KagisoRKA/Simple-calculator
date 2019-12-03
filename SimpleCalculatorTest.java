import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void add(){
        assertEquals(4, SimpleCalculator.add(2,2));
    }
    @Test
    void multiply(){
        assertEquals(4, SimpleCalculator.multiply(2,2));
    }
}