package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage {
    WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")
    WebElement resultMessage;

    @FindBy(xpath = "//*[@id=\"CardInstanceHQQyIe3cvYOGsd-gEei0ow\"]/div[1]/div[1]/div/div[2]/div/a/span/span[2]")
    WebElement resultLogo;



        public void validateHomePageIsDisplayed() {
        Assert.assertEquals(resultLogo.isDisplayed(), true, "result message isn't displayed");
    }

    }


