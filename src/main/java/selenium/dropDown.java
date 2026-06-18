package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Element']/parent::a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Dropdown']/parent::a")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.className("ui-selectonemenu"));
        Select select=new Select(element);
        select.selectByVisibleText("Playwright");


    }
}
