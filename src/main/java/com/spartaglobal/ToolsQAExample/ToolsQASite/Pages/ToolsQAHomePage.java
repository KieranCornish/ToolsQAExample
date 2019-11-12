package com.spartaglobal.ToolsQAExample.ToolsQASite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class ToolsQAHomePage {
    private WebDriver driver;
    private String homePageURL = "https://www.toolsqa.com/automation-practice-form/";
    private By cookiesAccept = By.id("cookie_action_close_header");
    private By partialTestLink = By.linkText("Partial Link Test");
    private By LinkTest = By.linkText("Link Test");
    private By FirstName = By.name("firstname");
    private By LastName = By.id("lastname");
    private By SimpleButton = By.id("buttonwithclass");
    private By sexElements = By.name("sex");
    private By YOEElements = By.name("exp");
    private By continentElements = By.id("continents");



    public ToolsQAHomePage(WebDriver driver){
        this.driver = driver;
    }
    public void goToToolsQAHomePage(){
        driver.navigate().to(homePageURL);
    }
    public void CookieClick(){
        driver.findElement(cookiesAccept).click();
    }
    public void partialLink() {
        driver.findElement(partialTestLink).click();
    }
    public void Link() {
        driver.findElement(LinkTest).click();
    }
    public void Back(){
        driver.navigate().back();
    }
    public void InputFirstname(String firstname){
        driver.findElement(FirstName).sendKeys(firstname);

    }
    public void InputLastname(String lastname){
        driver.findElement(LastName).sendKeys(lastname);
    }
    public void SimpleButton(){
        driver.findElement(SimpleButton).click();
    }
    public void getSexElements(){
        List<WebElement> sexItems = driver.findElements(sexElements);
        for (WebElement sexItem : sexItems){
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            System.out.println(sexElements);
        }
    }
    public void getYOE(){
        List<WebElement> YOEItems = driver.findElements(YOEElements);
        for (WebElement YOEItem : YOEItems) {
            driver.findElement(By.id(YOEItem.getAttribute("id"))).click();
            System.out.println(YOEElements);
        }
    }
    public void getContinentElements(){
        Select continents = new Select(driver.findElement(continentElements));
        for(int i =0;i<continents.getOptions().size();i++){
            continents.selectByIndex(i);
            System.out.println(continents.getFirstSelectedOption().getText());
        }
    }
}
