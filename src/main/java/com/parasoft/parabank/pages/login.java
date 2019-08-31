package com.parasoft.parabank.pages;

import com.parasoft.parabank.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login extends TestBase {

    @FindBy(how = How.XPATH,using = "//input[@class ='input' and @name ='username']")
    WebElement userName;

    @FindBy(how = How.XPATH,using = "//input[@class ='input' and @name ='password']")
    WebElement pass;





}
