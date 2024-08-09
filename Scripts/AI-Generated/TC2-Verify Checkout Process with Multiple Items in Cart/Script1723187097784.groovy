import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.provideAddressDetailsForProcessing
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.common.selectPaymentMethodAndEnterDetails

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link clawHammer1148 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_clawHammer1148'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on link clawHammer1148 - Navigate to page product.png')

"Step 3: Click on link categories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Click on link categories.png')

"Step 4: Click on link categoryPowerTools -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_categoryPowerTools'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link categoryPowerTools - Navigate to page category.png')

"Step 5: Click on link product01J0Hx284Fg34Ffzf5353Nybxz -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_product01J0Hx284Fg34Ffzf5353Nybxz'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on link product01J0Hx284Fg34Ffzf5353Nybxz - Navigate to page product.png')

"Step 6: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on button addToCart.png')

"Step 7: Click on link navCart -> Navigate to page 'checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Click on link navCart - Navigate to page checkout.png')

"Step 8: Click on button proceed1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on button proceed1.png')

"Step 9: Login into Application"

TrueTestScripts.login()

"Step 10: Provide address details for processing"

provideAddressDetailsForProcessing.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Select payment method and enter payment details"

selectPaymentMethodAndEnterDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on button confirm.png')

"Step 13: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13: Click on button confirm.png')

"Step 14: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14: Click on link home - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Checkout Process with Multiple Items in Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}