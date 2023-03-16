import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class helloTest {
    public static WebDriver driver;

    @BeforeClass
    public static void  setUpClass(){
        System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @Test
    public void testDriver(){

//        // tes untuk google
//        driver.get("https://www.google.com/");
//        String title = driver.getTitle();
//        System.out.println(title);
//        //driver.quit();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement element1 = driver.findElement(By.linkText("Shifting Content"));
        element1.click();

        WebElement element2 = driver.findElement(By.linkText("Example 2: An image"));
        element2.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/shifting_content/image");
        driver.quit();
    }
}
