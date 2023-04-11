package PageObject;

import org.openqa.selenium.By;

public class Login {
    public static String URL = "https://stellarburgers.nomoreparties.site/";

    private final By registrationButton = By.xpath(".//p/a[text()='Зарегистрироваться']");
    private final By inputName = By.xpath("//label[text()='Имя']/following-sibling::input");
    private final By inputEmail = By.xpath("//label[text()='Email']/following-sibling::input");
    private final By inputPassword = By.xpath("//label[text()='Пароль']/following-sibling::input");
    private final By registrationButtonInForm = By.xpath(".//button[text()='Зарегистрироваться']");

    private final By signInButton = By.xpath("//button[text()='Войти']");
    private final By getSignInAccountButton = By.xpath("//button[text()='Войти в аккаунт']");

    private final By privateOffice = By.xpath("//p[text()='Личный Кабинет']");

    private final By passwordRecoveryButton = By.xpath("//p[text()='Восстановить пароль']");
    private final By recoveryButton = By.xpath("//p[text()='Восстановить']");

    private final By inputCodeFromLetter = By.xpath("//label[text()='Введите код из письма']/following-sibling::input");

    private final By exitButton = By.xpath("//button[text()='Выход']");

}
