package search;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class itemsView {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void launchHomepage() {
        //Section: opens homepage & verify it loaded correctly
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//button[@aria-label='Consent']")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Automation Exercise");
    }

    @Test(priority = 2)
    public void allProductsView() {
        //Section: opens products page & verify it loaded correctly
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Automation Exercise - All Products");
        //additional verification for all products
        WebElement productContainer = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div"));
        Assert.assertTrue(productContainer.isDisplayed());
    }

    @Test(priority = 3)
    public void searchProduct() {
        //Section: Searches product & verifies related items loaded correctly
        driver.findElement(By.id("search_product")).sendKeys("shirts");
        driver.findElement(By.id("submit_search")).click();
        WebElement polo = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[12]/div/div[1]/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(polo).perform();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://automationexercise.com/products?search=shirts");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
