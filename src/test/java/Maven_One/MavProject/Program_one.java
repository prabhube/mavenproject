package Maven_One.MavProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program_one {
	
	 public  WebDriver driver;

	public  void webBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\New folder\\MavProject\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		Thread.sleep(2000);
	}

	public  void geturl() {
		driver.get("https://adactinhotelapp.com/");
	}

	public  void login() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("prabhube");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Kasthuriraja1!");
}
	public  void submmitlogin() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
}
	public void booking() {
	Actions c=new Actions(driver);
	WebElement location = driver.findElement(By.name("location"));
	Select s=new Select(location);
	s.selectByValue("London");
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select s1=new Select(hotel);
	s1.selectByValue("Hotel Sunshine");
	WebElement room = driver.findElement(By.name("room_type"));
	Select s2=new Select(room);
	s2.selectByValue("Double");
	WebElement noofroom = driver.findElement(By.name("room_nos"));
	Select s3= new Select(noofroom);
	s3.selectByValue("2");
	WebElement date = driver.findElement(By.id("datepick_in"));
	date.clear();
	date.sendKeys("23/09/2024");
	WebElement dateout = driver.findElement(By.name("datepick_out"));
	dateout.clear();
	dateout.sendKeys("24/09/2024");
	WebElement adults = driver.findElement(By.name("adult_room"));
	Select s4=new Select(adults);
	s4.selectByValue("2");
	WebElement child = driver.findElement(By.name("child_room"));
	Select s5= new Select(child);
	s5.selectByValue("2");
	WebElement submit = driver.findElement(By.id("Submit"));
	submit.click();
	}


	public void selectHotel() {
		WebElement clk = driver.findElement(By.id("radiobutton_0"));
		clk.click();
		WebElement cnt = driver.findElement(By.id("continue"));
		cnt.click();
}
@Test
	public void bookHotel() throws InterruptedException {
		WebElement nam = driver.findElement(By.id("first_name"));
		nam.sendKeys("prabhu");
		WebElement lstnam = driver.findElement(By.id("last_name"));
		lstnam.sendKeys("Ram");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("4,seravana street, purasaiwakkam,chennai");
		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("9876543423111234");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6=new Select(cardtype);
		s6.selectByValue("VISA");
		WebElement mont = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(mont);
		s7.selectByValue("7");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(year);
		s8.selectByValue("2020");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("567");
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(5000);
}
	public void finalout() throws InterruptedException {
	WebElement my_itinerary = driver.findElement(By.name("my_itinerary"));
	my_itinerary.click();
	Thread.sleep(5000);
}

	public void logout() {
	WebElement logout = driver.findElement(By.id("logout"));
	logout.click();
}
}
