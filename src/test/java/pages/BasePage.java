package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    static {
        /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\casa\\Documents\\testPlexus\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();*/

        //esta sería la configuracion con boni garcia para chrome
       /* WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();*/

        //esta sería la configuracion con boni garcia para firefox
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
    }


    public BasePage(WebDriver driver) {
        BasePage.driver = driver;

    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }


    public void clickElement(String locator){
            Find(locator).click();
        }

    public static void closeBrowser() {
        driver.quit();
    }

public String obtenerTitulo (){

   return     driver.getTitle();



}
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }
    public void subirArchivo(String locator, String filePath){

        Find(locator).sendKeys(filePath);
    }
}