import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition 
{

	  FirefoxDriver dr = new FirefoxDriver();
@Given("^go to facebook$")
public void go_to_facebook()
{
  
    dr.get("https://www.facebook.com/");
    
}

@When("^put userid$")
public void put_userid() 
{
    dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("Rimi");
    
}

@When("^put password$")
public void put_password() 
{
  dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
    
}

@Then("^i should be logged in$")
public void i_should_be_logged_in() 
{
   dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
    
}


}
