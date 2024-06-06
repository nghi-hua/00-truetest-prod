import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.enterAddressDetailsDuringCheckout
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

"Step 2: Click on link 'Categories'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCategories'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2: Click on link Categories.png')

"Step 3: Click on link 'Rentals' -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navRentals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3: Click on link Rentals - Navigate to page .png')

"Step 4: Click on image 'Crane' -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_crane'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4: Click on image Crane - Navigate to page product.png')

"Step 5: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_ngxSlider3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5: Click on span.png')

"Step 6: Click on button 'btn-add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6: Click on button btn-add-to-cart.png')

"Step 7: Click on link 'Categories'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCategories'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7: Click on link Categories.png')

"Step 8: Click on link 'Rentals' -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navRentals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8: Click on link Rentals - Navigate to page .png')

"Step 9: Click on app"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/app_root'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9: Click on app.png')

"Step 10: Click on image 'Bulldozer' -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_bulldozer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10: Click on image Bulldozer - Navigate to page product.png')

"Step 11: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_ngxSlider3_1'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11: Click on span.png')

"Step 12: Click on button 'btn-add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12: Click on button btn-add-to-cart.png')

"Step 13: Click on link '4' -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13: Click on link 4 - Navigate to page .png')

"Step 14: Click on button 'Proceed to checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14: Click on button Proceed to checkout.png')

"Step 15: Login into Application"

TrueTestScripts.login()

"Step 16: Enter address details during checkout process"

enterAddressDetailsDuringCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 17: Click on button 'Proceed to checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17: Click on button Proceed to checkout.png')

"Step 18: Click on select 'payment-method'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_paymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18: Click on select payment-method.png')

"Step 19: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19: Click on button Confirm.png')

"Step 20: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20: Click on button Confirm.png')

"Step 21: Click on link 'Home'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21: Click on link Home.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Rentals Purchase Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
