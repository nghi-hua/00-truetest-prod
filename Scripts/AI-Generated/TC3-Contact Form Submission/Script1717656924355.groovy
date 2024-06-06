import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/"

TrueTestScripts.navigate('/')

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link 'Contact' -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navContact'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3: Click on link Contact - Navigate to page .png')

"Step 4: Click on input field 'first name'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on input field first name.png')

"Step 5: Enter input value in input field 'first name'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_firstName'), input_first_name)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Enter input value in input field first name.png')

"Step 6: Click on input field 'last name'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_lastName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6: Click on input field last name.png')

"Step 7: Enter input value in input field 'last name'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_lastName'), input_last_name)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7: Enter input value in input field last name.png')

"Step 8: Click on input field 'email'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8: Click on input field email.png')

"Step 9: Enter input value in input field 'email'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9: Enter input value in input field email.png')

"Step 10: Click on select 'subject'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_subject'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10: Click on select subject.png')

"Step 11: Click on textarea 'message'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_message'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11: Click on textarea message.png')

"Step 12: Enter input value in textarea 'message'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/textarea_message'), textarea_message)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12: Enter input value in textarea message.png')

"Step 13: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_contactSubmit'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13: Click on input field.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Contact Form Submission_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
