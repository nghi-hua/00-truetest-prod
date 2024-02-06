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

'Step 2: At Page home, click on hyperlink sign in > navigate to Page ap signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_sign_in'))

'Step 3: At Page ap signin, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_ap_signin/input_email'), input_email)

'Step 4: At Page ap signin, click on input continue'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ap_signin/input_continue'))

'Step 5: At Page ap signin, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_ap_signin/input_password'), input_password)

'Step 6: At Page ap signin, click on input signinsubmit > navigate to Page ax claim webauthn nudge'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ap_signin/input_signinsubmit'))

'Step 7: At Page ax claim webauthn nudge, click on input object > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ax_claim_webauthn_nudge/input_object'))

'Step 8: At Page home, click on hyperlink nav cart > navigate to Page gp cart view html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_nav_cart'))

'Step 9: At Page gp cart view html, click on input field keywords > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_cart_view_html/input_field_keywords'))

'Step 10: Add visual checkpoint at Page s'

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Verify Sign In and Cart Contents_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
