package Mentoring_Selenium.Mentoring_P1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class TestNG_P1 {

  @Test (priority = 3)
  public void f() {
  System.out.println("General Search");
	   
  }
  
  @Test (priority = 1)
  public void AdvancedSeacrch()

  {
  System.out.println("Advanced Search");
  }

  @Test (priority = 2)
  public void SearchToys()

  {
  System.out.println("Search Toys");
  }
  	
  @BeforeClass
  public void beforeClass() {
	  
  System.out.println("Log in to the System");	  
  }

  @AfterClass
  public void afterClass() {
	  
  System.out.println("Log out from the System");
	  	  
  }
  
}
