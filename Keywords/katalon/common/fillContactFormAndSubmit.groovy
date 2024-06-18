package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillContactFormAndSubmit {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on input firstName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_firstName'))
        "Step 2: Enter input value in input firstName"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_firstName'), data['input_first_name'])
        "Step 3: Click on input lastName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_lastName'))
        "Step 4: Enter input value in input lastName"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_lastName'), data['input_last_name'])
        "Step 5: Click on input email"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_email'))
        "Step 6: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_email'), data['input_email'])
        "Step 7: Click on dropdown subject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/dropdown_subject'))
        "Step 8: Click on textarea message"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_message'))
        "Step 9: Enter input value in textarea message"
        WebUI.setText(findTestObject('AI-Generated/Page_home/textarea_message'), data['textarea_message'])
        "Step 10: Click on button contactSubmit"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_contactSubmit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_first_name'] = testData.getValue('input_first_name', rowIndex)
        data['input_last_name'] = testData.getValue('input_last_name', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['textarea_message'] = testData.getValue('textarea_message', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_first_name'] = 'default_data'
        data['input_last_name'] = 'default_data'
        data['input_email'] = 'default_data'
        data['textarea_message'] = 'default_data'
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

