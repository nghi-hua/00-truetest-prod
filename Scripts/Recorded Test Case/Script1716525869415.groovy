import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://practicesoftwaretesting.com/#/')

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop - v5.0/img_MightyCraft Hardware_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Combination Pliers - Practice Software_bd6de6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Combination Pliers - Practice Software_bd6de6/i_Sign in_fa fa-shopping-cart px-1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/button_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/input_Email address_email'), 
    'a@g.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/input_Password_password'), 
    'QWHXj8QFtdodsq0KOSTALQ==')

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/input_Password_btnSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/button_Proceed to checkout_1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/div_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/button_Proceed to checkout_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/select_Choose your payment methodBank Trans_920188'), 
    'cash-on-delivery', true)

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Practice Software Testing -_889ccc/button_Confirm'))

