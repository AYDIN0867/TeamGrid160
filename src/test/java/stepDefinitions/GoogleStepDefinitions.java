package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

public class GoogleStepDefinitions {

   WebDriver driver=Hooks.driver;
    @Given("Kullanici Url'e gider.")
    public void kullanici_url_e_gider() {
driver.get("https://www.google.com");

    }

    @Given("Kullanici Url'i dogrular.")
    public void kullanici_url_i_dogrular() {

        String expectedData="Google";
        String actualData=driver.getTitle();

       assertEquals(actualData,expectedData);


    }

    @Given("Kullanici sayfayi kapatir.")
    public void kullanici_sayfayi_kapatir(){

        //hook class ında oldugu için default olarak gercekleşek fazladan kapamaya gerek yok







    }



}
