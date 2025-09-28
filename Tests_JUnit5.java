import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class FactorialCalculatorTest {
        @Test
        void testFactorial() {
            FactorialCalculator calculator = new FactorialCalculator();
            assertEquals(120, calculator.factorial(5));
            assertEquals(1, calculator.factorial(0));
        }
    }

    class TriangleAreaCalculatorTest {
        @Test
        void testArea() {
            TriangleAreaCalculator calculator = new TriangleAreaCalculator();
            assertEquals(6.0, calculator.calculateArea(3, 4, 5), 0.001);
        }
    }

    class CalculatorTest {
        @Test
        void testOperations() {
            Calculator calc = new Calculator();
            assertEquals(5, calc.add(2, 3));
            assertEquals(1, calc.subtract(5, 4));
            assertEquals(6, calc.multiply(2, 3));
            assertEquals(2.0, calc.divide(6, 3));
        }
    }

    class NumberComparatorTest {
        @Test
        void testCompare() {
            NumberComparator comparator = new NumberComparator();
            assertEquals("Первое число больше", comparator.compare(5, 3));
            assertEquals("Числа равны", comparator.compare(4, 4));
            assertEquals("Второе число больше", comparator.compare(2, 5));
        }
    }

