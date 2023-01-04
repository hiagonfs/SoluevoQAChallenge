package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilWebDriver;

public class MainPageElements {

	@FindBy(how = How.NAME, using = "customFields.nome_do_requisitante")
	public WebElement applicantName;
	@FindBy(how = How.NAME, using = "customFields.email")
	public WebElement applicantEmail;
	@FindBy(how = How.NAME, using = "customFields.criticidade")
	public WebElement criticality;
	@FindBy(how = How.NAME, using = "customFields.descreva_o_motivo_pelo_qual_bug_considerado_top_priority")
	public WebElement describeBugReason;
	@FindBy(how = How.NAME, using = "customFields.qual_o_bug")
	public WebElement whatsTheBug;
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/form/div[1]/div/button")
	public WebElement buttonSubmit;
	@FindBy(how = How.CLASS_NAME, using = "pp-new-public-form-success-message")
	public WebElement finalMessage;

	public MainPageElements() {
		PageFactory.initElements(UtilWebDriver.getDriver(), this);
	}

}
