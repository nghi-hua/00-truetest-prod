package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class proceedToCheckoutAndInputAddressDetails {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'Proceed to checkout'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed2'))
        WebUI.takeScreenshot()
        "Step 2: Click on input field 'address'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_address'))
        WebUI.takeScreenshot()
        "Step 3: Enter input value in input field 'address'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_address'), data['input_address'])
        WebUI.takeScreenshot()
        "Step 4: Click on input field 'city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_city'))
        WebUI.takeScreenshot()
        "Step 5: Enter input value in input field 'city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_city'), data['input_city'])
        WebUI.takeScreenshot()
        "Step 6: Click on input field 'state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_state'))
        WebUI.takeScreenshot()
        "Step 7: Enter input value in input field 'state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_state'), data['input_state'])
        WebUI.takeScreenshot()
        "Step 8: Click on input field 'country'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_country'))
        WebUI.takeScreenshot()
        "Step 9: Enter input value in input field 'country'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_country'), data['input_country'])
        WebUI.takeScreenshot()
        "Step 10: Click on input field 'postcode'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_postcode'))
        WebUI.takeScreenshot()
        "Step 11: Enter input value in input field 'postcode'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_postcode'), data['input_postcode'])
        WebUI.takeScreenshot()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_address'] = testData.getValue('input_address', rowIndex)
        data['input_city'] = testData.getValue('input_city', rowIndex)
        data['input_state'] = testData.getValue('input_state', rowIndex)
        data['input_country'] = testData.getValue('input_country', rowIndex)
        data['input_postcode'] = testData.getValue('input_postcode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_address'] = 'default_data'
        data['input_city'] = 'default_data'
        data['input_state'] = 'default_data'
        data['input_country'] = 'default_data'
        data['input_postcode'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

