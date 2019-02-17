
/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/
import org.openqa.selenium.chrome.ChromeDriver

driver = {
    System.out.println("Load driver")
    System.setProperty( "webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe" );

    //Create a new ChromeDriver
    new ChromeDriver();
}

baseUrl = "http://gebish.org"