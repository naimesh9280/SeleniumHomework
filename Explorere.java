package HomeworkWeek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Explorere {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver","C:\\Users\\naime\\IdeaProjects\\Software\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("naimesh9280@yahoo.co.in");
        driver.findElement(By.className("password")).sendKeys("nai123456");
        driver.findElement(By.className("login-button")).click();
        driver.close();


    }
}
