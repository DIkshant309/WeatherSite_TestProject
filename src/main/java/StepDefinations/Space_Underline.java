package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class Space_Underline {
    WebDriver driver;
    LoginPage under_space;
    LoginPage see;
    LoginPage space;


    @Given("enter into the website")
    public void enter_into_the_website() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.theweathernetwork.com/ca");
        under_space = new LoginPage(driver);
        see = new LoginPage(driver);
        space = new LoginPage(driver);



       see.SeeAllNews();
        Thread.sleep(1000);
        space.SpaceClick();


        System.out.println(under_space.SpaceUnderline());

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on the spcae")
    public void click_on_the_spcae() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Check wheather its underlined or not")
    public void check_wheather_its_underlined_or_not() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
