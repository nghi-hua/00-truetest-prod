import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.navigatePowerToolsCategoryAndAddToCart

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Login into Application"

TrueTestScripts.login()

"Step 2: Navigate to /"

TrueTestScripts.navigate("/")

"Step 3: Click on link pageItem4 -> Navigate to page '#/product/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem4'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3: Click on link pageItem4 - Navigate to page product.png')

"Step 4: Click on button addToCart"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4: Click on button addToCart.png')

"Step 5: Navigate through power tools category and add product to cart"

navigatePowerToolsCategoryAndAddToCart.execute()

"Step 6: Click on link table1 -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_table1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6: Click on link table1 - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Adding and Removing Products in Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
