package tests.day13crossBrowsersTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class C01_PozitifLoginTestiCross extends TestBaseCross {

    @Test (groups ="smoke")
    public void pozitifLoginTesti(){
        // qd anasayfaya gidin


        driver.get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin
        QdPage qdPage= new QdPage();
        qdPage.ilkLoginLinki.click();

        // gecerli kullanici adi ve password ile giris yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonu.click();

        // basarili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

        Driver.closeDriver();
    }
}
