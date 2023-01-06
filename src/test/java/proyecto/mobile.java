package proyecto;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import java.net.MalformedURLException;
import java.net.URL;
public class mobile {

    private AppiumDriver<MobileElement> driver;
    private Scenario scenario;

    @Before(order = 1)
    public void setScenario(Scenario scenario){//1
        this.scenario = scenario;
    }

    public void screeShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

    @BeforeEach
    public void setUp()  throws MalformedURLException {
        //crear el driver -> AndroidDriver
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "10");
        //capabilities.setCapability("app", "");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    //validacion de logeo
    @Test
    public void RealizarRegistroYLogeoDeUsuario() throws InterruptedException {
        mobileStepView mobileStepView = new mobileStepView(driver);
        mobileStepView.Login();
        Thread.sleep(2);
        mobileStepView.SingUp2();
        mobileStepView.SingUp();
        mobileStepView.email();
        mobileStepView.pass();
        mobileStepView.pass2();
        mobileStepView.registrar();
        mobileStepView.ok();
        mobileStepView.TitleLogin();
        mobileStepView.login();
        mobileStepView.ok();

    }
    //validacion de formulario
    @Test
    public void Formulario() throws InterruptedException {
        mobileStepView mobileStepView = new mobileStepView(driver);
        mobileStepView.form();
        Thread.sleep(2);
        mobileStepView.text();
        String title = mobileStepView.result();
        Assertions.assertEquals("brandon",title);
        mobileStepView.Prender();
        mobileStepView.lista();
        mobileStepView.option();
        mobileStepView.active();
        mobileStepView.ok2();
    }

}
