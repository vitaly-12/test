import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args)

    {
        System.setProperty("webdriver.gecko.driver","D:\\Тестирование\\Автоматизация\\IntelliJ IDEA Community Edition 2020.1.2\\testselenium\\drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://osm.gov.ru/portal/description/ocm?1");

        driver.findElement(By.xpath("//a[@id='id8']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Получить услугу')]")).click();
        driver.findElement(By.xpath("//input[@id='id20']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='id21']")).sendKeys("1234");


   // driver.quit();

    }


}
