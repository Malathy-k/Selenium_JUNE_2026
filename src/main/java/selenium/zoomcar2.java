package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class zoomcar2
{
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zoomcar.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='z-close']/parent::div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='City']/following-sibling::span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='bangalore']/parent::div")).click();
        driver.findElement(By.xpath("//div[contains(text(),'SEARCH')]")).click();
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='car-item-search-container-car-info-left-title']"));
        for(int i=1;i<=elements.size();i++)
        {
            String text = driver.findElement(By.xpath("(//div[@class='car-item-search-container-car-info-left-title'])[ "+i+" ]")).getText();
            System.out.println(text);
            Thread.sleep(1000);

            String text1 = driver.findElement(By.xpath("(//span[@class='car-item-search-container-features-top-title' and contains(text(),'away')])[" + i + "]")).getText();
            System.out.println(text1);


        }


    }
}
