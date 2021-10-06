import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Testcase")
class CalculatorTest {

    @Test
    void shouldEqual5() {
        double actual = Calculator.add(3,2);
        double expected = 5f;
        assertEquals(expected,actual);
    }
}