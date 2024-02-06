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

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink nav orders > navigate to Page gp css order-history'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_nav_orders'))

'Step 3: At Page gp css order-history, click on hyperlink nav cart > navigate to Page gp cart view html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_css_order-history/hyperlink_nav_cart'))

'Step 4: At Page gp cart view html, click on hyperlink nav item signout > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_cart_view_html/hyperlink_nav_item_signout'))

'Step 5: At Page home, click on hyperlink best sellers > navigate to Page gp bestsellers'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_best_sellers'))

'Step 6: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 7: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 8: At Page gp bestsellers, click on hyperlink a autoid 6'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_6'))

'Step 9: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 10: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 11: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 12: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 13: At Page gp bestsellers, click on hyperlink a autoid 7'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_7'))

'Step 14: At Page gp bestsellers, click on hyperlink a autoid 11'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_11'))

'Step 15: At Page gp bestsellers, click on hyperlink a autoid 11'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_a_autoid_11'))

'Step 16: At Page gp bestsellers, click on hyperlink unique finds > navigate to Page Best-Sellers-Unique-Finds zgbs boost'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_bestsellers/hyperlink_unique_finds'))

'Step 17: At Page Best-Sellers-Unique-Finds zgbs boost, click on hyperlink electronics > navigate to Page Best-Sellers-Unique-Finds-Unique-Electronics zgbs boost'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Best-Sellers-Unique-Finds_zgbs_boost/hyperlink_electronics'))

'Step 18: At Page Best-Sellers-Unique-Finds-Unique-Electronics zgbs boost, click on hyperlink 2'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Best-Sellers-Unique-Finds-Unique-Electronics_zgbs_boost/hyperlink_2'))

'Step 19: At Page Best-Sellers-Unique-Finds-Unique-Electronics zgbs boost, click on hyperlink gift ideas in unique electronics > navigate to Page gp most-gifted boost ref=zg bs tab t boost mg'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Best-Sellers-Unique-Finds-Unique-Electronics_zgbs_boost/hyperlink_gift_ideas_in_unique_electronics'))

'Step 20: At Page gp most-gifted boost ref=zg bs tab t boost mg, click on input field keywords'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_most-gifted_boost_ref=zg_bs_tab_t_boost_mg/input_field_keywords'))

'Step 21: At Page gp most-gifted boost ref=zg bs tab t boost mg, input on input field keywords'

WebUI.setText(findTestObject('AI-Generated/Page_gp_most-gifted_boost_ref=zg_bs_tab_t_boost_mg/input_field_keywords'), input_field_keywords)

'Step 22: At Page gp most-gifted boost ref=zg bs tab t boost mg, click on input nav search submit button > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_most-gifted_boost_ref=zg_bs_tab_t_boost_mg/input_nav_search_submit_button'))

'Step 23: At Page s, click on hyperlink 2'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_2_1'))

'Step 24: At Page s, click on hyperlink object > navigate to Page HEYSONG-Waterproof-Bluetooth-Floating-Lightweight dp ref=sx'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_4'))

'Step 25: Add visual checkpoint at Page HEYSONG-Waterproof-Bluetooth-Floating-Lightweight dp ref=sx'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Checkout Process for Heysong Waterproof Bluetooth Floating Lightweight_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
