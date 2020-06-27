/**
 * Created by Марина on 23.06.2020.
 */
public class MyMath {
    public static double divide(int number1, int number2){
        if (number2==0)
            throw new ArithmeticException("Cant't divide by zero");
        return number1/number2;

    }
}
