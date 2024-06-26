### Today's Agenda:
    
    > 2:30 to 3:15 -> POM Introduction
    > 3:15 to 4:00 -> Sequential Execution
    > 4:00 to 4:15 -> Breakout
    > 4:15 to 4:30 -> Break
    > 4:30 to 5:00 -> Constructor
    > 5:00 to 6:00 -> Parallel Execution
    > 6:00 to 6:15 -> Breakout
    > 6:15 to 6:45 -> Explicit Wait 


### Leaftaps Application:

LoginPage
  - enterUsername
  - enterPassword
  - clickLoginButton
WelcomePage
   - clickCRMSFALink
MyHomePage
   - clickLeadsLink
MyLeadsPage
   - clickCreateLeadLink
   - clickFindLeadsLink
   - clickMergeLeadLink
CreateLeadPage
  - enterCompanyName
  - enterFirstName
  - enterLastName
  - clickCreateLeadButton
ViewLeadPage
  - verifyLeads  


### Steps to start with PageObjectModel
1. Create a new Project with the neccessary dependencies added in pom.xml
2. Create packages
     - base
         - Create ProjectSpecificMethods to have the common codes specific to the project
         - For sequential execution declare the driver as static
         - Create 2 methods
            preCondition() and postCondition()
            annotate the methods with @BeforeMethod and @AfterMethod respectively
     - pages
         - Create classes for each pages
         - All the pages should extend ProjectSpecificMethods   
         - Inside each pages create methods for each action
              LoginPage extends ProjectSpecificMethods
               - create enterUsername()
                  - Add return statement according to the page navigation
                  - if an action stays in the samepage return this(this represents the current class object)
                  - return this;
               - create enterPassword()
                 - return this;
               - create clickLoginButton()
                  - if an action navigates to a particular page 
                  - return new particularPage();
                  - return new WelcomePage();
             WelcomePage
               - clickCRMSFALink 
                 - return new MyHomePage();
      - testcases
         - Create classes for each testcases and all the testcases should extend ProjectSpecificMethods
         - Create RunCreateLead class
         - Create runCreateLead() and annotate with @test 
           - Create Object for LoginPage and call the methods and execute        
              















### Constructor :

#### Definition:
 - A constructor is a special type of method used to initialize newly created objects. 
 - It is called automatically at the time of object creation and can be used to set initial values for object attributes.

#### Types:
1. **Default Constructor**: 
   - Automatically provided by the compiler if no constructors are defined.
   - Initializes member variables to default values (0, null, false, etc.).
   - Has no parameters.

2. **Parameterized Constructor**:
   - Defined by the programmer.
   - Allows passing parameters to set initial values for object attributes.
   - Helps in creating objects with specific states.

#### Constructor Overloading:
   - Refers to defining multiple constructors within the same class with different parameters.
   - Enables creating objects in different ways, depending on the information available at object creation.

#### Constructor Chaining:
  - The process of calling one constructor from another constructor within the same class.
  - Achieved using `this()` and `super()` calls.
  - `this()` is used for calling a constructor from another overloaded constructor in the same class.
  - `super()` is used to call the superclass constructor.




