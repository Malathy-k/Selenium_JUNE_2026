package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class flikartSelenium
{
    public static void main(String args[])
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/clothing-and-accessories/dresses-and-gowns/dresses/kids-dresses/pr?sid=clo%2Codx%2Cmaj%2Czc1&otracker[]=categorytree&otracker[]=nmenu_sub_Baby%20%26%20Kids_0_Dresses%20%26%20Skirts");
        List<WebElement> superCoin=driver.findElements(By.xpath("//div[@class='QiMO5r']/div[@class='hZ3P6w']"));
        for(int i=1;i<=superCoin.size();i++)
        {
            String str=driver.findElement(By.xpath("(//div[@class='QiMO5r']/div[@class='hZ3P6w'])["+i+"]")).getText();
            System.out.println(str);

        }
    }
}
