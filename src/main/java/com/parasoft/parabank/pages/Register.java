package com.parasoft.parabank.pages;

import com.parasoft.parabank.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Register extends TestBase {

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Register')]")
    WebElement regButn;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.firstName']")
    WebElement firstNameField;

  public Register(){
      PageFactory.initElements(driver,this);

  }

    public void register(){
        regButn.click();
        firstNameField.sendKeys("navendrin");

    }


}
