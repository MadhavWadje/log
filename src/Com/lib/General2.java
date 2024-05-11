package Com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Com.Utility.Log;


public class General2 extends Global2 {
	public void openapp() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		Reporter.log("app open successfully");
	}
	
	public void closeapp() {
		driver.findElement(By.linkText(logoutbtn)).click();
		driver.close();
		Reporter.log("app close successfully");
		Log.info("open app complete");

	}
	
	public void loginapp() throws Exception {
		driver.findElement(By.name(txtun)).sendKeys(un);
		driver.findElement(By.name(txtpw)).sendKeys(pw);
		driver.findElement(By.name(loginbtn)).click();
        Thread.sleep(1000);
		Reporter.log("login successfully");
		Log.info("login app complete");

	}
	
	public void Add() throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(Abtn)).click();
		driver.findElement(By.name(txtfn)).sendKeys(fn);
		driver.findElement(By.name(txtln)).sendKeys(ln);
		Thread.sleep(1000);
		Reporter.log("Add successfully");
		Log.info("Add complete");
		WebElement Fileinput= driver.findElement(By.xpath("//input[@type='file']"));
		Fileinput.sendKeys("C:\\Users\\dell\\Pictures\\maxi.PNG");
		
		driver.findElement(By.id(svbtn)).click();
	}
		
	public void Edit() {
		driver.findElement(By.name(ebtn)).click();
		driver.findElement(By.name(txtfn)).clear();
		driver.findElement(By.name(txtfn)).sendKeys(fn1);
		driver.findElement(By.name(txtln)).clear();
		driver.findElement(By.name(txtln)).sendKeys(ln1);
		driver.findElement(By.name(svbtn1)).click();
		driver.findElement(By.xpath(bckbtn)).click();
		driver.switchTo().defaultContent();
		Log.info("Edit complete");

	}
	
	public void delete() throws Exception {
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		Thread.sleep(1000);
		driver.findElement(By.name(txtsrchbx1)).sendKeys(srchid);
		Thread.sleep(1000);
			driver.findElement(By.xpath(sbtn)).click();
			driver.findElement(By.name(ckbx)).click();
			driver.findElement(By.xpath(Dbtn)).click();
			Log.info("delete complete");

			driver.switchTo().defaultContent();
	}
	
}

