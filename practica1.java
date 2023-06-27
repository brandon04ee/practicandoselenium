package galeria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.interactions.Actions;

public class practica1 {
	
	private RemoteWebDriver driver;
	@Before
	public void configura() {
		System.setProperty("webdriver.crhome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test() throws InterruptedException {
		WebElement txtBuscador=driver.findElement(By.name("q"));
		txtBuscador.sendKeys("demoblaze");
		
		Thread.sleep(1500);
		WebElement btnBuscar=driver.findElement(By.name("btnK"));
		btnBuscar.click();
		
		Thread.sleep(1500);
		WebElement pagina = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3"));
	    pagina.click();
		
	    Thread.sleep(1500);
	    WebElement producto = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]"));
	    producto.click();
	    
	    Thread.sleep(1500);
	    WebElement btnAnadir = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
	    btnAnadir.click();
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(1500);
	    WebElement btncarrito = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
	    btncarrito.click();
	    
	    Thread.sleep(1500);
	    WebElement btncompra = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
	    btncompra.click();
	    
	    Thread.sleep(1000);
	    
	        driver.quit();
	       
	    
	    }}
	

