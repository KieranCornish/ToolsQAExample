package com.spartaglobal.ToolsQAExample;

import com.spartaglobal.ToolsQAExample.ToolsQASite.Pages.ToolsQAHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kieran Cornish\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.navigate().to("https://www.bbc.co.uk/");
//        chromeDriver.findElementById("idcta-link").click();

        ToolsQAHomePage toolsQAHomePage = new ToolsQAHomePage(chromeDriver);

        toolsQAHomePage.goToToolsQAHomePage();
//        chromeDriver.findElementById("cookie_action_close_header").click();
        toolsQAHomePage.CookieClick();
//        toolsQAHomePage.partialLink();
//        toolsQAHomePage.Link();
//        toolsQAHomePage.Back();
//        toolsQAHomePage.goToToolsQAHomePage();
//        toolsQAHomePage.InputFirstname("Kieran");
//        toolsQAHomePage.InputLastname("Cornish");
//        toolsQAHomePage.SimpleButton();
//        toolsQAHomePage.getSexElements();
        toolsQAHomePage.getYOE();
//        toolsQAHomePage.getContinentElements();

    }
}
