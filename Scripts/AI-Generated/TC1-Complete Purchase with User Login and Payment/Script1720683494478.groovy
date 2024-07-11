import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link product01J2G9F6Ehvmvgwwpgp7Kzy5N9 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_product01J2G9F6Ehvmvgwwpgp7Kzy5N9'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Click on link product01J2G9F6Ehvmvgwwpgp7Kzy5N9 - Navigate to page product.png')

"Step 3: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3: Click on button addToCart.png')

"Step 4: Click on link navCart -> Navigate to page '/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on link navCart - Navigate to page checkout.png')

"Step 5: Click on button proceed1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button proceed1.png')

"Step 6: Login into Application"

TrueTestScripts.login()

"Step 7: Click on button proceed2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceed2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on button proceed2.png')

"Step 8: Click on input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_state'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on input state.png')

"Step 9: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_state'), var_1_input_state)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9: Enter input value in input state.png')

"Step 10: Click on input postcode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_postcode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10: Click on input postcode.png')

"Step 11: Enter input value in input postcode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_postcode'), var_2_input_postcode)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11: Enter input value in input postcode.png')

"Step 12: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12: Click on button proceedToCheckout.png')

"Step 13: Click on dropdown paymentMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/dropdown_paymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13: Click on dropdown paymentMethod.png')

"Step 14: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14: Click on button confirm.png')

"Step 15: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15: Click on button confirm.png')

"Step 16: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16: Click on link home - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase with User Login and Payment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}