package HomeworkWeek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.edge.driver","C:\\Users\\naime\\IdeaProjects\\Software\\msedgedriver.exe");
    // set key and path
        WebDriver driver = new EdgeDriver(); // Create an instance
        driver.get("https://demo.nopcommerce.com/"); // mavigate to website
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("naimesh9280@yahoo.co.in");
        driver.findElement(By.name("Password")).sendKeys("nai123456");
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(3000);
        driver.close();



    }

}
