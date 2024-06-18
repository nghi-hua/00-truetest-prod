import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.fillAddressDetailsCheckout
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.selectPaymentMethodAndProvideBankDetails
import katalon.common.navigateAddToCartAndLogin

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/"

TrueTestScripts.navigate('/')

"Step 2: Navigate, add to cart, and proceed to login"

navigateAddToCartAndLogin.execute()

"Step 3: Fill address details in checkout process"

fillAddressDetailsCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Select payment method and provide bank details"

selectPaymentMethodAndProvideBankDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button confirm.png')

"Step 6: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on button confirm.png')

"Step 7: Click on link home"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on link home.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Checkout Process with Login and Payment Confirmation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}