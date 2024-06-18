package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectPaymentMethodAndProvideBankDetails {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button proceedToCheckout"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceedToCheckout'))
        "Step 2: Click on dropdown paymentMethod"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_paymentMethod'))
        "Step 3: Click on input bankName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_bankName'))
        "Step 4: Enter input value in input bankName"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_bankName'), data['input_bank_name'])
        "Step 5: Click on input accountName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_accountName'))
        "Step 6: Enter input value in input accountName"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_accountName'), data['input_account_name'])
        "Step 7: Click on input accountNumber"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_accountNumber'))
        "Step 8: Enter input value in input accountNumber"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_accountNumber'), data['input_account_number'])
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

