package gr_junit;


import org.junit.jupiter.api.Test;

public class AbbreviationsResolveTest {

    AbbreviationsResolver abbreviationsResolver = new AbbreviationsResolver();

    @Test
    public void createAbbreviations() {
        String inputData = "Korean National Republic";
        String  rememberResult= "KNR";
        String newResult = abbreviationsResolver.createAbbreviations(inputData);
        assertEquals(rememberResult, newResult);
    }
//    @Test
//    public void createAbbreviationTest_excetionFlow(){
//        String inccorectName1="New, York";
//        Exception exception=Assertions.assertThrows(RuntimeException.class ,
//                ()->abbreviationsResolver,createAbbreviations(inccorectName1));
//        Assertions.assertEquals("Name 1");
//    }

}
