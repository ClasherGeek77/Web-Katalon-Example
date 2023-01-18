package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginScript {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open saucedemo page")
	def I_open_saucedemo() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/i go to saucedemo'), null, FailureHandling.STOP_ON_FAILURE)
	}
	@Given("I have login")
	def I_have_login() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/i go to saucedemo'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I type email and password'), [('email'):'standard_user',('password'):'secret_sauce'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I click login'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I type (.*) and (.*)")
	def I_type_email_pass(String email,String password) {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I type email and password'), [('email'):email,('password'):password], FailureHandling.STOP_ON_FAILURE)
	}


	@When("I click login")
	def I_click_login() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I click login'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click home")
	def I_click_home() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I click menu'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click logout")
	def I_click_logot() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I click logout'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I see product")
	def I_see_product() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I see product'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I see uservalidTitle")
	def I_see_usernameInput() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/i see uservalidTitle'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I see invalidLogin")
	def I_see_invalidLogin() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/I see invalidLogin'), null, FailureHandling.STOP_ON_FAILURE)
	}
}