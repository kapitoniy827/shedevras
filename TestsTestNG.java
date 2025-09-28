import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void testFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(calculator.factorial(5), 120);
        assertEquals(calculator.factorial(0), 1);
    }
}

public class TriangleAreaCalculatorTest {
    @Test
    public void testArea() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        assertEquals(calculator.calculateArea(3, 4, 5), 6.0, 0.001);
    }
}

public class CalculatorTest {
    @Test
    public void testOperations() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 3), 5);