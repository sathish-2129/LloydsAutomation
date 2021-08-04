package com.test.stepDefs;

import com.test.config.BasePage;
import com.test.pages.HomePageObjects;
import io.cucumber.datatable.DataTable;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.List;

public class BaseStepDef extends BasePage {
    HomePageObjects home;
    Scenario scenario;

    @Before
    public void startDriver() {
        webDriver();
        home = new HomePageObjects(driver);
    }

    @Given("I am navigating to the home page")
    public void i_am_navigating_to_the_home_page() {
        driver.get("https://www.lloydsbank.com/");

    }

    @Then("I need to verify the home page")
    public void i_need_to_verify_the_home_page() {
        System.out.println("Page title:::::" + driver.getTitle());
        Assert.assertTrue("verified home page..",
                home.getPageLabel().equals("The new Lloyds Bank Cashback credit card"));
    }


    @When("I select the business")
    public void i_select_the_business() {
        home.navigateHome();
    }


    @Then("I need to verify the business page")
    public void iNeedToVerifyTheBusinessPage() {
        System.out.println("Page title:::::" + driver.getTitle());
        Assert.assertTrue("verified business page..",
                home.getPageLabel().equals("Try our accounting software for free"));
    }


    @When("I go to registration")
    public void i_go_to_registration() {
        home.startRegister();
    }

    @Then("verify the register page")
    public void verify_the_register_page() {
        System.out.println("Page title:::::" + driver.getTitle());
        Assert.assertTrue("verified login page..",
                home.getRegisterPage().equals("Register for Online for Business"));
    }

    @After
    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    @When("I start the registration")
    public void iStartTheRegistration() {
        home.clickRegister();
    }

    @Then("verify the login page")
    public void verifyTheLoginPage() {
        System.out.println("Page title:::::" + driver.getTitle());
        Assert.assertTrue("verified login page..",
                home.getRegisterPage().equals("Register for Online for Business"));

    }

    @When("I click on the Full Power Signatory")
    public void iClickOnTheFullPowerSignatory() {
        home.clickFullPower();
    }

    @And("I click on the continue")
    public void iClickOnTheContinue() {
        home.clickContinue();
    }

    @Then("verify the your details page")
    public void verifyTheYourDetailsPage() {
        System.out.println("Page title:::::" + driver.getTitle());
        Assert.assertTrue("verified login page..",
                home.getRegisterPage().equals("Register for Online for Business"));
    }

    @And("I enter all your details")
    public void iEnterAllYourDetails(DataTable enterYourDetails) {
        List<List<String>> data = enterYourDetails.asLists();
        home.enterYourDetails(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3),
                data.get(0).get(4),data.get(0).get(5),data.get(0).get(6),data.get(0).get(7),data.get(0).get(8),
                data.get(0).get(9),data.get(0).get(10),data.get(0).get(11));
    }
}
