package autoapp.automation.utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
    public static BrowserDriver driver;

    @Before
    public void setUp(){
        String browserName = "chrome";//getParameter("browser");
        System.out.println("driver "+ browserName +"");
       driver = new BrowserDriver("chrome");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    private String getParameter(String name) {
        String value = "chrome"; //System.getProperty(name);
        if (value == null)
            throw new RuntimeException(name + " is not a parameter!");

        if (value.isEmpty())
            throw new RuntimeException(name + " is empty!");

        return value;
    }
}
