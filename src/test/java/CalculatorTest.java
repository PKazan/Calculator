import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        long result = Calculator.addTwoNumbers(100,50);

        Assertions.assertEquals(150, result);
    }
    @Test
    void shouldAddTwoNegativeNumbers() {
        long result = Calculator.addTwoNumbers(-100,-50);

        Assertions.assertEquals(-150, result);
    }
    @Test
    void shouldAddPositiveAndNegativeNumbers() {
        long result = Calculator.addTwoNumbers(100,-50);

        Assertions.assertEquals(50, result);
    }

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        long result = Calculator.subtractTwoNumbers(100,50);

        Assertions.assertEquals(50, result);
    }
    @Test
    void shouldSubtractTwoNegativeNumbers() {
        long result = Calculator.subtractTwoNumbers(-100,-50);

        Assertions.assertEquals(-50, result);
    }
    @Test
    void shouldSubtractPositiveAndNegativeNumbers() {
        long result = Calculator.subtractTwoNumbers(100,-50);

        Assertions.assertEquals(150, result);
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers(){
        long result = Calculator.multiplyTwoNumbers(100,50);

        Assertions.assertEquals(5000, result);
    }
    @Test
    void shouldMultiplyTwoNegativeNumbers(){
        long result = Calculator.multiplyTwoNumbers(-100,-50);

        Assertions.assertEquals(5000, result);
    }
    @Test
    void shouldMultiplyPositiveAndNegativeNumbers(){
        long result = Calculator.multiplyTwoNumbers(100,-50);

        Assertions.assertEquals(-5000, result);
    }
    @Test
    void shouldMultiplyBy0(){
        long result = Calculator.multiplyTwoNumbers(100,0);

        Assertions.assertEquals(0, result);
    }
    @Test
    void shouldDivideTwoNumbers(){
        long result = Calculator.divideTwoNumbers(100,50);

        Assertions.assertEquals(2, result);
    }@Test
    void shouldDivideTwoNegativeNumbers(){
        long result = Calculator.divideTwoNumbers(-100,-50);

        Assertions.assertEquals(2, result);
    }@Test
    void shouldDividePositiveAndNegativeNumbers(){
        long result = Calculator.divideTwoNumbers(100,-50);

        Assertions.assertEquals(-2, result);
    }@Test
    void shouldDivideBy0(){
        long result = Calculator.divideTwoNumbers(100,0);

        Assertions.assertEquals(0, result);
    }


}
