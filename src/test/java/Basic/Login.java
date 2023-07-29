package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:\\selenium\\Halalfull-testing\\HalalfullAutomation\\src\\test\\java\\com\\Default_Details\\Details");
		Properties prop=new Properties();
		prop.load(file);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
//		sent detail to login
		driver.findElement(By.xpath("(//a[@class='d-flex'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
		driver.findElement(By.id(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
		driver.findElement(By.xpath(prop.getProperty("btn"))).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
