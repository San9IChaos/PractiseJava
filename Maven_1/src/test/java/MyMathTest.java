import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test
    public void zeroDenominatorShouldThrowException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyMath.divide(1,0);
        });
    }
}
