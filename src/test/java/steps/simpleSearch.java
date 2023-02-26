package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class simpleSearch extends TestBase{
	
	
	
	
	
	@Given("I am on the Google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();
	}

	@When("I entered the {string}")
	public void i_entered_the(String Product_name) {
		
		//WebElement searchBar = driver.findElement(By.className("gLFyf"));
		
	  //searchBar.sendKeys(Product_name);
	  
	  googleHomePage gp = new googleHomePage(driver);
	  gp.enteringProductName(Product_name);
	  
	  
	}

	@When("i Click on a search button")
	public void i_click_on_a_search_button() {
		//WebElement searchButton = driver.findElement(By.className("gNO89b"));
		//searchButton.submit();
		googleHomePage gp = new googleHomePage(driver);
		gp.clickingOnSearchButton();
		
	    
	}

	@Then("I see the realted search result successfully")
	public void i_see_the_realted_search_result_successfully() {
		//WebElement searchResult = driver.findElement(By.id("result-stats"));
		//System.out.println("============================================");
		//String resultText = searchResult.getText();
		//System.out.println(resultText);
		//System.out.println("==============================================");
		
		//boolean displayResult = searchResult.isDisplayed();
		
		googleHomePage gp = new googleHomePage(driver);
		
		Assert.assertTrue(gp.isSearchResultVisible(), "Search Result is not displayd");
		closeCurrent();
		
		closeAll();
		
	   
	}

	
	}


