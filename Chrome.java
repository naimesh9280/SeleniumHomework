package HomeworkWeek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\naime\\IdeaProjects\\Software\\chromedriver.exe");
        // set key and path
        WebDriver driver = new ChromeDriver(); // Create an Instance

        driver.get("https://demo.nopcommerce.com/"); // Navigate to website
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("naimesh9280@yahoo.co.in");
        driver.findElement(By.className("password")).sendKeys("nai123456");
        driver.findElement(By.className("login-button")).click();
        driver.close();




    }
}
