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

'Step 2: At Page dp ref=vp d cpf-substitute-widget pd, click on hyperlink a autoid 18'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp_ref=vp_d_cpf-substitute-widget_pd/hyperlink_a_autoid_18'))

'Step 3: At Page dp ref=vp d cpf-substitute-widget pd, click on hyperlink a autoid 18'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp_ref=vp_d_cpf-substitute-widget_pd/hyperlink_a_autoid_18'))

'Step 4: At Page dp ref=vp d cpf-substitute-widget pd, click on hyperlink a autoid 18'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp_ref=vp_d_cpf-substitute-widget_pd/hyperlink_a_autoid_18'))

'Step 5: At Page dp ref=vp d cpf-substitute-widget pd, click on input field keywords > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp_ref=vp_d_cpf-substitute-widget_pd/input_field_keywords'))

'Step 6: Add visual checkpoint at Page s'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Navigation to page S_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
