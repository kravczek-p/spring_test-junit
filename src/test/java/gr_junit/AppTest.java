package gr_junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Calculator calculator=new Calculator();
        int a=2, b=4;
        int result=calculator.add(a,b);
        Assertions.assertEquals(6,result);

    }
}
