import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /gp/help/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/display.html"

TrueTestScripts.navigate("/gp/help/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/display.html")

"Step 2: Click on link DogsOfAmazon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_help_testlong_customer_gp_help_customer_gp_help_customer_gp/link_DogsOfAmazon'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link DogsOfAmazon.png')

"Step 3: Click on link SorryWeCouldNotFindThat -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/help/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/testlong/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_help_testlong_customer_gp_help_customer_gp_help_customer_gp/link_SorryWeCouldNotFindThat'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link SorryWeCouldNotFindThat - Navigate to page .png')

"Step 4: Click on link GiftCards -> Navigate to page 'Gift-Cards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GiftCards'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link GiftCards - Navigate to page Gift-Cards.png')

"Step 5: Click on link SubwayEGiftCard -> Navigate to page '*/dp/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/Gift-Cards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Gift_Cards/link_SubwayEGiftCard'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link SubwayEGiftCard - Navigate to page dp.png')

"Step 6: Click on input AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on input AddToCart.png')

"Step 7: Click on input AddToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_AddToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on input AddToCart2.png')

"Step 8: Enter input value in input Amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dp/input_Amount'), input_Amount)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Enter input value in input Amount.png')

"Step 9: Click on button Amount100"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_Amount100'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button Amount100.png')

"Step 10: Click on button Amount100"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_Amount100'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button Amount100.png')

"Step 11: Click on button Amount150"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_Amount150'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button Amount150.png')

"Step 12: Click on button TextMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_TextMessage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on button TextMessage.png')

"Step 13: Click on input RecipientsSMS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_RecipientsSMS'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on input RecipientsSMS.png')

"Step 14: Enter input value in input RecipientsSMS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dp/input_RecipientsSMS'), input_RecipientsSMS)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Enter input value in input RecipientsSMS.png')

"Step 15: Click on input SenderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_SenderName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on input SenderName.png')

"Step 16: Click on div ValidPhoneMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_ValidPhoneMessage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on div ValidPhoneMessage.png')

"Step 17: Click on span PlusOne"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/span_PlusOne'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on span PlusOne.png')

"Step 18: Click on span PlusOne"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/span_PlusOne'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on span PlusOne.png')

"Step 19: Click on input RecipientsSMS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_RecipientsSMS'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on input RecipientsSMS.png')

"Step 20: Click on div DeliveryMechanismForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/div_DeliveryMechanismForm'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on div DeliveryMechanismForm.png')

"Step 21: Enter input value in input RecipientsSMS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dp/input_RecipientsSMS'), input_RecipientsSMS)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Enter input value in input RecipientsSMS.png')

"Step 22: Click on input SenderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_SenderName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on input SenderName.png')

"Step 23: Click on input SenderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_SenderName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on input SenderName.png')

"Step 24: Enter input value in input SenderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dp/input_SenderName'), input_SenderName)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Enter input value in input SenderName.png')

"Step 25: Click on textarea Message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/textarea_Message'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Click on textarea Message.png')

"Step 26: Click on input Date -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_Date'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Click on input Date - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Add Gift Cards to Cart and Verify Recipient Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}