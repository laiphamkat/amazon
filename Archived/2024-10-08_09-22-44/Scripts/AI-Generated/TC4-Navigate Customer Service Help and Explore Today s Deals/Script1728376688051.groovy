import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to gp/help/*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*"

TrueTestScripts.navigate("gp/help/${GlobalVariable.help_id}/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/${GlobalVariable.customer_id}/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/${GlobalVariable.customer_id}/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/${GlobalVariable.customer_id}/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/${GlobalVariable.customer_id}/${GlobalVariable.path_param_60}/${GlobalVariable.path_param_61}/${GlobalVariable.path_param_62}/${GlobalVariable.path_param_63}/${GlobalVariable.path_param_64}/${GlobalVariable.path_param_65}/${GlobalVariable.path_param_66}/${GlobalVariable.path_param_67}/${GlobalVariable.path_param_68}/${GlobalVariable.path_param_69}/${GlobalVariable.path_param_70}/${GlobalVariable.path_param_71}/${GlobalVariable.path_param_72}/${GlobalVariable.path_param_73}/${GlobalVariable.path_param_74}/${GlobalVariable.path_param_75}")

"Step 2: Click on link NotFound -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/.*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/.*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/.*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/.*/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_help_customer_gp_help_customer_gp_help_customer_gp_help_gp/link_NotFound'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link NotFound - Navigate to page .png')

"Step 3: Click on link CustomerService -> Navigate to page 'gp/help/customer/display.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_CustomerService'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link CustomerService - Navigate to page gphelpcustomerdisplayhtml.png')

"Step 4: Click on div CheckRefundStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_help_customer_display_html/div_CheckRefundStatus'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on div CheckRefundStatus.png')

"Step 5: Click on label helpTopics (DevicesDigitalSolutions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_gp_help_customer_display_html/label_helpTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_gp_help_customer_display_html/label_helpTopics', ['label_helpTopics_for': label_helpTopics_for, 'label_helpTopics_internalText': label_helpTopics_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on label helpTopics DevicesDigitalSolutions.png')

"Step 6: Click on label helpTopics (AmazonBusinessAccounts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_gp_help_customer_display_html/label_helpTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_gp_help_customer_display_html/label_helpTopics', ['label_helpTopics_for': label_helpTopics_for_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label helpTopics AmazonBusinessAccounts.png')

"Step 7: Click on image Accessibility"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_help_customer_display_html/image_Accessibility'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on image Accessibility.png')

"Step 8: Click on link TodaysDeals -> Navigate to page '/primebigdealdays'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_help_customer_display_html/link_TodaysDeals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link TodaysDeals - Navigate to page primebigdealdays.png')

"Step 9: Click on link LANEIGELipGlowyBalm -> Navigate to page '*/dp/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/primebigdealdays?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_primebigdealdays/link_LANEIGELipGlowyBalm'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on link LANEIGELipGlowyBalm - Navigate to page dp.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate Customer Service Help and Explore Today s Deals_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}