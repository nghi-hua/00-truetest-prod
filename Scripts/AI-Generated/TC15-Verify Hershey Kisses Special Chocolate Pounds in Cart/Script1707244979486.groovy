import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page Hershey-Kisses-Special-Chocolate-Pounds dp, click on button a autoid 11 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Hershey-Kisses-Special-Chocolate-Pounds_dp/button_a_autoid_11_announce'))

'Step 3: At Page Hershey-Kisses-Special-Chocolate-Pounds dp, click on input submit add to cart > navigate to Page cart smart-wagon'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Hershey-Kisses-Special-Chocolate-Pounds_dp/input_submit_add_to_cart'))

'Step 4: Add visual checkpoint at Page cart smart-wagon'

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Verify Hershey Kisses Special Chocolate Pounds in Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
