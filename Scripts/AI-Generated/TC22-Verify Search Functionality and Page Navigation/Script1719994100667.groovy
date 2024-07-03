import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Login into Application"

TrueTestScripts.login()

"Step 2: Navigate to /"

TrueTestScripts.navigate("/")

"Step 3: Click on checkbox categoryId"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/checkbox_categoryId'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3: Click on checkbox categoryId.png')

"Step 4: Click on input categoryId01J0Hx282Jwg9Y0693X8Kp8S2C"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_categoryId01J0Hx282Jwg9Y0693X8Kp8S2C'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4: Click on input categoryId01J0Hx282Jwg9Y0693X8Kp8S2C.png')

"Step 5: Click on checkbox categoryId"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/checkbox_categoryId'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5: Click on checkbox categoryId.png')

"Step 6: Click on input categoryId01J0Hx282F755Q4Vw9Ty57Za9S"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_categoryId01J0Hx282F755Q4Vw9Ty57Za9S'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6: Click on input categoryId01J0Hx282F755Q4Vw9Ty57Za9S.png')

"Step 7: Click on link pageItem2"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7: Click on link pageItem2.png')

"Step 8: Click on input searchQuery"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_searchQuery'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8: Click on input searchQuery.png')

"Step 9: Enter input value in input searchQuery"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_searchQuery'), input_search_query)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9: Enter input value in input searchQuery.png')

"Step 10: Click on button searchSubmit"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_searchSubmit'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10: Click on button searchSubmit.png')

"Step 11: Click on link page1 -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_page1'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11: Click on link page1 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Verify Search Functionality and Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
