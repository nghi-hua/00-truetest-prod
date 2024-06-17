import katalon.common.selectPaymentMethodAndEnterBankDetails
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addClawHammerToCartAndLogin
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.enterAddressDetailsForCheckout
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 3: Add claw hammer to cart and proceed to login"

addClawHammerToCartAndLogin.execute()

"Step 4: Enter address details for checkout"

enterAddressDetailsForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Select payment method and enter bank account details"

selectPaymentMethodAndEnterBankDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on button confirm.png')

"Step 7: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on button confirm.png')

"Step 8: Click on link home"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on link home.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout Process with Address and Payment Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
