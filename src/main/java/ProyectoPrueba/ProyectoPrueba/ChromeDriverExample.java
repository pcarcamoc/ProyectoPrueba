package ProyectoPrueba.ProyectoPrueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class ChromeDriverExample {

    public static void main(String[] args) throws Exception {
        String path = Paths.get(System.getProperty("user.dir"), "./Driver/chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.cl/");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }

}
