package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args)
    {
//system property
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
//Web driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();



        Select  fruit =  new Select(driver.findElement(By.id("fruits")));
        fruit.selectByVisibleText("Apple");


        Select hero = new Select(driver.findElement(By.id("superheros")));
        hero.selectByIndex(0);
        hero.selectByIndex(2);
        hero.selectByValue("ca");

        Select MyDrop = new Select(driver.findElement(By.id("lang")));
        List<WebElement> myOptions =   MyDrop.getOptions();

        int size = myOptions.size()-1;

//        for (WebElement i:myOptions) {
//            String Name = i.getText();
//        System.out.println(Name);
//
//        if(Name.equals("Java"))
//        {
//            System.out.println("PAss");
//            i.click();
//
//        }
//        }

        for (int i = 0; i < size; i++) {

            myOptions.lastIndexOf(size)

        }





    }
}
