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

'Step 2: At Page home, click on hyperlink bike panniers rack trunks bike pannier > navigate to Page hz mobile mission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_computer_tablets_computer_tablets'))

'Step 3: At Page hz mobile mission, click on hyperlink books > navigate to Page books-used-books-textbooks b'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_hz_mobile_mission/hyperlink_books'))

'Step 4: At Page books-used-books-textbooks b, click on hyperlink object > navigate to Page amazonbookreview'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_books-used-books-textbooks_b/hyperlink_object'))

'Step 5: At Page amazonbookreview, click on hyperlink 2'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_amazonbookreview/hyperlink_2'))

'Step 6: At Page amazonbookreview, click on hyperlink interviews > navigate to Page amazonbookreview interviews html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_amazonbookreview/hyperlink_interviews'))

'Step 7: At Page amazonbookreview interviews html, click on hyperlink kindle ebooks > navigate to Page kindle-dbs storefront'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_amazonbookreview_interviews_html/hyperlink_kindle_ebooks'))

'Step 8: Add visual checkpoint at Page kindle-dbs storefront'

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Kindle Ebooks Storefront_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
