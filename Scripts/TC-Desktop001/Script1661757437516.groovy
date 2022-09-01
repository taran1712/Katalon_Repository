import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('C:\\Users\\testing\\Downloads\\Orders.exe', 'Orders - Untitled')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Button'))

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Edit'))

Windows.setText(findWindowsObject('Object Repository/Desktop_Recording/Edit'), 'Taran')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Edit(1)'))

Windows.setText(findWindowsObject('Object Repository/Desktop_Recording/Edit(1)'), '456')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Edit(2)'))

Windows.setText(findWindowsObject('Object Repository/Desktop_Recording/Edit(2)'), 'chd')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Edit(3)'))

Windows.setText(findWindowsObject('Object Repository/Desktop_Recording/Edit(3)'), 'chd')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Edit(4)'))

Windows.setText(findWindowsObject('Object Repository/Desktop_Recording/Edit(4)'), '160022')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Edit(5)'))

Windows.setText(findWindowsObject('Object Repository/Desktop_Recording/Edit(5)'), '568956456925')

Windows.click(findWindowsObject('Object Repository/Desktop_Recording/Button(1)'))

Windows.closeApplication()

