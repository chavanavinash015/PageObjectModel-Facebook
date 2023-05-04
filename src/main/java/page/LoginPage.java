package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BaseClass.driver;

public class LoginPage {

    //Declaration
    @FindBy(id = "email")
    private WebElement username;
    @FindBy(name = "pass")
    private WebElement password;
    @FindBy(name = "login")
    private WebElement loginBtn;

    // initialization
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String uname, String pwd) {
        username.sendKeys(uname);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }

    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }
}
