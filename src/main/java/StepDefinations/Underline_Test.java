package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class Underline_Test {
    WebDriver driver;
    LoginPage latest;
    LoginPage see;

    @Given("enter to the site")
    public void enter_to_the_site() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.theweathernetwork.com/ca");
        see = new LoginPage(driver);
        latest = new LoginPage(driver);


        see.SeeAllNews();
        System.out.println(latest.Underline());

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("checking if Latest is underlined")
    public void checking_if_latest_is_underlined() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("show the results")
    public void show_the_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
