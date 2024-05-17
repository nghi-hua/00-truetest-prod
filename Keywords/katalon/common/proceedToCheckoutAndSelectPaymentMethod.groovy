package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class proceedToCheckoutAndSelectPaymentMethod {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'Proceed to checkout'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed3'))
        WebUI.takeScreenshot()
        "Step 2: Click on select 'payment-method'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_paymentMethod'))
        WebUI.takeScreenshot()
        "Step 3: Click on input field 'bank name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_bankName'))
        WebUI.takeScreenshot()
        "Step 4: Enter input value in input field 'bank name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_bankName'), data['input_bank_name'])
        WebUI.takeScreenshot()
        "Step 5: Click on input field 'account name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_accountName'))
        WebUI.takeScreenshot()
        "Step 6: Enter input value in input field 'account name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_accountName'), data['input_account_name'])
        WebUI.takeScreenshot()
        "Step 7: Click on input field 'account number'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_accountNumber'))
        WebUI.takeScreenshot()
        "Step 8: Enter input value in input field 'account number'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/checkout?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_accountNumber'), data['input_account_number'])
        WebUI.takeScreenshot()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_bank_name'] = testData.getValue('input_bank_name', rowIndex)
        data['input_account_name'] = testData.getValue('input_account_name', rowIndex)
        data['input_account_number'] = testData.getValue('input_account_number', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_bank_name'] = 'default_data'
        data['input_account_name'] = 'default_data'
        data['input_account_number'] = 'default_data'
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

