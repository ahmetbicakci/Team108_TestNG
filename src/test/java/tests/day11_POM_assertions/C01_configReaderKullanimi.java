package tests.day11_POM_assertions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_configReaderKullanimi {

    @Test
    public void test01(){


        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella icin arama yap
        AmazonPage amazonPage=new AmazonPage();

        // Test datasi olarak verilen

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);


        String expectedIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualAramaSonucYazisi=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();
    }
}
