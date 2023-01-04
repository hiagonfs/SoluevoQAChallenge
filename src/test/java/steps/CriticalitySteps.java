package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import utils.ImageUtil;
import utils.UtilWebDriver;

public class CriticalitySteps {

	private MainPage mainPage = new MainPage();

	@Given("I access the tool")
	public void i_access_the_tool() {
		mainPage.getBasePage().getMainPage();
	}

	@When("I fill in the requesters name")
	public void i_fill_in_the_requesters_name() {
		mainPage.fillName();
	}

	@When("I fill in the email")
	public void i_fill_in_the_email() {
		mainPage.fillEmail();
	}

	@When("I select the {string} criticality")
	public void i_select_the_criticality(String string) {
		mainPage.selectTextCriticality(string);
	}

	@When("I describe the reason for the bug")
	public void i_describe_the_reason_for_the_bug() {
		WebElement element = mainPage.getMainPageElements().describeBugReason;
		UtilWebDriver.waitByElement(element);
		mainPage.fillRandomText(element);
	}

	@When("I fill in what is the bug")
	public void i_fill_in_what_is_the_bug() {
		WebElement element = mainPage.getMainPageElements().whatsTheBug;
		UtilWebDriver.waitByElement(element);
		mainPage.fillRandomText(element);
	}

	@When("I click submit")
	public void i_click_submit() {
		mainPage.clickSubmit();
	}

	@Then("It must be successfully submitted")
	public void it_must_be_successfully_submitted() {
		String message = "Você brilhou! Obrigado pela participação do nosso processo de seleção de QA.";
		UtilWebDriver.waitByElement(mainPage.getMainPageElements().finalMessage);
		ImageUtil.createAndCaptureImage("Submit_success");
		assertEquals(message, mainPage.getTextFinalMessage());
		UtilWebDriver.quit();
	}

	@When("leave the reason field blank")
	public void leave_the_reason_field_blank() {
		;
	}

	@Then("must not be submitted")
	public void must_not_be_submitted() {
		String message = "Você brilhou! Obrigado pela participação do nosso processo de seleção de QA.";
		UtilWebDriver.waitByElement(mainPage.getMainPageElements().finalMessage);
		assertNotEquals(message, mainPage.getTextFinalMessage());
		ImageUtil.createAndCaptureImage("Submit_non_success");
		UtilWebDriver.quit();
	}

}
