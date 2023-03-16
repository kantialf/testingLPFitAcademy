import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ruangguruTest {
    public static WebDriver driver;

    @BeforeClass
    public static void  setUpClass(){
        System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @Test
    public void testFormTelp(){
        driver.get("https://katalon.com/sign-up/");

        WebElement fullName = driver.findElement(By.id("signup_fullname"));
        fullName.sendKeys("Kanti Alifa");

        WebElement email = driver.findElement(By.id("signup_email"));
        email.sendKeys("kantialf@gmail.com");

        WebElement password = driver.findElement(By.id("signup_password"));
        password.sendKeys("kantia18");



//        WebElement formTelp = driver.findElement(By.id("phone"));
//        formTelp.sendKeys("89636028296" + Keys.ENTER);

    }
}
