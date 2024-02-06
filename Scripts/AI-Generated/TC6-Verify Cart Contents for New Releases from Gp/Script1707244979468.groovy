import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page b'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/b')

'Step 2: At Page b, click on hyperlink new releases > navigate to Page gp new-releases books'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_b/hyperlink_new_releases'))

'Step 3: At Page gp new-releases books, click on hyperlink object > navigate to Page gp product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_new-releases_books/hyperlink_object'))

'Step 4: At Page gp product, click on hyperlink next page'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_product/hyperlink_next_page'))

'Step 5: At Page gp product, click on hyperlink object > navigate to Page Pcs-Flipo-Flip-Kinetic-Satisfying dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_product/hyperlink_object_1'))

'Step 6: At Page Pcs-Flipo-Flip-Kinetic-Satisfying dp, click on input submit add to cart > navigate to Page cart smart-wagon'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Pcs-Flipo-Flip-Kinetic-Satisfying_dp/input_submit_add_to_cart'))

'Step 7: At Page cart smart-wagon, click on hyperlink go to cart > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_smart-wagon/hyperlink_go_to_cart'))

'Step 8: Add visual checkpoint at Page cart'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Cart Contents for New Releases from Gp_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
