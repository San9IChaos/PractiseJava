import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeAll
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        // assertion
        Assertions.assertEquals(0,v1.length(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assertions.assertEquals(0,v1.getX(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Assertions.assertEquals(0,v1.getY(),EPS);
    }
}
