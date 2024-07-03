import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.provideShippingAddressDetails

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link slipJointPliers -> Navigate to page '#/product/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_slipJointPliers'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on link slipJointPliers - Navigate to page product.png')

"Step 3: Click on button addToCart"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Click on button addToCart.png')

"Step 4: Click on link navCart -> Navigate to page 'checkout'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link navCart - Navigate to page checkout.png')

"Step 5: Click on button proceed1"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on button proceed1.png')

"Step 6: Login into Application"

TrueTestScripts.login()

"Step 7: Provide address details for shipping"

provideShippingAddressDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button proceedToCheckout"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on button proceedToCheckout.png')

"Step 9: Click on dropdown paymentMethod"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/dropdown_paymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9: Click on dropdown paymentMethod.png')

"Step 10: Click on button confirm"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10: Click on button confirm.png')

"Step 11: Click on button confirm"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11: Click on button confirm.png')

"Step 12: Click on link home -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on link home - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Adding and Removing Products in Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
