import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/#"

TrueTestScripts.navigate('/')

"Step 2: Click on link 'Claw Hammer with Shock Reduction Grip\$13.41' -> Navigate to page '/#/product/01HY2J5RFCACBTJAWNF23X86YR'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_clawHammer'))

WebUI.takeScreenshot()

"Step 3: Click on button 'btn-add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/01HY2J5RFCACBTJAWNF23X86YR?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot()

"Step 4: Click on div  -> Navigate to page '#/checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/product/01HY2J5RFCACBTJAWNF23X86YR?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_productAddedAlert'))

WebUI.takeScreenshot()

"Step 5: Click on button 'Proceed to checkout'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))

WebUI.takeScreenshot()

"Step 6: Login into Application"

TrueTestScripts.login()

WebUI.takeScreenshot()

"Step 7: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginForm'))

WebUI.takeScreenshot()

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
