package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class zoomcar {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.zoomcar.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='z-close']/parent::div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='City']/following-sibling::span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='bangalore']/parent::div")).click();
        driver.findElement(By.xpath("//div[contains(text(),'SEARCH')]")).click();
    }
}