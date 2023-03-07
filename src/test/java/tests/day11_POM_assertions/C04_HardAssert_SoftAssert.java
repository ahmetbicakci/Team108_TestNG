package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssert_SoftAssert {


    @Test
    public void hardAssertionTest(){


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(5>8);

             softAssert.assertFalse(8==8);
             softAssert.assertEquals(5,9);
             softAssert.assertNotEquals(6,6);




    }

    @Test
    public void SoftdAssertionTest(){


        Assert.assertTrue(5>8);

        Assert.assertFalse(8==8);

        Assert.assertEquals(5,9);

        Assert.assertNotEquals(6,6);





    }



}
