package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage{

    String browserName = "Chrome";
    LoadProp loadProp = new LoadProp();


    public void openBrowser(){

        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        }

        else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.geko.driver", "src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

       else {
            System.out.println("Incorrect Browser");
        }

       driver.manage().window().maximize();
       driver.get(loadProp.getProperty("url"));
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);


    }

    public void closeBrowser(){
      //  driver.close();
    }

}
