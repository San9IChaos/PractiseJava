import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class NetworkUtilsTest {
    @Test
    @Timeout(1)
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}
