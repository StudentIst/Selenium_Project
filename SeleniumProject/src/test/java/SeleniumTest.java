import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {

    @Test
    public void startWebdriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.google.com");


    }
}
