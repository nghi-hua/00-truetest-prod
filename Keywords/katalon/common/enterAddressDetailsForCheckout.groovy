package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class enterAddressDetailsForCheckout {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button proceed2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed2'))
        "Step 2: Click on input address"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_address'))
        "Step 3: Enter input value in input address"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_address'), data['input_address'])
        "Step 4: Click on input city"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_city'))
        "Step 5: Enter input value in input city"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_city'), data['input_city'])
        "Step 6: Click on input state"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_state'))
        "Step 7: Enter input value in input state"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_state'), data['input_state'])
        "Step 8: Click on input country"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_country'))
        "Step 9: Enter input value in input country"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_country'), data['input_country'])
        "Step 10: Click on input postcode"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_postcode'))
        "Step 11: Enter input value in input postcode"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_postcode'), data['input_postcode'])
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

