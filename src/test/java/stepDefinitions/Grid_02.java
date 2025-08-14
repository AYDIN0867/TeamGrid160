package stepDefinitions;

import manage.GridDriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Grid_02 {


GridDriverManage manage=new GridDriverManage();
WebDriver driver;


@Test
void chromeTest(){

      driver=manage.setUpChromeDriver();
      driver.get("https://www.youtube.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());


}









}
