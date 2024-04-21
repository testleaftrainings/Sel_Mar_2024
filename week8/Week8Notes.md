# Steps to implement POM with Multilingual Application:

 - Create property files under src/main/resources
      config.en.properties
      config.fr.properties
     Inside the property file store all rge datas as a key-value pair
        key should always remain unique
        value can change
 - Inside the BaseClass inside the preCondition() 
        Declare Properties globally 
		FileInputStream fis = new FileInputStream("src/main/resources/config.en.properties");
		prop = new Properties();
		prop.load(fis);  
 - Use prop object and call the getProperty() and get the values from the property file wherever required.                

 <!-- https://mvnrepository.com/artifact/org.aeonbits.owner/owner -->
<dependency>
    <groupId>org.aeonbits.owner</groupId>
    <artifactId>owner</artifactId>
    <version>1.0.12</version>
</dependency>


package config;

import org.aeonbits.owner.Config;

public interface ConfigurationManager extends Config{
	
	@Key("impTimeout")
	int getImplicitWait();
	
	@Key("language")
	String getLanguage();
	
	@Key("username")
	String getUsername();
	
	@Key("password")
	String getPassword();
	
	@Key("welcometext")
	String getWelcomeText();
	
	@Key("leadslink")
	String getLeadsLink();
	
	@Key("createleadlink")
	String getCreateLeadLink();

}


package config;

import org.aeonbits.owner.ConfigCache;

public class Configuration {
	
	public static ConfigurationManager configuration() {
		return ConfigCache.getOrCreate(ConfigurationManager.class);

	}

}


# Exception:
    - Abnormal behaviour which disrupts the program execution
    - Compile Time Exception / Checked Exceptions
    - RunTime Exception / Unchecked Exceptions
        NosuchElementException
        StaleElementReferenceException
        NoSuchWindowException
        NoAlertPresentException
        IOException
        FileNotFoundException
        ArrayIndexOutOfBoundsException
        ElementNotInteractableException


# Exception Handling:
     - Apply try/catch block
     - catch block will be executed only when there is an exception inside the try block
     - we cannot have try block alone
     - we cannot have catch block alone
     - Each Exception is a class  which extend RunTimeException
     - RunTimeException extends Exception
     - Exception is the super class
     - Finally block will execute irrespective of the failures inside the try block
     
     

# Waits:
    - ImplicitWait     
         - global Wait
         - findElement() and findElements() are affected by implicit wait
         - If it couldnt find the element within the max period then it will throw NosuchElementException
    - Thread.Sleep();
         - particular line of code
         - It will sleep for the given time period

   Explicit Wait:
          - to wait for the elements behaviour
             visiblityOfEle()
             stalenessOfEle()
             
           - Interact with the element as soon as the elements behaviour is ready
           
       WebDriverWait
         20 s 
            polling interval for 500ms
            After crossing the max limit -> if the element is not ready -> throw TimeoutException
            

# Extent Report:
    - library called aventstack

    <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>3.1.5</version>
    </dependency>
    
    - Can attach Screenshot for each Steps
    - Can have report based on different author
    - Can have report based on different Category
    - Consolidated dashboard with graphs


 # Extent classes:
    - ExtentHTMLReporter
    - ExtentReports
    - ExtentTest
    - MediaEntityBuilder  
    
# Steps to integrate ExtentReport with POM:
  - Create startReport() inside the BaseClass and have the common steps(Step1-Step3)
  - And annotate startReport() with @BeforeSuite
  - Create stopReport() inside the BaseClass and have extent.flush() and annotate with @AfterSuite 
  - Create testDetails() and have step4 inside and replace the hardcoded values with the global variables  

@BS               ---------------------> startReport()

   @BT            ---------------------> setValues()

     @BC          ---------------------> assignTestDetails()

        @DP        -------------------> sendData()

          @BM      -------------------> preCondition()

             @Test -------------------> runLogin(), runCreateLead()

          @AM      -------------------> postCondition()

     @AC           -------------------> Nil


   @AT             -------------------> Nil

@AS                --------------------> stopReport()


# Framework:
     -  Structured set of guidelines , best practices, and tools
     -  Advantages:
           - Code readability
           - maintability
           - Uniformity
           - Increase Productivity
     - A Lead Architect will design a framework
         

# Framework Description:
    - What type of Framework ?
         Hybrid Framework ->Combination of both TestNG + Cucumber   
    - Tools:
        Selenium Webdriver -> To automate Web Application
        Maven -> Build management tool
        TestNG  -> Execution Framework
        Cucumber -> BDD Approach
        APACHE POI -> To Read data from the excel
        Extent Report -> To generate automation HTML summary report
    - Best practices:
        PageObjectModel - design pattern    
        
        
# Components:
        - com/framework/selenium/api/design (design package)
           - Browser Interface to have the methods related to the browser activity
           - Element Interface to have the methods related to the Element activity
           - Locators -> enum

         - com/framework/selenium/api/base (base package for the whole framework)
             - DriverInstance
                 To maintain the driver instances
             - SeleniumBase is the implementation class 
                  which implements Browser,Element
               This is the heart of our framework
               Which will be having all the reusable codes with proper exception handling  
               It acts as the wrapper class 

         - com/framework/testng/api/base
              - ProjectSpecificMethods
                  Which will have the common methods specific to the project
              - RetryEngine
                  To retry the failed tests automatedly

         - com/framework/utils
              - to maintain the utlities for the project  
              - DataLibrary
                 To read the data from the Excel Sheet      
              - Reporter
                 To have the codes related to the extent Report
          
          - com/leaftaps/pages
               - This will have classes for each pages

          - com/leaftaps/testcases
               - This will have classes for each testcases     
                  
# Hierarchy:
       AbstractTestNGCucumberTests
          DriverInstance
             Reporter
               SeleniumBase
                 ProjectSpecificMethods
                   Pages
                   Testcases           

