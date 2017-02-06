package webDriver_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Factory_1 {

	@Factory
	public Object[] getInstances(){
		Object[] result=new Object[12];
		for(int i=0;i<12;i++){
			result[i]= new WebTest(i*10);
		}
		return result;
	}
}class WebTest{
	
	public int number_of_times;
	public WebTest(int number_){
		number_of_times=number_;
	}
	@Test
	public void testServer(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
	}
}
