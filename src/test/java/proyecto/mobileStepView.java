package proyecto;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import javax.print.DocFlavor;
import java.util.List;

@Component
public class mobileStepView {
    private AppiumDriver<MobileElement> driver;

    public mobileStepView(AppiumDriver driver){
        this.driver = driver;
    }

    public void Login(){
        this.driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView[1]")).click();
    }
    public void SingUp2() throws InterruptedException {
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.tap(PointOption.point(682, 595))
//                .perform();
//        this.driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Sign up')]")).click();
//
        List<MobileElement> element = driver.findElements(By.className("android.widget.TextView"));
        for (int i = 0; i < element.size(); i++) {

            if (element.get(i).getText().equals("Sign up")) {
                element.get(i).click();
            }
        }
        Thread.sleep(5);
    }

    public void SingUp() throws InterruptedException {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(682, 595))
                .perform();
//        this.driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Sign up')]")).click();
//
//        List<MobileElement> element = driver.findElements(By.className("android.widget.TextView"));
//        for (int i=0;i<element.size();i++){
//
//          if  (element.get(i).getText().equals("Sign up")){
//              element.get(i).click();
//            }
//        }
//        Thread.sleep(5);

        //this.driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();

    }
    public void email(){
        this.driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]")).sendKeys("test@gmail.com");
    }
    public void pass(){
        this.driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]")).sendKeys("123123123");
    }
    public void pass2(){
        this.driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]")).sendKeys("123123123");
    }
    public  void registrar() throws InterruptedException {
        this.driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]")).click();
        Thread.sleep(5000);
    }
    public void ok() throws InterruptedException {
        this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
        Thread.sleep(5000);
    }
    public void login() throws InterruptedException {
        this.driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]")).click();
        Thread.sleep(5000);
    }
    public void form(){
        this.driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Forms\"]/android.widget.TextView[1]")).click();
    }
    public void TitleLogin() throws InterruptedException {
        this.driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"button-login-container\"]")).click();
        Thread.sleep(5000);
    }
    public void text() throws InterruptedException {
       // this.driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Type something')]")).sendKeys("brandon");
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(291, 779))
                .perform();
        List<MobileElement> element = driver.findElements(By.className("android.widget.EditText"));
        for (int i = 0; i < element.size(); i++) {

            if (element.get(i).getText().equals("Type something")) {
                element.get(i).sendKeys("brandon");
            }
        }
        Thread.sleep(5000);
    }

    public String result() throws InterruptedException {
       return  this.driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"input-text-result\"]")).getText();
    }
    public void Prender(){
        this.driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"switch\"]")).click();
    }
    public void lista (){
        this.driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
    }
    public void option(){
        this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")).click();
    }
    public void active() throws InterruptedException {
        this.driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView")).click();
        Thread.sleep(5000);
    }
    public void ok2(){
        this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]")).click();
    }
}
