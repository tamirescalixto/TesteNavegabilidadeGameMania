package game.mania.teste;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {
	
private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OI417408\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade() {
		
		driver.get("https://tamirescalixto.github.io/GameMania/");
		
		driver.findElement(By.className("search-txt")).sendKeys("Computador");
		
		driver.findElement(By.id("btn-lupa")).click();
	}
	
}
