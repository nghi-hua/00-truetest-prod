import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.selectPaymentMethodAndProvideBankDetails
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import katalon.common.fillAddressDetailsCheckout
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on span sliderBar"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_sliderBar'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2: Click on span sliderBar.png')

"Step 3: Click on link drawerToolCabinet8955 -> Navigate to page '#/product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_drawerToolCabinet8955'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Click on link drawerToolCabinet8955 - Navigate to page product.png')

"Step 4: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on button addToCart.png')

"Step 5: Click on link navCart -> Navigate to page '#/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on link navCart - Navigate to page .png')

"Step 6: Click on tr object"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/tr_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on tr object.png')

"Step 7: Enter input value in input quantityForDrawerTool"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_quantityForDrawerTool'), input_quantity_01j0hxpyxy2tpkef24r98v7js5)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Enter input value in input quantityForDrawerTool.png')

"Step 8: Click on td cell1"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/td_cell1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on td cell1.png')

"Step 9: Click on button proceed1"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9: Click on button proceed1.png')

"Step 10: Login into Application"

TrueTestScripts.login()

"Step 11: Fill address details in checkout process"

fillAddressDetailsCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Select payment method and provide bank details"

selectPaymentMethodAndProvideBankDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13: Click on button confirm.png')

"Step 14: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14: Click on button confirm.png')

"Step 15: Click on link home"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15: Click on link home.png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Add and Modify Cart Items before Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
