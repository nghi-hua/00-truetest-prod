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

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page gp product, click on hyperlink object > navigate to Page DMaos-Spinner-Stainless-Ceramic-Colorful dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_product/hyperlink_object'))

'Step 3: At Page DMaos-Spinner-Stainless-Ceramic-Colorful dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DMaos-Spinner-Stainless-Ceramic-Colorful_dp/div_object'))

'Step 4: Add visual checkpoint at Page DMaos-Spinner-Stainless-Ceramic-Colorful dp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify Stainless Ceramic Colorful Spinner_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
