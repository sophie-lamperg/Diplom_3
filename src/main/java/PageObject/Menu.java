package PageObject;

import org.openqa.selenium.By;

public class Menu {
    private final By bunButton = By.xpath("//span[text()='Булки']/parent::div");
    private final By textBun = By.xpath("//h2[text()='Булки']");

   private final By sauceButton = By.xpath("//span[text()='Соусы']/parent::div");
   private final By textSauce = By.xpath("//h2[text()='Соусы']");

   private final By fillingButton = By.xpath("//span[text()='Начинки']/parent::div");
    private final By textFilling = By.xpath("//h2[text()='Начинки']");
}
