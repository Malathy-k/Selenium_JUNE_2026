package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action
{
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        /*driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Draggable']")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//iframe[1]"));
        driver.switchTo().frame(element);
        WebElement drag = driver.findElement(By.id("draggable"));
        Actions build=new Actions(driver);
        build.dragAndDropBy(drag,100,50).perform();*/

        /*driver.findElement(By.xpath("//a[text()='Droppable']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement Dest = driver.findElement(By.id("droppable"));
        Actions build=new Actions(driver);
        build.dragAndDrop(source,Dest).perform();*/

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.xpath("//h2[text()='Revamp your home in style']"));
        Actions build=new Actions(driver);
        build.contextClick(element1).perform();
    }
}
