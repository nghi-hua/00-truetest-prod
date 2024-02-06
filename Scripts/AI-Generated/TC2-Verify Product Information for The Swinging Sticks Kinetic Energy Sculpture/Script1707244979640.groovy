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

'Step 2: At Page gp product, click on hyperlink object > navigate to Page DMaos-Spinner-Stainless-Ceramic-Colorful dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_product/hyperlink_object'))

'Step 3: At Page DMaos-Spinner-Stainless-Ceramic-Colorful dp, click on button object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DMaos-Spinner-Stainless-Ceramic-Colorful_dp/button_object'))

'Step 4: At Page DMaos-Spinner-Stainless-Ceramic-Colorful dp, click on hyperlink the swinging sticks kinetic energy sculp > navigate to Page dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DMaos-Spinner-Stainless-Ceramic-Colorful_dp/hyperlink_the_swinging_sticks_kinetic_energy_sculp'))

'Step 5: At Page dp, click on button object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_object'))

'Step 6: At Page dp, click on button a autoid 32 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_a_autoid_32_announce'))

'Step 7: At Page dp, click on button a autoid 33 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_a_autoid_33_announce'))

'Step 8: At Page dp, click on button a autoid 34 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_a_autoid_34_announce'))

'Step 9: At Page dp, click on button a autoid 35 announce'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_a_autoid_35_announce'))

'Step 10: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_1'))

'Step 11: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_2'))

'Step 12: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_3'))

'Step 13: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_4'))

'Step 14: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_5'))

'Step 15: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_3'))

'Step 16: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object_6'))

'Step 17: At Page dp, click on hyperlink nav logo sprites > navigate to Page ref=nav logo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/hyperlink_nav_logo_sprites'))

'Step 18: Add visual checkpoint at Page ref=nav logo'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Product Information for The Swinging Sticks Kinetic Energy Sculpture_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
