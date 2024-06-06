import katalon.common.enterAddressDetailsDuringCheckout
import katalon.common.selectProductIncreaseQuantityAddToCartProceedToCheckout
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link '3'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Click on link 3.png')

"Step 3: Select product, increase quantity, add to cart, and proceed to checkout"

selectProductIncreaseQuantityAddToCartProceedToCheckout.execute()

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Enter address details during checkout process"

enterAddressDetailsDuringCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on button 'Proceed to checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on button Proceed to checkout.png')

"Step 7: Click on select 'payment-method'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_paymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on select payment-method.png')

"Step 8: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Click on button Confirm.png')

"Step 9: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9: Click on button Confirm.png')

"Step 10: Click on div 'navbarSupportedContent'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_navbarSupportedContent'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10: Click on div navbarSupportedContent.png')

"Step 11: Click on link 'Home'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11: Click on link Home.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Purchase with Multiple Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
