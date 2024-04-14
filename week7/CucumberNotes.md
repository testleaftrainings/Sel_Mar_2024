# Cucumber:

   Load the leaftaps application
   Enter the username and password 
   click the login button
   The homepage should be displayed 

# Gherkin Keywords:
    To Describe the functionality of the application
     Feature: Login functionality of Leaftaps application
    To describe the behaviour/testcase
     Scenario: Login with positive credentials and verify the homepage
    To represent the precondition
     Given Launch the browser
     And Load the url
     And Enter the username
     And Enter the password
    To represent the test condition
      When Click on the Login button
    To represent the positive expected result
      Then HomePage should be displayed   


     To describe the behaviour/testcase
     Scenario: Login with negative credentials and verify
    To represent the precondition
     Given Launch the browser
     And Load the url
     And Enter the username
     And Enter the password
    To represent the test condition
      When Click on the Login button
    To represent the negative expected result
      But Errormessage should be displayed   


# Steps to start with Cucumber:
   - Create 3 packages under src/test/java
         - features
             Create a feature file -> Right click features package ->
             Click Other -> Double click General  -> Click File ->
             Give a filename with .feature extension -> Click finish
             Run as Cucumber feature -> Snippets would be generated
         - steps
             Create StepDefinition class inside steps package
             Copy the snippets and paste inside the StepDefintion class
             Remove the existing code inside each method and put the real code
         - runner        
            Create a Class called CucumberRunner which should extend AbstractTestNGCucumberTests
            On the top of the class use @CucumberOptions() and use the attributes below:
                features -> to mention the path of the feature file
                glue -> to mention the package name of the step definition
                monochrome -> to remove the junk characters from the console
                publish -> to get the cucumber report link in the console

# Exception:
    UndefinedStepException
    DuplicateStepDefinitionException

# Parameterization:
    - Inside the feature file , Surround the datas inside each Scenario with single quote ''
    - In the StepDefinition , on the top of the method replace the hardcoded data 
      with {string}
    - Pass input argument to the method and replace the hardcoded data with the argument.

# How to pass multiple data:
    - Use Scenario Outline followed with Examples keyword
    - Inside Scenario Outline replace the hardcoded data with <name>
    - Inside Examples keyword pass the inputs 
    - Create a pipleine symbol and mention the names in the firstrow
    - In the second row pass the inputs  

# Hooks:
    - In cucumber they call annotation as Hooks in Ruby language
        @Before
          - Is used to have the precondition which will execute before each scenario
        @After
          - Is used to have the postcondition which will execute after each scenario

# Steps to implement hooks:
    - Create a BaseClass to declare the driver
        public static ChromeDriver driver;
    - Create hooks package and Create a class called HooksImplementation which extends BaseClass
    - Create 2 methods preCondition() and postCondition() and annotate with @Before
      and @After
    - Remove Background keyword in all the feature files
    - Create separate classes for LoginSteps and CreateLeadSteps
      which extends BaseClass
    - Remove the precondition methods from the LoginSteps
    - Finally, in the Runner class mention the hooks package name within glue 

# Steps to use TestNG Annotations:
     - Create a BaseClass and declare the driver globally as static
     - Create the common precondition() and postcondition() and 
       annotate with @BeforeMethod and @AfterMethod
     - All the StepDefinition and Runner class should extend BaseClass
     - The BaseClass should extend AbstractTestNGCucucmberTests   


# Tags:
      //  tags="@smoke") // executes only the particular scenario
               //  tags="@regression or @functional") //executes either scenarios
               //   tags="@smoke and @functional")// exceutes the scenario which has both together
                    tags = "not @regression")// to exclude a scenario from execution             


# Cucumber with POM:
     - Create 4 packages
         - base
            Create BaseClass with common methods
            BaseClass should extend AbstractTestNGCucumberTests
         - features
             Create feature files
         - pages
            Create classes for each page and each page should extend BaseClass
         - runner
            Create CucumberRunner class and , mention glue="pages"
            The runner class should extend BaseClass


# For TestNG:
    if driver - > static
       only sequential execution is possible

    For both sequential parallel execution:
       Create constrcutor in each of the pages  by removing static keyword

# For Cucumber:

    if driver - > static
       only sequential execution is possible 


 If you want to have a hybrid framework
    combination of both TestNG + Cucumber   


# ThreadLocal 

     It is a class in java for thread safety

  Steps:
    1. private static final ThreadLocal<ChromeDriver> cDriver = new ThreadLocal<>();

     private:
       It can be accessed only within the class
     static final:
        static+final = constant
     ThreadLocal:
       It is a class that provides thread-local variable

    2. Use setter and getter methods
         Sets the current thread's copy of this thread-local variable

          public void setDriver() {
		cDriver.set(new ChromeDriver());

	}
	 Returns the value in the current thread's copy of this thread-local variable   
	public ChromeDriver getDriver() {
		return cDriver.get();
	}

        











            