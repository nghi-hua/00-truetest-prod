import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page Hershys-Nuggets-Dark-Chocolate-Candy dp, click on input submit add to cart > navigate to Page cart smart-wagon'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Hershys-Nuggets-Dark-Chocolate-Candy_dp/input_submit_add_to_cart'))

'Step 3: Add visual checkpoint at Page cart smart-wagon'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Successful Navigation to page Cart Smart Wagon_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
