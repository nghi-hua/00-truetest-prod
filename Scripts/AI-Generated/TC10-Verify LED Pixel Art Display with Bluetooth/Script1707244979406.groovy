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

'Step 2: At Page Divoom-Pixoo-Max-Programmable-Decoration-Advertisement dp, click on hyperlink foeers led pixel art display with blueto > navigate to Page dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Divoom-Pixoo-Max-Programmable-Decoration-Advertisement_dp/hyperlink_foeers_led_pixel_art_display_with_blueto'))

'Step 3: At Page dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_object'))

'Step 4: At Page dp, click on button object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_object'))

'Step 5: Add visual checkpoint at Page dp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify LED Pixel Art Display with Bluetooth_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
