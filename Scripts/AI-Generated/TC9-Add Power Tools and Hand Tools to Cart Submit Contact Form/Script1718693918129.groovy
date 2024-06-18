import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.enterPersonalDetailsAndSubmitContactForm
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Click on link pageItem5"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem5'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2: Click on link pageItem5.png')

"Step 3: Click on link pageItem4"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem4'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3: Click on link pageItem4.png')

"Step 4: Click on link pageItem4"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_pageItem4'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4: Click on link pageItem4.png')

"Step 5: Click on link product01J0Hx282Vqm44Paz8Xswzgja2 -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_product01J0Hx282Vqm44Paz8Xswzgja2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5: Click on link product01J0Hx282Vqm44Paz8Xswzgja2 - Navigate to page product.png')

"Step 6: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6: Click on button addToCart.png')

"Step 7: Click on link categories"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7: Click on link categories.png')

"Step 8: Click on link categoryPowerTools -> Navigate to page '#/category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categoryPowerTools'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8: Click on link categoryPowerTools - Navigate to page category.png')

"Step 9: Click on link categories"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9: Click on link categories.png')

"Step 10: Click on link handTools"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_handTools'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10: Click on link handTools.png')

"Step 11: Click on link woodSaw1218 -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_woodSaw1218'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11: Click on link woodSaw1218 - Navigate to page product.png')

"Step 12: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12: Click on button addToCart.png')

"Step 13: Click on link navContact"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navContact'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13: Click on link navContact.png')

"Step 14: Enter personal details and submit a contact form"

enterPersonalDetailsAndSubmitContactForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Add Power Tools and Hand Tools to Cart Submit Contact Form_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
