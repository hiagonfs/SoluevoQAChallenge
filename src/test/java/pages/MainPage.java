package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import elements.MainPageElements;

public class MainPage {

	private Faker faker;
	private MainPageElements mainElements;
	private BasePage basePage;

	public MainPage() {
		basePage = new BasePage();
		faker = new Faker();
		mainElements = new MainPageElements();
	}

	public BasePage getBasePage() {
		return basePage;
	}

	public void selectTextCriticality(String level) {
		Select select = new Select(mainElements.criticality);
		select.selectByValue(level);
	}

	public void fillName() {
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		mainElements.applicantName.sendKeys(firstName + " " + lastName);
	}

	public void fillEmail() {
		String email = faker.internet().emailAddress();
		mainElements.applicantEmail.sendKeys(email);
	}

	public void fillRandomText(WebElement element) {
		String text = faker.shakespeare().romeoAndJulietQuote();
		element.sendKeys(text);
	}

	public void clickSubmit() {
		mainElements.buttonSubmit.click();
	}

	public String getTextFinalMessage() {
		return mainElements.finalMessage.getText();
	}

	public MainPageElements getMainPageElements() {
		return this.mainElements;
	}

}
