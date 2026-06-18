package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class sAlert
{
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']/parent:: a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Alert']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        alert.dismiss();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        alert.accept();
        String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
        alert.sendKeys("Malu");
        alert.accept();
        String text1 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
        System.out.println(text1);
    }
}
