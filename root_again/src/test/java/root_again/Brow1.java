package root_again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Brow1 {
	WebDriver driver=null;
	  /*  @Test(groups={"rain"})
	    public void befo(){
	    	  driver=new FirefoxDriver();
	    	  driver.get("http://myntra.com");
	    	 System.out.println("befo--"+driver.getTitle());
	    	 driver.close();
	    }

	       @Test(groups={"ames"})
			public void r(){
			driver=new FirefoxDriver();
			driver.get("http://wikipedia.com");
			System.out.println(driver.getTitle());
		}*/
	       @Test(groups={"pv"})
	       public void stuckIn(){
	    	   System.out.println("your p just stuck in my vagina just because of inconveneance entry");
	       } 
	       @Parameters({"tra"})
	       @Test
	       public void getMe(String hey){
	    	   System.out.println("hey ! This is me "+hey);
	       }
	       @Test(groups={"traffic"})
	       public void stuckInTra(){
	    	   
	    	   System.out.println("He got stuck in traffic to come late  to be here");
	       }
	       @Test(groups={"bra"})
	       public void stuckInBra(){
	    	   System.out.println("u just look like u have come stuck in bra ");
	       }
	}


