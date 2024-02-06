import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page  dp, click on span producttitle'

WebUI.enhancedClick(findTestObject('AI-Generated/Page__dp/span_producttitle'))

'Step 3: At Page  dp, click on input submit add to cart > navigate to Page cart smart-wagon'

WebUI.enhancedClick(findTestObject('AI-Generated/Page__dp/input_submit_add_to_cart'))

'Step 4: At Page cart smart-wagon, click on hyperlink go to cart > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_smart-wagon/hyperlink_go_to_cart'))

'Step 5: Add visual checkpoint at Page cart'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Navigation to page Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
