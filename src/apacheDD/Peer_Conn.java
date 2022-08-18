package apacheDD;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Peer_Conn {
	public static WebDriver driver;
		
		
		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
			
			
			
		}
		@Test(priority=1,dataProvider="LoginData",dataProviderClass = DataSupplier.class)
		
		public void VerifyloginTest(String user,String pwd) throws InterruptedException {
			//URL
			driver.get("https://ph-uat.peerconnexions.com/");
					
			WebElement Login =driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[9]/a"));
	        Login.click();
	    	//credential for login
			WebElement username=driver.findElement(By.name("email"));
			WebElement password=driver.findElement(By.name("password"));
			username.sendKeys(user);
			password.sendKeys(pwd);
			
			//Sign in
					WebElement m =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div/div/div/div[2]/div/form/div[3]/button"));
			        JavascriptExecutor j =(JavascriptExecutor) driver;
			        j.executeScript("arguments[0].click();",m);
			        Thread.sleep(5000);
			//seller zone
			        WebElement sellerZone =driver.findElement(By.xpath("//*[@id=\'site-header\']/div[2]/div/div/div[2]/div/nav/div/ul/li[5]/a/span"));
			        sellerZone.click();
			        WebElement Dashboard =driver.findElement(By.xpath("//*[@id=\'site-header\']/div[2]/div/div/div[2]/div/nav/div/ul/li[5]/div/button[3]/a/span"));
			        Dashboard.click();
			       
		}
			        
		@Test(priority=2)
		public void SiteActivity() {
			 //Site Activity Summary
            driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[1]/div/ul/li[1]/a/span")).click();   
			
		}        
			
		@Test(priority=3,dataProvider="DatePicker",dataProviderClass = DataSupplier.class)
		public void DatePick(String sdate,String edate) throws InterruptedException  {
			
					//Date
			        
			        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div/span/span/input[2]")).click();
			        WebElement startdate =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-left > div.ant-calendar-input-wrap > div > input"));
			        startdate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			        startdate.sendKeys(Keys.BACK_SPACE);
			        startdate.sendKeys(sdate);
			        
			        WebElement enddate =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-right > div.ant-calendar-input-wrap > div > input"));
			        enddate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			        enddate.sendKeys(Keys.BACK_SPACE);
			        enddate.sendKeys(edate); 
			        enddate.sendKeys(Keys.ENTER);
			     
		          }
		
		@Test(priority=4)
		public void LoginNoOfOrg() {
			 //Number of org login
            driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a/span/u/p")).click();   
			
		}
		
		@Test(priority=5,dataProvider="DatePicker",dataProviderClass = DataSupplier.class)
		public void DatePic(String stdate,String endate) throws InterruptedException  {
			 
	        //click date
			        
			        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[1]/div/span/span/input[2]")).click();
			       
			        WebElement startdate =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-left > div.ant-calendar-input-wrap > div > input"));
			        startdate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			        startdate.sendKeys(Keys.BACK_SPACE);
			        startdate.sendKeys(stdate);
			        
			        WebElement enddate =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-right > div.ant-calendar-input-wrap > div > input"));
			        enddate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			        enddate.sendKeys(Keys.BACK_SPACE);
			        enddate.sendKeys(endate); 
			        enddate.sendKeys(Keys.ENTER);
			       
		          }
		
		@Test(priority=6,dataProvider="SearchOrgName",dataProviderClass = DataSupplier.class)
		public void Search(String Svalue) throws InterruptedException  {
			//search
			
	        WebElement searchlog =driver.findElement(By.cssSelector("#root > div.site > div > div.block.full-card > div > div > div.col-12.col-lg-10.mt-4.mt-lg-0 > div > div.reseller-table-div.registration-summary-inn.sales-dashboard > div.ant-table-wrapper > div > div > div > div > div > table > thead > tr > th:nth-child(1) > span > div > span.ant-table-column-title > div > span > input"));
	        searchlog.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	        searchlog.sendKeys(Keys.BACK_SPACE);
	        searchlog.sendKeys(Svalue);
	        searchlog.sendKeys(Keys.ENTER);
	       
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[1]/span/div/span[1]/div/span/span/i")).click();
	        Thread.sleep(2000);  
		}
		
		@Test(priority=7)
		public void SearchOrgName() throws InterruptedException {
		 //sorting
        
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[2]/span/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[2]/span/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[2]/span/div")).click();
        Thread.sleep(1000);
        //download excel
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/a")).click();
        //page navigation
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/ul/li[6]/a")).click();
        Thread.sleep(3000);
     
		}
		

		@Test(priority=8,dataProvider="Goto",dataProviderClass = DataSupplier.class)
		public void GotoPage(String Goto) throws InterruptedException  {
		//goto
        WebElement go =driver.findElement(By.cssSelector("#root > div.site > div > div.block.full-card > div > div > div.col-12.col-lg-10.mt-4.mt-lg-0 > div > div.reseller-table-div.registration-summary-inn.sales-dashboard > div.ant-table-wrapper > div > div > ul > li.ant-pagination-options > div.ant-pagination-options-quick-jumper > input[type=text]"));
        go.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        go.sendKeys(Keys.BACK_SPACE);
        go.sendKeys(Goto);
        go.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
		}
		
		
		@Test(priority=9)
		public void ProductViews() throws InterruptedException {
			((JavascriptExecutor)driver).executeScript("scroll(400, 0)");
	        Thread.sleep(2000);
			//go to site activity
	        WebElement siteactivity =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[1]/div/ul/li[1]/a"));
	        siteactivity.click();
	        Thread.sleep(2000);
	        //Product views
	        WebElement ProductViews =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div[3]/div/a"));
	        ProductViews.click();
	        Thread.sleep(1000);
	        
	      //download excel
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[7]/a/span")).click();
	        Thread.sleep(2000);
	        
	        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
	        //No of views sorting
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[1]/th[4]/span/div/span[1]/span")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[1]/th[4]/span/div/span[2]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[1]/th[4]/span/div/span[2]")).click();
	    	        
	        //sales sorting
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[1]/span/div/span[1]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[1]/span/div/span[2]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[1]/span/div")).click();
	        Thread.sleep(3000);
	          
	        //Eye symbol
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div/i")).click();
	        Thread.sleep(2000);
	        //download excel
	        driver.findElement(By.xpath("//*[@id='document-body']/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/button")).click();
	        Thread.sleep(2000);
	        
	        //org sorting
	        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/table/thead/tr/th[2]/span/div/span[1]/span")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/table/thead/tr/th[2]/span/div/span[2]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/table/thead/tr/th[2]/span/div/span[2]")).click();
	        Thread.sleep(2000);
	      //cancel
	        driver.findElement(By.xpath("//*[@id=\"document-body\"]/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]")).click();
	        Thread.sleep(2000);
		}
        
		@Test(priority=10,dataProvider="Eye",dataProviderClass = DataSupplier.class)
		public void EyeSymbol(String NoOfViews) throws InterruptedException  {
			//Eye symbol
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div/i")).click();
	        Thread.sleep(2000);
			 //search org
	        WebElement searchorg =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div.ant-modal-body > div.ant-table-wrapper > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(1) > span > div > span.ant-table-column-title > input"));
	        searchorg.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	        searchorg.sendKeys(Keys.BACK_SPACE);
	        searchorg.sendKeys(NoOfViews);
	        searchorg.sendKeys( Keys.ENTER);
	        Thread.sleep(2000);
	        //ok
	        driver.findElement(By.xpath("//*[@id=\"document-body\"]/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]")).click();
	        Thread.sleep(1000);
	        
		}
		
		@Test(priority=11)
		public void Scroll() throws InterruptedException {
			((JavascriptExecutor)driver).executeScript("scroll(800, 0)");
	        Thread.sleep(1000);
		}
		
		@Test(priority=12,dataProvider="DatePicker",dataProviderClass = DataSupplier.class)
		public void DateClick(String pisdate,String piedate) throws InterruptedException  {
			 
	        //click date
			        
			        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/span/span/input[1]")).click();
			       
			        WebElement startdate =driver.findElement(By.cssSelector("#document-body > div:nth-child(13) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-left > div.ant-calendar-input-wrap > div > input"));
			        startdate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			        startdate.sendKeys(Keys.BACK_SPACE);
			        startdate.sendKeys(pisdate);
			        
			        WebElement enddate =driver.findElement(By.cssSelector("#document-body > div:nth-child(13) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-right > div.ant-calendar-input-wrap > div > input"));
			        enddate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			        enddate.sendKeys(Keys.BACK_SPACE);
			        enddate.sendKeys(piedate); 
			        enddate.sendKeys(Keys.ENTER);
			       
		          }
		
		
		
		@Test(priority=13)
		public void brand() throws InterruptedException {
			
			//Brand Bootstrap dropdown
			 driver.findElement(By.xpath("//*[@id=\'brand\']/div/div[1]/div[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[text()='Baseus']")).click(); 
		   //VCAT1
		        driver.findElement(By.xpath("//*[@id=\'vcat1\']/div/div[1]/div[1]")).click();   //select VCAT1
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[text()='Ear Phone']")).click();    //selected
		        
		        //VCAT2
		        driver.findElement(By.xpath("//*[@id=\'vcat2\']/div/div[1]/div[1]")).click();   //select VCAT2
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[text()='Wireless Ear Phone']")).click();    //selected
		        
		        //VCAT3
		        driver.findElement(By.xpath("//*[@id=\'vcat3\']/div/div[1]/div[1]")).click();   //select VCAT3
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[text()='Bluetooth']")).click();    //selected
		        Thread.sleep(4000);
		        
		     
		     
		     
		}
		
		@Test(priority=14)
		public void Channel() throws InterruptedException {
			WebElement channel =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[1]/div/ul/li[2]/a/span"));
			channel.click();
			driver.findElement(By.xpath("//*[@id=\'zones\']/div/div[1]/div[1]/span")).click();   //select zone
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='Metro Manila']")).click();    //selected
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//div[text()='Active']")).click();    //selected
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='In Active']")).click();    //selected
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\'active_options\']/div/div[2]/div[1]")).click();   //cancel selected option
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[3]/a/i")).click();    //selected
	        Thread.sleep(2000);
	        ((JavascriptExecutor)driver).executeScript("scroll(0, 800)");
	        Thread.sleep(2000);
	        ((JavascriptExecutor)driver).executeScript("scroll(800, 0)");
	        
	       //Channel spread over


		}
		
		@AfterClass
		public void teadDown() throws InterruptedException {
			 Thread.sleep(5000);
		        
			driver.quit();
		}

	}






