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

"Step 3: Click on link '3'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3: Click on link 3.png')

"Step 4: Click on link 'Safety Goggles$24.26' -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_safetyGoggles2426'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4: Click on link Safety Goggles2426 - Navigate to page product.png')

"Step 5: Click on button 'btn-increase-quantity'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_increaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5: Click on button btn-increase-quantity.png')

"Step 6: Click on button 'btn-add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6: Click on button btn-add-to-cart.png')

"Step 7: Click on link 'Home' -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7: Click on link Home - Navigate to page .png')

"Step 8: Click on input field 'search-query'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_searchQuery'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8: Click on input field search-query.png')

"Step 9: Enter input value in input field 'search-query'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_searchQuery'), input_search_query)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9: Enter input value in input field search-query.png')

"Step 10: Click on button 'Search'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_searchSubmit'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10: Click on button Search.png')

"Step 11: Click on link 'Combination Pliers$14.15' -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_combinationPliers1415'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11: Click on link Combination Pliers1415 - Navigate to page product.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Search and Purchase Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
