package gr_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbbreviationsResolveTest {

    AbbreviationsResolver abbreviationsResolver = new AbbreviationsResolver();

    @Test
    public void createAbbreviations() {
        String inputData = "Korean National Republic";
        String  rememberResult= "KNR";
        String newResult = abbreviationsResolver.createAbbreviations(inputData);
        Assertions.assertEquals(rememberResult, newResult);
    }

}
