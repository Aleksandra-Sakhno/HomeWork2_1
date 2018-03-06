
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main( String[] args) throws InterruptedException{
        WebDriver driver=initDriver(); 
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        findKeys(driver, "email", "webinar.test@gmail.com");
        findKeys(driver, "passwd", "Xcg7299bnSmMuRLp9ITw");
        WebElement button=driver.findElement(By.name("submitLogin"));
        button.click();
        Thread.sleep(2000);
        findClick(driver, "employee_infos");
        Thread.sleep(1000);
        findClick(driver, "header_logout");
        Thread.sleep(1000);
        driver.quit();}
    
    public static WebDriver initDriver() {
        String drPath=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", drPath);
        return new ChromeDriver();
        }  
    
    static void findKeys (WebDriver dr, String name,String keys)
        {dr.findElement(By.name(name)).sendKeys(keys); }
    
    static void findClick (WebDriver dr, String id)
        {dr.findElement(By.id(id)).click(); }
} 