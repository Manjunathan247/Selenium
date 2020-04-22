package com.practice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement e = driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions=new Actions(driver);
		actions.contextClick(e).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
		//new Window
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(1000);
		//minimize
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
	}

}
