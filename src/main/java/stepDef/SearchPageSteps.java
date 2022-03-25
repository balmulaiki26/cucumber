package stepDef;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchPageSteps {
    public static WebDriver driver;
    @Given("^I open the browser$")
    public void i_open_the_browser(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @When("^I navigate to amazon page$")
    public void i_navigate_to_amazon_page(){
        driver.get("https://www.amazon.com");

    }


    @Then("^I can see the amazon homepage$")
    public void i_can_see_the_amazon_homepage(){
        boolean status =driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
        Assert.assertEquals(true,status);

    }

    @Then("^I type 'java books' to search bar and clicked on search button$")
    public void i_type_java_books_to_search_bar_and_clicked_on_search_button(){
        driver.findElement(By.xpath("/html//input[@id='twotabsearchtextbox']")).sendKeys("Javabooks");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

    }

    @Then("^I validate search items has been displayed$")
    public void i_validate_search_items_has_been_displayed(){
        boolean status =driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).isDisplayed();
        Assert.assertEquals(true,status);

    }

    @Then("^I quit browser$")
    public void i_quit_browser(){
        driver.quit();
    }

}
