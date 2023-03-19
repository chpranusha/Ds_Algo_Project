package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GetStarted {
public WebDriver driver;
	
	By Get_Start = By.xpath("//button[text()='Get Started']");
	By DropDown = By.xpath("//a[text() = 'Data Structures']");
	By DropDown_Arrays = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By DropDown_Linkedlist = By.xpath("//div[@class='dropdown-menu show']/a[2]");
	By DropDown_Stack = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	By DropDown_Queue = By.xpath("//div[@class='dropdown-menu show']/a[4]");
	By DropDown_Tree = By.xpath("//div[@class='dropdown-menu show']/a[5]");
	By DropDown_Graph = By.xpath("//div[@class='dropdown-menu show']/a[6]");
	By Message = By.xpath("//div[@class = 'alert alert-primary']");
	
	By Getstart_Datastructures = By.xpath("//a[@href = 'data-structures-introduction']");
	By GetStart_Array = By.xpath("//a[@href = 'array']");
	By GetStart_LinkedList = By.xpath("//a[@href = 'linked-list']");
	By GetStart_Stack = By.xpath("//a[@href = 'stack']");
	By GetStart_Queue = By.xpath("//a[@href = 'queue']");
	By GetStart_Tree = By.xpath("//a[@href = 'tree']");
	By GetStart_Graph = By.xpath("//a[@href = 'graph']");
	
	By Sign_In  = By.xpath("//a[@href = '/login']");
	By Register = By.xpath("//a[text()='Register!']");
	
	
	public GetStarted(WebDriver driver) {
		this.driver=driver;
		
		}
	
	public void ClickOnGetStarted() {
		driver.findElement(Get_Start).click();
	}
	
	public void ClickOnDropdown() {
		driver.findElement(DropDown).click();
	}
	public  String AlertMsg() {
		WebElement msg = driver.findElement(Message);
		String message = msg.getText();
		return message;
		
	}
	public String HomepageTitle() {
		
		return driver.getTitle();
		
	}
	
	public void dropdown() {
		
		driver.findElement(DropDown).click();
	}
	public void selectDropdown() {
		WebElement selectDropdown = driver.findElement(DropDown_Stack);
		Actions act = new Actions(driver);
		act.moveToElement(selectDropdown).click().build().perform();
	}
public  void home_getstarted() {
		
		driver.findElement(GetStart_LinkedList).click();
}
public void RegisterLink() {
	driver.findElement(Register).click();
	
}
public void SigninLink() {
	driver.findElement(Sign_In).click();
}
	

}
