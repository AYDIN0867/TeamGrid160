package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDriverManage {

  static WebDriver driver;

  DesiredCapabilities capabilities=new DesiredCapabilities();

  public WebDriver setUpChromeDriver()  {

   //   driver=new RemoteWebDriver(new URL("http://192.168.3.206:4444"),new FirefoxOptions());

      capabilities.setPlatform(Platform.ANY);//Platform secimi yaptik
      capabilities.setBrowserName("chrome");//Browsername secimi yaptık.
      capabilities.setVersion(" 139.0.7258.128");//Browser version secimi yaptık

      ChromeOptions chromeOptions=new ChromeOptions();
      chromeOptions.merge(capabilities);

      try {
          driver=new RemoteWebDriver(new URL("http://192.168.3.206:4444"),chromeOptions);
      } catch (MalformedURLException e) {
          throw new RuntimeException(e);
      }

      //exception değilde try catch secmemizin nedeni method un cagırıldıgı heryerde exception fırlatmaısnı istemeyiz
      //bu nedenle exception fırlatmak yerine try catch sectik...
      return driver;

  }
//eğer bilgisayardaki cmd terminali açık ise ide yani intellij deki terminalden hub oluşturmak için girilen standalone
    //kodları hata verecektir buradan hub oluşturmadan önce cmd nin kapalı oldugunu kontrol et...

public WebDriver setUpFireFoxDriver(){

    capabilities.setPlatform(Platform.ANY);//Platform secimi yaptik
    capabilities.setBrowserName("firefox");//Browsername secimi yaptık.
    capabilities.setVersion("141.0.3");//Browser version secimi yaptık

    FirefoxOptions firefoxOptions=new FirefoxOptions();
    firefoxOptions.merge(capabilities);

    try {
        driver=new RemoteWebDriver(new URL("http://192.168.3.206:4444"),firefoxOptions);
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    }


    return driver;
}

    public WebDriver setUpEdgeDriver(){

        capabilities.setPlatform(Platform.ANY);//Platform secimi yaptik
        capabilities.setBrowserName("edge");//Browsername secimi yaptık.
        capabilities.setVersion("139.0.3405.86");//Browser version secimi yaptık

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.merge(capabilities);

        try {
            driver=new RemoteWebDriver(new URL("http://192.168.3.206:4444"),edgeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        return driver;
    }






}
