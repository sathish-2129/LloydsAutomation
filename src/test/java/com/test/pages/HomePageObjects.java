package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {
    public WebDriver driver;

    By getPageLabel = By.xpath("//h1");

    By businessLink = By.xpath("//a[@href='/business.html']");

    By registerLink = By.xpath("//span[text()='Register' and @itemprop]");

    By startRegisterLink = By.xpath("//span[text()='Start registration']");

    By fullPowerSignatory = By.id("frmRegistrationTypeDetails:rdoBranchAccessRole:0");
    By continueBtn = By.id("frmRegistrationTypeDetails:Btncontinue");
    By txtBusinessName = By.id("frm1:txtBusinessName");
    By businessSortCode = By.id("frm1:businessSortCode");
    By businessSortCode_p2 = By.id("frm1:businessSortCode_p2");
    By businessSortCode_p3 = By.id("frm1:businessSortCode_p3");
    By businessAccountNumber = By.id("frm1:businessAccountNumber");
    By txtTitle = By.id("frm1:txtTitle");
    By txtFirstName = By.id("frm1:txtFirstName");
    By txtSurname = By.id("frm1:txtSurname");
    By inputdate1 = By.id("frm1:inputdate1");
    By month = By.id("frm1:inputdate1.month");
    By year = By.id("frm1:inputdate1.year");
    By txtPostCode = By.id("frm1:txtPostCode");
    By submitbutton = By.id("frm1:submitbutton");

    public HomePageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void sendKeys(By element,String message) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(message);
    }
    public void selectByText(By element,String option) {
        Select objSelect =new Select(driver.findElement(element));
        objSelect.selectByVisibleText(option);
    }

    public void waitForElementVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getPageLabel() {
        return driver.findElements(getPageLabel).get(1).getText();
    }

    public void navigateHome() {
        waitForElementVisible(businessLink);
        click(businessLink);
    }

    public String getRegisterPage() {
        return driver.findElement(getPageLabel).getText();
    }

    public void startRegister() {
        waitForElementVisible(registerLink);
        click(registerLink);
    }

    public void clickRegister() {
        waitForElementVisible(startRegisterLink);
        click(startRegisterLink);
    }

    public void clickFullPower() {
        waitForElementVisible(fullPowerSignatory);
        click(fullPowerSignatory);
    }

    public void clickContinue() {
        waitForElementVisible(continueBtn);
        click(continueBtn);
    }

    public void enterYourDetails(String businessName,String sortcode,String sortcode1,String sortcode2,String acc,
                                 String title,String firstName,String lastName,String date,String Month,String Year,
                                 String postcode){
        waitForElementVisible(txtBusinessName);
        sendKeys(txtBusinessName,businessName);
        sendKeys(businessSortCode,sortcode);
        sendKeys(businessSortCode_p2,sortcode1);
        sendKeys(businessSortCode_p3,sortcode2);
        sendKeys(businessAccountNumber,acc);
        sendKeys(txtTitle,title);
        sendKeys(txtFirstName,firstName);
        sendKeys(txtSurname,lastName);
        selectByText(inputdate1,date);
        selectByText(month,Month);
        selectByText(year,Year);
        sendKeys(txtPostCode,postcode);
        click(submitbutton);
    }

}
