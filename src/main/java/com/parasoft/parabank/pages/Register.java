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

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.lastName']")
    WebElement lastname;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.address.street']")
    WebElement add;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.address.city']")
    WebElement city;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.address.state']")
    WebElement state;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.address.zipCode']")
    WebElement zip;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.phoneNumber']")
    WebElement phone;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.ssn']")
    WebElement ssn;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.username']")
    WebElement username;

    @FindBy(how = How.XPATH, using = "//input[@id ='customer.password']")
    WebElement pass;

    @FindBy(how = How.XPATH, using = "//input[@id ='repeatedPassword']")
    WebElement passconf;

    @FindBy(how = How.XPATH, using = "//input[@class = 'button' and @type = 'submit' and @value ='Register']")
    WebElement registerButton;






  public Register(){
      PageFactory.initElements(driver,this);

  }

    public String register(){
        regButn.click();
        firstNameField.sendKeys("navendrin");
        lastname.sendKeys("coop");
        add.sendKeys("jasdas");
        city.sendKeys("dfksdkfsdf");
        state.sendKeys("asgjasgfjasf");
        zip.sendKeys("dbfksdjbf");
        phone.sendKeys("011 1131 3131");
        ssn.sendKeys("1312313131");
        username.sendKeys("navenSFS1sfsf235");
        pass.sendKeys("password");
        passconf.sendKeys("password");
        registerButton.click();
        System.out.println(driver.getCurrentUrl());
        return driver.findElement(By.xpath("//h1")).getText();

    }


}
