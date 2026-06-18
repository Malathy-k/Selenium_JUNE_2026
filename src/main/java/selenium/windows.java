package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windows
{
    public static void main(String args[])
    {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']/parent:: a")).click();
        driver.findElement(By.xpath("//li[@id='menuform:m_window']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        String windowhandle=driver.getWindowHandle();
        System.out.println(windowhandle);
        Set<String> windows=driver.getWindowHandles();
        List<String> allWindow=new ArrayList<>(windows);
        System.out.println(allWindow.size());
        //driver.switchTo().window(allWindow.get(1));
        String windowhandle1=driver.getWindowHandle();
        System.out.println(windowhandle1);
        driver.close();
    }
}
