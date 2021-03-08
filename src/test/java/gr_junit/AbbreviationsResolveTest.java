package gr_junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbbreviationsResolveTest {

    AbbreviationsResolver abbreviationsResolver = new AbbreviationsResolver();

    @Test
    public void createAbbreviations() {
        String inputData = "Korean National Republic";
        String rememberResult = "KNR";
        String newResult = abbreviationsResolver.createAbbreviations(inputData);
        assertEquals(rememberResult, newResult);
    }

    @Test
    public void createAbbreviationTest_excetionFlow() {
        String inccorectName1 = "Name,York";
        Exception exception = assertThrows(Exception.class, () -> abbreviationsResolver.
                createAbbreviations(inccorectName1));
        assertEquals("Name 1", exception.getMessage());
    }
}
