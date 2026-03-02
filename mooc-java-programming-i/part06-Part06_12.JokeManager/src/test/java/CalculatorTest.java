import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void initialize(){
        this.calculator = new Calculator();
    }


    @Test
    public void calculatorInitialValueZero() {
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        calculator.subtract(2);
        assertEquals(-2, calculator.getValue());
    }
}