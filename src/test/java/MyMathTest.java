import org.junit.Test;

/**
 * Created by Марина on 23.06.2020.
 */
public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException(){
        MyMath.divide(1, 0);
    }
}
