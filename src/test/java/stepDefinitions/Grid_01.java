package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_01 {

    //testi koşabilmek için driver ı tanımlarım
    //static yaptım çünkü diğer methodlarda da kullanmak isityorum

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

       driver=new RemoteWebDriver(new URL("http://192.168.3.206:4444"),new ChromeOptions());
       //local driver'i Remote driver'a(RemoteDriver) çevirdik.
        //RemoteWebDriver'in calisacagi NODE'u belirttik(URL girerek).
        //Ayrica NODE icerisinde hangi browserda test kosulacagini da Options girerek belirledik.

        driver.get("https://wisequarter.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }

@Test
void fireFoxGridTest() throws MalformedURLException {

driver=new RemoteWebDriver(new URL("http://192.168.3.206:4444"),new FirefoxOptions());
//Bu satırda Node ve Node icerisinde bulunan browser ı sectik(firefox)
    driver.get("https://wisequarter.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());




}

//Bu test kosumlarımızı hazirladigimiz GRID ortamında yaptık
    //Ancak capabilities gondermeden mevcuttaki Oprionsları kullanarak basit kusumlar gerceklestirdik.





}
