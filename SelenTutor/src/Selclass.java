import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selclass {

	public static void main(String[] args) {
		//  Start
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		System.out.println("_______________________*****_______________________");


		
		//WHATEVER YOU WANNA
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String blah = driver.getTitle();
		String j =driver.getCurrentUrl();System.out.println(blah);
		System.out.println("URL: "+j);
		
		System.out.println("_______________________::!!TopHits!!::_______________________");
		driver.findElement(By.xpath("/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/paper-item")).click();;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(int i = 1 ; i <11 ;i++ ) {
			
		String hits = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[2]/ytd-shelf-renderer/div[1]/div[2]/ytd-expanded-shelf-contents-renderer/div/ytd-video-renderer["+i+"]/div[1]/div/div[1]/div/h3\n")).getText();
		
		System.out.println("#"+i+" Trend!:"+ hits);
		
		//driver.quit();

		};
	
		
		
		
		
		
	}
}

		
