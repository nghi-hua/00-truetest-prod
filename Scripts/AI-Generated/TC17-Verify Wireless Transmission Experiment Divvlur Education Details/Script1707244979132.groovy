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

'Step 2: At Page home, click on hyperlink computer tablets computer tablets > navigate to Page hz mobile mission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_computer_tablets_computer_tablets'))

'Step 3: At Page hz mobile mission, click on hyperlink object > navigate to Page Sunnytech-Balance-Physics-Balancing-Decompressive dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_hz_mobile_mission/hyperlink_object'))

'Step 4: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/div_object'))

'Step 5: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/div_object_1'))

'Step 6: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on input field keywords > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/input_field_keywords'))

'Step 7: At Page s, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object'))

'Step 8: At Page s, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_1'))

'Step 9: At Page s, click on hyperlink 2'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_2'))

'Step 10: At Page s, click on hyperlink object > navigate to Page Wireless-Transmission-Experiment-Divvlur-Education dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_2'))

'Step 11: At Page Wireless-Transmission-Experiment-Divvlur-Education dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Wireless-Transmission-Experiment-Divvlur-Education_dp/div_object'))

'Step 12: Add visual checkpoint at Page Wireless-Transmission-Experiment-Divvlur-Education dp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Verify Wireless Transmission Experiment Divvlur Education Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
