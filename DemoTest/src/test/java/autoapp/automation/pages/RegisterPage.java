package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage extends BasePage{

    public static String signIn_xpath = "//a[@title='Log in to your customer account']";
    public static String email_id = "email_create";
    public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";
    public static String errorMessage_invalidemail = "//div[@id='create_account_error']";
    

    public RegisterPage(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplicaiton() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void clickSignIn() 
    {
        driver.findElement(By.xpath(signIn_xpath)).click();
    }

    public static void createAccount(String emailid) 
    {
        emailid= emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
        WebDriverWait wait = new WebDriverWait(driver, 5);
 	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(email_id)));
        driver.findElement(By.id(email_id)).sendKeys(emailid);
        driver.findElement(By.xpath(createAccount_xpath)).click();
    }
    
    public static void verifyinvalidEmail(String validation) 
    {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 5);
 	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(errorMessage_invalidemail)));
    	WebElement Email_val_field=driver.findElement(By.xpath(errorMessage_invalidemail));
		String Act_Email_val=Email_val_field.getText();
		
		if(validation.equals(Act_Email_val))
		{
		System.out.println("Actual And Expected Validation are Same and It is:"+Act_Email_val);
		}
		else
		{
			System.out.println("Actual is:"+Act_Email_val);
			System.out.println("Expected is:"+validation);
		}	
    	
    	
    }
    
    
}
