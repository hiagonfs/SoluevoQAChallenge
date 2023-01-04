package pages;

import utils.UtilWebDriver;

public class BasePage {

	private static final String MAIN_PAGE_URL = "https://app.pipefy.com/public/form/_Lid-wF_";

	public BasePage() {
		
	}

	public void getMainPage() {
		UtilWebDriver.getDriver().get(MAIN_PAGE_URL);
	}

}
