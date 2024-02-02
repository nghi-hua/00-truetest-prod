import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page gp css order-history ref=oh surl digital'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/gp/css/order-history/ref=oh_surl_digital')

'Step 2: At Page gp css order-history ref=oh surl digital, click on hyperlink digital orders > navigate to Page gp your-account order-history'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_css_order-history_ref=oh_surl_digital/hyperlink_digital_orders'))

'Step 3: At Page gp your-account order-history, click on hyperlink return for refund 2 > navigate to Page digital returns'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_your-account_order-history/hyperlink_return_for_refund_2'))

'Step 4: At Page digital returns, click on span object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_digital_returns/span_object'))

'Step 5: At Page digital returns, click on hyperlink returnreasondropdown 9'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_digital_returns/hyperlink_returnreasondropdown_9'))

'Step 6: At Page digital returns, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_digital_returns/input_object'))

'Step 7: At Page digital returns, click on hyperlink go to cart > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_digital_returns/hyperlink_go_to_cart'))

'Step 8: At Page cart, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/i_object'))

'Step 9: At Page cart, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_object'))

'Step 10: At Page cart, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/i_object_1'))

'Step 11: At Page cart, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_object_1'))

'Step 12: At Page cart, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/i_object_2'))

'Step 13: At Page cart, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_object_2'))

'Step 14: At Page cart, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/i_object_3'))

'Step 15: At Page cart, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_object_3'))

'Step 16: At Page cart, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_object'))

'Step 17: At Page cart, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/i_object_4'))

'Step 18: At Page cart, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_object_4'))

'Step 19: At Page cart, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/i_object_5'))

'Step 20: At Page cart, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_object_5'))

'Step 21: At Page cart, click on input field keywords'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_field_keywords'))

'Step 22: At Page cart, input on input field keywords'

WebUI.setText(findTestObject('AI-Generated/Page_cart/input_field_keywords'), input_field_keywords)

'Step 23: At Page cart, click on div object > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_object_1'))

'Step 24: At Page s, click on hyperlink object > navigate to Page b'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_1'))

'Step 25: At Page b, click on hyperlink object > navigate to Page dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_b/hyperlink_object'))

'Step 26: At Page dp, click on button a autoid 13 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_a_autoid_13_announce'))

'Step 27: At Page dp, click on button a autoid 17 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_a_autoid_17_announce'))

'Step 28: Add visual checkpoint at Page dp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Digital Orders and Return for Refund_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
