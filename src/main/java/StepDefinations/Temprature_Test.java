package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class Temprature_Test {

    public LoginPage pass;
    WebDriver driver;
   LoginPage temp;
    @Given("Enter to the webpage")
    public void enter_to_the_webpage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.theweathernetwork.com/ca");
        temp= new LoginPage(driver);
        String abc = temp.Temprature();
        System.out.println(abc);
        String abcd = abc.substring(0,2);
        System.out.println(abcd);
        int i=Integer.parseInt(abcd);

        if(i<15)
        {
System.out.println("test is fail");
        }
        else
        {
            System.out.println("test is pass");
        }


        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("verify the temprature")
    public void verify_the_temprature() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Show the results")
    public void show_the_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
