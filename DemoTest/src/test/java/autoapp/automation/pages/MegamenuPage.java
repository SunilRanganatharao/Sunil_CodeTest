package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MegamenuPage extends BasePage{

    public static String dresses_xpath = ".//*[@id='block_top_menu']/ul/li[2]/a";
    public static String summerdresses_xpath = ".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a";
    public static String actualTitle;
    
   public MegamenuPage(BrowserDriver driver) 
   {
        super(driver);
    }

   public static void clickSummerDresses() 
    {
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dresses_xpath)));

	    WebElement menu = driver.findElement(By.xpath(dresses_xpath));
	    Actions builder = new Actions(driver); 
	    builder.moveToElement(menu).build().perform();

	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(summerdresses_xpath))); 

	    WebElement menuOption = driver.findElement(By.xpath(summerdresses_xpath));
	    menuOption.click();
	    
    }
   
   public static void verify_SummerDressesPage(String expectedtitle) 
   {
	   actualTitle = driver.getTitle();
	   if (actualTitle.contentEquals(expectedtitle))
	   {
           System.out.println("title of Summer page is verified and validated");
       } else 
       {
           System.out.println("Test Failed");
       }
   }
   
}
