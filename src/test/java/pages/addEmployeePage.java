package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class addEmployeePage extends CommonMethods {
    @FindBy(id = "firstName")
    public static WebElement firstName;

    @FindBy(id = "middleName")
    public static WebElement middleName;

    @FindBy(id = "lastName")
    public static WebElement lastName;

    @FindBy(id = "btnSave")
    public static WebElement saveButton;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="chkLogin")
    public WebElement checkBox;

    @FindBy(id="user_name")
    public WebElement usernameEmployee;

    @FindBy(id="user_password")
    public WebElement passwordEmployee;

    @FindBy(id="re_password")
    public WebElement confirmPasswordEmployee;

    @FindBy(id = "employeeId")
    public WebElement empIdLoc;


    public addEmployeePage(){
        PageFactory.initElements(driver,this);
    }



}
