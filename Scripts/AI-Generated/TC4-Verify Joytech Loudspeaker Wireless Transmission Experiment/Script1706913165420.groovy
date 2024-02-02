import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink computer tablets computer tablets > navigate to Page hz mobile mission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_bike_panniers_rack_trunks_bike_pannier'))

'Step 3: At Page hz mobile mission, click on hyperlink object > navigate to Page Sunnytech-Balance-Physics-Balancing-Decompressive dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_hz_mobile_mission/hyperlink_object'))

'Step 4: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/div_object'))

'Step 5: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/div_object_1'))

'Step 6: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on input field keywords > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/input_field_keywords'))

'Step 7: At Page s, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_2'))

'Step 8: At Page s, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_3'))

'Step 9: At Page s, click on hyperlink 2'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_2_1'))

'Step 10: At Page s, click on hyperlink object > navigate to Page Wireless-Transmission-Experiment-Divvlur-Education dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_4'))

'Step 11: At Page Wireless-Transmission-Experiment-Divvlur-Education dp, click on button object > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Wireless-Transmission-Experiment-Divvlur-Education_dp/button_object'))

'Step 12: At Page s, click on hyperlink object > navigate to Page DORAMI-Clear-Radiometer-Energy-Spinning dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_5'))

'Step 13: At Page DORAMI-Clear-Radiometer-Energy-Spinning dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DORAMI-Clear-Radiometer-Energy-Spinning_dp/div_object'))

'Step 14: At Page DORAMI-Clear-Radiometer-Energy-Spinning dp, click on div object > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DORAMI-Clear-Radiometer-Energy-Spinning_dp/div_object_1'))

'Step 15: At Page s, click on hyperlink 3'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_3'))

'Step 16: At Page s, click on hyperlink tesla coil wireless transmission educati > navigate to Page stores page'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_tesla_coil_wireless_transmission_educati'))

'Step 17: At Page stores page, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_stores_page/hyperlink_object'))

'Step 18: At Page stores page, click on hyperlink see all details > navigate to Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_stores_page/hyperlink_see_all_details'))

'Step 19: At Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Loudspeaker-Wireless-Transmission-Experiment_dp/div_object'))

'Step 20: Add visual checkpoint at Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Joytech Loudspeaker Wireless Transmission Experiment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
