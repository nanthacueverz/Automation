package SetupCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("PageTittle:"+driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}
