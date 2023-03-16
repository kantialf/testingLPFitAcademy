import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lanPageTest {
    public static WebDriver driver;

    @BeforeClass
    public static void  setUpClass(){
        System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://dev.fitacademy.id/");
    }

    @Test
    public void testPerusahaanBtn(){
        WebElement perusahaanBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/a"));
        perusahaanBtn.click();

        WebElement formEmail = driver.findElement(By.id("email"));
        formEmail.sendKeys("kantialf@outlook.co.id");

        WebElement sendBtn = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/form/div/button"));
        sendBtn.click();

    }

    @Test
    public void testCCBtn(){
        WebElement contentCBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/a"));
        contentCBtn.click();

        WebElement formEmail = driver.findElement(By.id("email"));
        formEmail.sendKeys("kantialf@gmail.com");

        WebElement sendBtn = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/form/div/button"));
        sendBtn.click();


    }

    @Test
    public void testNtznBtn(){

        WebElement ntznBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div[2]/a"));
        ntznBtn.click();

        WebElement formEmail = driver.findElement(By.id("email"));
        formEmail.sendKeys("kantialf@mail.ugm.ac.id");

        WebElement sendBtn = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/form/div/button"));
        sendBtn.click();

//        WebElement cancelBtn = driver.findElement(By.xpath("//*[@id=\"alert-1\"]/div/button/svg"));
//        cancelBtn.click();
    }

    @Test
    public void testTiktokBtn(){
        WebElement tiktokBtn = driver.findElement(By.xpath("/html/body/footer/div/div[1]/a[1]/div"));
        tiktokBtn.click();
    }

    @Test
    public void testIgBtn(){
        WebElement igBtn = driver.findElement(By.xpath("/html/body/footer/div/div[1]/a[2]/div/h3"));
        igBtn.click();
    }

    @Test
    public void testLogoBtn(){
        WebElement ntznBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div[2]/a"));
        ntznBtn.click();

        WebElement logoBtn = driver.findElement(By.xpath("/html/body/div/header/a/img"));
        logoBtn.click();
    }
}
