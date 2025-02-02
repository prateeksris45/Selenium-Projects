package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Day3Amazon {
    public static void main(String[] args) 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        List<WebElement> productTitles = driver.findElements(By.cssSelector("span.a-size-medium"));

        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ": " + productTitles.get(i).getText());
        }

        driver.quit();
    }
}

