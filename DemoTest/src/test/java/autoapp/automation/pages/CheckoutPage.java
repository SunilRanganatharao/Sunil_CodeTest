package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutPage extends BasePage{

    public static String quickview_xpath = "(//a[@class='quick-view'])[1]";
    public static String dress_xpath = ".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img";
    public static String itemcolor_xpath = "//a[@id='color_14'][@title='Blue']";
    public static String addtocart_xpath = "//p[@id='add_to_cart']";
    public static String addeditemcolor_xpath = "//div[@class='layer_cart_product_info']";
    
    public static String getcolorvalue;
    public static String getquantityvalue;
    
    
   
   public CheckoutPage(BrowserDriver driver) 
   {
        super(driver);
    }

   public static void clickquickview() throws Throwable 
    {
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dress_xpath)));  

	    WebElement menu = driver.findElement(By.xpath(dress_xpath));
	    Actions builder = new Actions(driver); 
	    builder.moveToElement(menu).build().perform();
        WebElement menuOption = driver.findElement(By.xpath(quickview_xpath));
	    menuOption.click();
	    Thread.sleep(5000);
	}
   
   public static void changecolor_addtocart() throws Throwable
   {
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath(itemcolor_xpath)).click();
	   driver.findElement(By.xpath(addtocart_xpath)).click();
	   driver.switchTo().defaultContent();
	}
   
   public static void validatecolor() throws Throwable
   {
	   
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addeditemcolor_xpath))); 
	   getcolorvalue= driver.findElement(By.xpath(addeditemcolor_xpath)).getText();
       if (getcolorvalue.contains("Blue"))
    	   {
               System.out.println("color of the added item is validated "+getcolorvalue);
           } else 
           {
               System.out.println("color validation of item added is failed "+getcolorvalue);
           }
    	   
     }
   public static void validatequantity() throws Throwable
   {
	   
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addeditemcolor_xpath))); 
	   getquantityvalue = driver.findElement(By.xpath(addeditemcolor_xpath)).getText();
       
       if (getquantityvalue.contains("1"))
    	   {
               System.out.println("quantity of the added item is validated "+getquantityvalue);
           } else 
           {
               System.out.println("qunatity validation of item added is failed "+getquantityvalue);
           }
    	   
     }
	   
	}
   

