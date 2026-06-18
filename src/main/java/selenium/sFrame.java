package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sFrame
{
    public static void main(String args[])
    {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']/parent:: a")).click();
        driver.findElement(By.xpath("//li[@id='menuform:m_frame']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
        driver.findElement(By.xpath("//button[@id='Click' and text()='Click Me']")).click();
        String text = driver.findElement(By.xpath("//button[@id='Click' and text()='Hurray! You Clicked Me.']")).getText();
        System.out.println(text);
        //driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//i[@class='pi pi-home layout-menuitem-icon']")).click();
    }
}
