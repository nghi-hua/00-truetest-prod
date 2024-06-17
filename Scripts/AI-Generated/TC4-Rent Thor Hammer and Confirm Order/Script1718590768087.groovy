import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.common.enterAddressDetailsForOrder
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link thorHammer1114 -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_thorHammer1114'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2: Click on link thorHammer1114 - Navigate to page product.png')

"Step 3: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3: Click on button addToCart.png')

"Step 4: Click on link categories"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4: Click on link categories.png')

"Step 5: Click on link navRentals -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navRentals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5: Click on link navRentals - Navigate to page .png')

"Step 6: Click on image crane -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_crane'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6: Click on image crane - Navigate to page product.png')

"Step 7: Click on span ngxSlider3"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_ngxSlider3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7: Click on span ngxSlider3.png')

"Step 8: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8: Click on button addToCart.png')

"Step 9: Click on link navCart -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9: Click on link navCart - Navigate to page .png')

"Step 10: Click on button proceed1"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10: Click on button proceed1.png')

"Step 11: Login into Application"

TrueTestScripts.login()

"Step 12: Enter address details for the order"

enterAddressDetailsForOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button proceedToCheckout"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13: Click on button proceedToCheckout.png')

"Step 14: Click on dropdown paymentMethod"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_paymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14: Click on dropdown paymentMethod.png')

"Step 15: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15: Click on button confirm.png')

"Step 16: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16: Click on button confirm.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Rent Thor Hammer and Confirm Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
