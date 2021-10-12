package DemoPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class WebTable {
public static void main(String[] args){
//system property
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
//Web driver
        WebDriver driver = new ChromeDriver();
//Launch the WebApplication
        driver.get("https://letcode.in/table");
//Store web Table in web element

        WebElement table = driver.findElement(By.id("simpletable"));

//Store Table Header from table  in list of web elements(Not required )
        List<WebElement> headers = table.findElements(By.tagName("th"));

//Store the Table rows in list of web element
        List<WebElement>  rows = table.findElements(By.cssSelector("tbody tr"));

//Loop the Rows based row size(length) and store the table data in a list of web element
        for(int i=0; i< rows.size(); i++)
        {
            List<WebElement>  tabledata = rows.get(i).findElements(By.tagName("td"));
            WebElement lastname = tabledata.get(1);
            String name = lastname.getText();
            if(name.equals("Iron"))
            {
            // Click the checkbox based on the last name
               // col.get(3).findElement(By.tagName("input")).click();
            }

        }

               driver.quit();

    }
}
