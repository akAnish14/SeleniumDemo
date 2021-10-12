package DemoPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
public class DragandDrop {
    public static void main(String[] args){
//system property
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
//Web driver
        WebDriver driver = new ChromeDriver();
//Launch the WebApplication
        driver.get("https://letcode.in/dropable");
        driver.manage().window().maximize();
    WebElement  src = driver.findElement(By.xpath("//*[@id='draggable']"));
    WebElement  des = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(src,des).perform();




    }
}
