import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {


	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","G:\\JAVA\\selenium-java-2.46.0\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.cure.fit/cult");


	}

}
