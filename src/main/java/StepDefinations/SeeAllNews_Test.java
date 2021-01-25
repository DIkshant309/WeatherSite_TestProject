package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class SeeAllNews_Test {

    WebDriver driver;
    LoginPage see;


    @Given("enter to the website")
    public void enter_to_the_website() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.theweathernetwork.com/ca");
        see = new LoginPage(driver);
        Thread.sleep(2000);

        see.SeeAllNews();

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on the see all news")
    public void click_on_the_see_all_news() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify if its clicked")
    public void verify_if_its_clicked() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
