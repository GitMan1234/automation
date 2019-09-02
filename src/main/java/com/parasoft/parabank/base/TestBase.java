package com.parasoft.parabank.base;

import com.parasoft.parabank.utils.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    /* test base constructor : Used to initialize the properties object to fetch
    config file

     */
    public TestBase() {

        try {

            prop = new Properties();
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream ip = classLoader.getResourceAsStream("config");

            prop.load(ip);
        } catch (FileNotFoundException fnf) {

            fnf.printStackTrace();
        } catch (IOException io) {

            io.printStackTrace();
        }


    }

    public  void initialize() {

        File file = new File(
                getClass().getClassLoader().getResource("chromedriver.exe").getFile());


        // String browserName = prop.getProperty("browser");

        //if (browserName.equalsIgnoreCase("chrome")) {
        System.setProperty
                ("webdriver.chrome.driver", "/usr/bin/chromedriver");

        driver = new ChromeDriver();
        //}

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(utilities.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(utilities.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }

}
