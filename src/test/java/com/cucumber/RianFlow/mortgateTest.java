package com.cucumber.RianFlow;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mortgateTest {
  private WebDriver driver;
  private String baseUrl;
  
  

  @BeforeClass
  public void setUp() throws Exception {
    
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to("http://www.bbc.co.uk/homes/property/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void mortgatecal() throws Exception {
    driver.get(baseUrl + "/homes/property/");
    driver.findElement(By.linkText("Mortgage calculator")).click();
    driver.findElement(By.name("A")).sendKeys("600000");
    driver.findElement(By.name("T")).sendKeys("30");
    driver.findElement(By.name("R")).sendKeys("6");
    driver.findElement(By.name("btnCalc")).click();
    driver.findElement(By.name("btnClear")).click();
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }

}
