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

"Step 2: Click on link pliers12 -> Navigate to page 'product/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pliers12'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2: Click on link pliers12 - Navigate to page product.png')

"Step 3: Click on button addToCart"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3: Click on button addToCart.png')

"Step 4: Click on div productAddedToShopping"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_productAddedToShopping'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4: Click on div productAddedToShopping.png')

"Step 5: Click on link navCart -> Navigate to page 'checkout'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5: Click on link navCart - Navigate to page checkout.png')

"Step 6: Click on body object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6: Click on body object.png')

"Step 7: Click on button proceed1"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7: Click on button proceed1.png')

"Step 8: Login into Application"

TrueTestScripts.login()

"Step 9: Provide address details for shipping"

provideShippingAddressDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button proceedToCheckout"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10: Click on button proceedToCheckout.png')

"Step 11: Click on dropdown paymentMethod"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/dropdown_paymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11: Click on dropdown paymentMethod.png')

"Step 12: Click on button confirm"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12: Click on button confirm.png')

"Step 13: Click on button confirm"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 13: Click on button confirm.png')

"Step 14: Click on link home -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 14: Click on link home - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Verify Checkout Process with Single Product and Payment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
