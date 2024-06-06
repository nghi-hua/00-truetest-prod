package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectProductIncreaseQuantityAddToCartProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link 'Combination Pliers$14.15' -> Navigate to page '#/product/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_combinationPliers1415'))
        "Step 2: Click on button 'btn-increase-quantity'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_increaseQuantity'))
        "Step 3: Click on button 'btn-add-to-cart'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))
        "Step 4: Click on link '2' -> Navigate to page '#/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))
        "Step 5: Click on button 'Proceed to checkout'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

