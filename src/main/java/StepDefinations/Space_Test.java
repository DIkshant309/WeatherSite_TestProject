package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class Space_Test {

    WebDriver driver;
LoginPage space;
LoginPage see;

    @Given("enter into the wbepage")
    public void enter_into_the_wbepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        space = new LoginPage(driver);
        see = new LoginPage(driver);
        driver.get("https://www.theweathernetwork.com/ca");

        see.SeeAllNews();
        Thread.sleep(1000);
        space.SpaceClick();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click in the space")
    public void click_in_the_space() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("check if it got clicked")
    public void check_if_it_got_clicked() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
