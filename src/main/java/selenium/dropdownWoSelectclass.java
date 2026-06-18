package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.*;

public class dropdownWoSelectclass
{
    public static void main(String args[])
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[text()='Select Language']")).click();
        List<WebElement> element=driver.findElements(By.xpath("//label[text()='Select Language']/following::li"));
        List<String> list=new ArrayList<>();
        List<String> sortList=new ArrayList<>();
        for(int i=1;i<=element.size();i++)
        {
            String text = driver.findElement(By.xpath("(//label[text()='Select Language']/following::li)["+i+"]")).getText();
            System.out.println(text);
            list.add(text);
        }
        sortList.addAll(list);
        Collections.sort(sortList);
       System.out.println(sortList);
       if(list.equals(sortList))
           System.out.println("sorted");
       else
           System.out.println("notsorted");


    }
}
