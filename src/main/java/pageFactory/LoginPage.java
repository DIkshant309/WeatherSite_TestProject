package pageFactory;

import StepDefinations.Space_Underline;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"current-location-ip\"]/div[1]/a/div[2]/div[2]/div[2]")
    WebElement temp;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div[6]/div[5]/div[2]/p/a")
    WebElement see;
    @FindBy(how = How.XPATH, using = "//*[@id=\"category-subnav\"]/ul/li[1]/a")
    WebElement latest;
    @FindBy(how = How.XPATH, using = "//*[@id=\"category-subnav\"]/ul/li[4]/a")
    WebElement space;
    @FindBy(how = How.XPATH, using = "//*[@id=\"category-subnav\"]/ul/li[4]/a")
    WebElement under_space;


    public String Temprature()
    {
       String abc = temp.getText();

        return abc;
    }

    public void SeeAllNews() throws InterruptedException {
        Thread.sleep(2000);

        see.click();
    }

    public String Underline()
    {
        String abc = latest.getCssValue("text-decoration");


        return abc;
    }
    public void SpaceClick()
    {
        space.click();
    }

    public String SpaceUnderline()
    {
        String abc = under_space.getCssValue("text-decoration");
        return abc;
    }

}

