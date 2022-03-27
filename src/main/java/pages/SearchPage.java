package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"nav-search-bar-form\"]/div[3]/div")
    WebElement searchbutton;

    public void addJavaToTheSearchBox(){searchBar.sendKeys("javabooks");}
    public void clickOnSearchButton(){searchbutton.click();}
    public void searchForJavaBooks(String item){searchBar.sendKeys("Java books");}
}
