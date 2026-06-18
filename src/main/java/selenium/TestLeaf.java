package selenium;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();
        List<WebElement> element = driver.findElements(By.xpath("(//div[@class='card'])[3]//div[@class='ui-chkbox ui-widget']"));
        for (int i = 1; i <= element.size(); i++)
        {
            driver.findElement(By.xpath("((//div[@class='card'])[3]//div[@class='ui-chkbox ui-widget'])["+i+"]")).click();
            String text=driver.findElement(By.xpath("((//div[@class='card'])[3]//label)["+i+"]")).getText();
                    System.out.println(text);
        }
    }
}
