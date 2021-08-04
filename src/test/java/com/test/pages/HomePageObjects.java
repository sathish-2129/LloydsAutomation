package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {
    public WebDriver driver;

    By getPageLabel = By.xpath("//h1");

    By businessLink = By.xpath("//a[@href='/business.html']");

    By registerLink = By.xpath("//span[text()='Register' and @itemprop]");

    public HomePageObjects(WebDriver driver){
        this.driver=driver;
    }

    public void click(By element){
        driver.findElement(element).click();
    }

    public void waitForElementVisible(By element){
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getPageLabel(){
        return driver.findElements(getPageLabel).get(1).getText();
    }

    public void navigateHome(){
        waitForElementVisible(businessLink);
        click(businessLink);
    }


    public String getRegisterPage(){
        return driver.findElement(getPageLabel).getText();
    }

    public void startRegister(){
        waitForElementVisible(registerLink);
        click(registerLink);
    }

}
