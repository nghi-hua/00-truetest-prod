import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.proceedToCheckoutAndInputAddressDetails
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.proceedToCheckoutAndSelectPaymentMethod
import internal.GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/#"

TrueTestScripts.navigate('/')

"Step 2: Click on link 'Pliers\$12.01' -> Navigate to page '/#/product/01HY2J5RF4GW7DKRA83Y2WSHTC'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pliers01'))

WebUI.takeScreenshot()

"Step 3: Click on link '1' -> Navigate to page '#/checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/01HY2J5RF4GW7DKRA83Y2WSHTC?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))

WebUI.takeScreenshot()

"Step 4: Click on button 'Proceed to checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))

WebUI.takeScreenshot()

"Step 5: Login into Application"

TrueTestScripts.login()

WebUI.takeScreenshot()

"Step 6: Proceed to checkout and input address details"

proceedToCheckoutAndInputAddressDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Proceed to checkout and select payment method"

proceedToCheckoutAndSelectPaymentMethod.execute(data_path_1, Integer.valueOf(index_1))

"Step 8: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot()

"Step 9: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot()

"Step 10: Click on link 'Home'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot()

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
