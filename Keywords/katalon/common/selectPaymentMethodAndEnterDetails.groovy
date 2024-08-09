package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectPaymentMethodAndEnterDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceedToCheckout'))
        
        "Step 2: Click on dropdown paymentMethod"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/dropdown_paymentMethod'))
        
        "Step 3: Click on input bankName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_bankName'))
        
        "Step 4: Enter input value in input bankName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_bankName'), data['var_1_input_bankName'])
        
        "Step 5: Click on input accountName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_accountName'))
        
        "Step 6: Enter input value in input accountName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_accountName'), data['var_2_input_accountName'])
        
        "Step 7: Click on input accountNumber"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_accountNumber'))
        
        "Step 8: Enter input value in input accountNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_accountNumber'), data['var_3_input_accountNumber'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_2_input_accountName'] = testData.getValue('var_2_input_accountName', rowIndex)
        data['var_3_input_accountNumber'] = testData.getValue('var_3_input_accountNumber', rowIndex)
        data['var_1_input_bankName'] = testData.getValue('var_1_input_bankName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_2_input_accountName'] = 'default_data'
        data['var_3_input_accountNumber'] = 'default_data'
        data['var_1_input_bankName'] = 'default_data'
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

