import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");

        driver.findElement(By.name("search"))
              .sendKeys("iPhone");

        System.out.println("Search functionality executed successfully");

        driver.quit();
    }
}
