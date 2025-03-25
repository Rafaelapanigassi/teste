package projeto.automacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testes {

	WebDriver driver;

	By campoUser = By.xpath("//input[@id='user-name']");
	By campoPassWord = By.xpath("//input[@id='password']");
	By btnLogin = By.xpath("//input[@id='login-button']");
	By btnAdicionar = By
			.xpath("//div[@class='inventory_list']//div[@class='inventory_item'][1]//button[text()='ADD TO CART']");
	By btnRemover = By
			.xpath("//div[@class='inventory_list']//div[@class='inventory_item'][1]//button[text()='Remove']");
	By btnCarrinho = By.xpath("//div[@id='shopping_cart_container']");
	By btnCheckOut = By.xpath("//a[@class='btn_action checkout_button']");
	By campoFirstName = By.xpath("//input[@id='first-name']");
	By campoLastName = By.xpath("//input[@id='last-name']");
	By campoPostalCode = By.xpath("//input[@id='postal-code']");
	By btnContinue = By.xpath("//input[@class='btn_primary cart_button']");
	By btnFinish = By.xpath("//a[@class='btn_action cart_button']");
	By msgSucessoOrdem = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

	@Test
	public void testLoginValido() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(campoUser).sendKeys("standard_user");
		driver.findElement(campoPassWord).sendKeys("secret_sauce");
		driver.findElement(btnLogin).click();
		driver.findElement(btnAdicionar).click();
		driver.findElement(btnCarrinho).click();
		driver.findElement(btnCheckOut).click();
		driver.findElement(campoFirstName).sendKeys("Rafaela");
		driver.findElement(campoLastName).sendKeys("Panigassi");
		driver.findElement(campoPostalCode).sendKeys("15151515");
		driver.findElement(btnContinue).click();
		driver.findElement(btnFinish).click();
		String msgSucesso = driver.findElement(msgSucessoOrdem).getText();
		assertEquals(msgSucesso, "THANK YOU FOR YOUR ORDER");
		driver.quit();
	}

}
