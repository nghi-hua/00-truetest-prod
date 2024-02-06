import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink bike panniers rack trunks bike pannier > navigate to Page hz mobile mission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_computer_tablets_computer_tablets'))

'Step 3: At Page hz mobile mission, click on hyperlink books > navigate to Page books-used-books-textbooks b'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_hz_mobile_mission/hyperlink_books'))

'Step 4: At Page books-used-books-textbooks b, click on hyperlink your books > navigate to Page your-books'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_books-used-books-textbooks_b/hyperlink_your_books'))

'Step 5: At Page your-books, click on div desktop visitedsavedbooks'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_your-books/div_desktop_visitedsavedbooks'))

'Step 6: At Page your-books, click on button next'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_your-books/button_next'))

'Step 7: At Page your-books, click on button sounds good'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_your-books/button_next'))

'Step 8: At Page your-books, click on hyperlink book cover image link'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_your-books/hyperlink_book_cover_image_link'))

'Step 9: At Page your-books, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_your-books/div_object'))

'Step 10: At Page your-books, click on button buynow1click > navigate to Page kindle-dbs thankYouPage'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_your-books/button_buynow1click'))

'Step 11: At Page kindle-dbs thankYouPage, click on hyperlink a autoid 1 announce > navigate to Page ap signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_kindle-dbs_thankYouPage/hyperlink_a_autoid_1_announce'))

'Step 12: At Page ap signin, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_ap_signin/input_password_1'), input_password)

'Step 13: At Page ap signin, click on input signinsubmit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ap_signin/input_signinsubmit_1'))

'Step 14: At Page ap signin, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_ap_signin/input_password_1'), input_password_1)

'Step 15: At Page ap signin, click on input signinsubmit > navigate to Page ap accountfixup'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ap_signin/input_signinsubmit_1'))

'Step 16: At Page ap accountfixup, click on hyperlink ap account fixup phone skip link > navigate to Page gp digital your-account order-summary html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ap_accountfixup/hyperlink_ap_account_fixup_phone_skip_link'))

'Step 17: At Page gp digital your-account order-summary html, click on hyperlink nav logo sprites > navigate to Page ref=nav logo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_digital_your-account_order-summary_html/hyperlink_nav_logo_sprites'))

'Step 18: At Page ref=nav logo, click on hyperlink best sellers > navigate to Page gp bestsellers'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ref=nav_logo/hyperlink_best_sellers'))

'Step 19: Add visual checkpoint at Page gp bestsellers'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Available Bestsellers in the Books Category_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
