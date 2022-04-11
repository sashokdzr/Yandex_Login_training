package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage {
    @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[contains(@id, 'passp:sign-in')]")
    private WebElement loginBtn;
    @FindBy(xpath = "//*[contains(@id, 'passp-field-passwd')]")
    private WebElement passwdField;
    @FindBy(xpath = "//*[contains(@class, 'Button2 Button2_type_link Button2_size_l Button2_view_pseudo Button2_width_max')]")
    private WebElement skipBtn;
    //Метод ввода логина:
    public void inputLogin(String login) {
        loginField.sendKeys(login); }
    //Метод ввода пароля:
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
    //Метод нажатия кнопки входа:
    public void clickLoginBtn() {
        loginBtn.click(); }
    public void clickSkipBtn() {
        skipBtn.click(); }
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


}

