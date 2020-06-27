import org.junit.Test;

/**
 * Created by Марина on 23.06.2020.
 */
public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond(){
        NetworkUtils.getConnection();
    }
}
