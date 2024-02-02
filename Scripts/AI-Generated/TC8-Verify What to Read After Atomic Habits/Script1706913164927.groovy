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

'Step 2: At Page home, click on hyperlink bike panniers rack trunks bike pannier > navigate to Page hz mobile mission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_bike_panniers_rack_trunks_bike_pannier'))

'Step 3: At Page hz mobile mission, click on hyperlink books > navigate to Page books-used-books-textbooks b'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_hz_mobile_mission/hyperlink_books'))

'Step 4: At Page books-used-books-textbooks b, click on hyperlink object > navigate to Page amazonbookreview'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_books-used-books-textbooks_b/hyperlink_object'))

'Step 5: At Page amazonbookreview, click on hyperlink what to read after atomic habits > navigate to Page amazonbookreview read'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_amazonbookreview/hyperlink_what_to_read_after_atomic_habits'))

'Step 6: Add visual checkpoint at Page amazonbookreview read'

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify What to Read After Atomic Habits_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
