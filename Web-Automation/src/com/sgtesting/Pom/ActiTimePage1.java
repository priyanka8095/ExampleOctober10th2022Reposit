package com.sgtesting.Pom;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActiTimePage1 {

	public ActiTimePage1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);

	}
	public WebElement	username;

	public WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPwd()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()=\"Login \"]")
	private WebElement oLogin ;

	public WebElement getLogin()
	{
		return oLogin;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(xpath="//div[text()=\"USERS\"]")
	private WebElement USERS;
	 public WebElement getUSERS()
	{
		return USERS;
	}
	
	 @FindBy(xpath="//div[@class=\"icon\"]")
   private WebElement icon;
	 public WebElement geticon()
	 {
		 return icon;
	 }
	 
	 private WebElement firstName;
	 public WebElement getfirstName()
	 {
		 return firstName;
	 }
	 
	 private WebElement userDataLightBox_lastNameField;
	 public WebElement getlastName()
	 {
		 return userDataLightBox_lastNameField;
	 }
	 
	 private WebElement email;
	 public WebElement getmail()
	 {
		 return email;
	 }
	 
	 private WebElement userDataLightBox_usernameField;
	 public WebElement getusername1()
	 {
		 return userDataLightBox_usernameField;
	 }
	 
	 private WebElement password; 
	 public WebElement getpassword()
	 {
		 return password;
	 }
	 private WebElement passwordCopy;
	 public WebElement getpasswordcopy()
	 {
		 return passwordCopy;
	 }
	 
	 @FindBy(xpath="//span[@class=\"buttonTitle\"]")
	 private WebElement buttonTitle;
	 public WebElement getclickoncreateuser()
	 {
		 return buttonTitle;
	 }
	 
	 @FindBy(xpath="//span[@class=\"userNameSpan\"]")
	 private WebElement userNameSpan;
	 public WebElement getclickonuserdemo()
	 {
		 return userNameSpan;
	 }
	 
	 private WebElement userDataLightBox_deleteBtn;
	 public WebElement getclickondelete()
	 {
		 return userDataLightBox_deleteBtn;
	 }
	 
	 @FindBy(linkText="Logout")
	private WebElement Logout;
	 public WebElement getlogout()
	 {
		 return Logout;
	 }
	 
	 private WebElement userDataLightBox_passwordField;
	 public WebElement getclickonmodifypassword()
	 
	 {
		 return userDataLightBox_passwordField;
	 }
	 
	 private WebElement passwordCopy1;
	 public WebElement getclickonmodifypassowrd1()
	 {
		 return passwordCopy;
	 }
			 //savechanges
	 @FindBy(xpath="//span[text()='Save Changes']")
	 private WebElement savechanges;
	 public WebElement getclickonsavechanges()
	 {
		 return savechanges;
	 }
	 //click on tasks
	 @FindBy(xpath="//div[text()='TASKS']")
	 private WebElement img;
	 public WebElement getclickontask()
	 {
		 return img;
	 }
	 
	//cickon add
	 @FindBy(xpath="//div[text()='Add New']")
	 private WebElement AddNew;
	 public WebElement getclickonaddnew()
	 {
		 return AddNew;
	 }
	//ickoncustomer
	 @FindBy(xpath="//div[text()='+ New Customer']")
	 private WebElement NewCustomer;
	 public WebElement getclickonnewcustomer()
	 {
		 return NewCustomer;
	 }
	 
	 private WebElement customerLightBox_nameField;
	 public WebElement getcustomername()
	 {
		 return customerLightBox_nameField;
		 
	 }
	 
	 //entercustomerdescription
	 private WebElement customerLightBox_descriptionField;
	 public WebElement getclickoncustomerdescription()
	 {
		 return customerLightBox_descriptionField;
	 }
	 
	 //click ncreatecustomer  
	 @FindBy(xpath="//span[text()='Create Customer']")
	 private WebElement CreateCustomer;
	 public WebElement getclickoncreatecustomer()
	 {
		 return CreateCustomer;
	 }
	 
	 //click on iphone
	 @FindBy(xpath="//div[@class=\"editButton available\"]")
	 private WebElement editButtonavailable;
	 public WebElement getclickoneditbutton()
	 {
		 return editButtonavailable;
	 }
	 
	 //clcik on actions
	 @FindBy(xpath="//div[text()='ACTIONS']")
			 private WebElement ACTIONS;
	 public WebElement getclickONactions()
	 {
		 return ACTIONS;
	 } 
	 //click on delete
	 @FindBy(xpath="//div[text()='Delete']")
	 private WebElement Delete;
	 public WebElement getclickonDelete()
	 {
		 return Delete;
	 } 
	 //deletepermannetly
	 private WebElement customerPanel_deleteConfirm_submitTitle;
	 public WebElement getclickondeletepermanently()
	 {
		 return customerPanel_deleteConfirm_submitTitle;
	 }
	 
	//odify customer
	 @FindBy(xpath="//div[text()='Description']")
	 private WebElement Description1;
	 public WebElement getclickoncustomerdescription1()
	 {
		 return Description1;
	 }
	 
	 public WebElement deletepermanently()
	 {
		 return customerPanel_deleteConfirm_submitTitle;
	 }
	 
	 //create propject
	 @FindBy(xpath="//div[text()='+ New Project']")
	 
	 private WebElement newProject;
	 public WebElement getclickonnewproject()
	 {
		 return newProject;
	 }
	 //clcik on project name
	
	 private WebElement projectPopup_projectNameField;
	 public WebElement getclcickonprojectname()
	 {
		 return projectPopup_projectNameField;
	 }
	 //clcik on project description
	 private WebElement projectDescriptionField;
	 public WebElement getclickonprojectdescription()
	 {
		 return projectDescriptionField;
	 }
	 //clcik on create project
  @FindBy(xpath="//span[text()='Create Project']")
  
  private WebElement CreateProject;
	 public WebElement getclickonCreateProject()
	 {
		 return CreateProject;
	 }
	 //click on project
	 @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	 private WebElement editbutton;
	 public WebElement getclickoneditbutton1()
	 {
		 return editbutton;
	 }
	 
	 //clickon atcions
	 @FindBy (xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	 private WebElement actions;
	 public WebElement getclickonactions1()
	 {
		 return actions;
	 }
	 
	 //delte actions
	 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	 private WebElement delete;
	 public WebElement getclickondeleteactions()
	 {
		 return delete;
	 }
	 
	 //delete permannently actions
	 @FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
	 private WebElement deletepermanently;
	 public WebElement getclickondeletepermanentlyproject()
	 {
		 return deletepermanently;
	 }
	//modifyproject 
	 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	 private WebElement clickonselenium;
	 public WebElement getclickonselenium()
	 {
		 return clickonselenium;
	 }
	 //emptyfeieldofprojectname
	 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	 private WebElement emptyfield;
	 public WebElement getclickonemptyfieldproject()
	 {
		 return emptyfield;
	 }
	 //close button of project
	 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	 private WebElement close;
	 public WebElement getclickonclosebutton()
	 {
		 return close;
	 }
	//create task//
	 
	 //clcik on create task
	 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	 private WebElement addnewtask;
	 public WebElement getclickonaddnewtask()
	 {
		 return addnewtask;
	 }
	 //clcik on create task
	 @FindBy(xpath="/html/body/div[13]/div[1]")
	 private WebElement createtask;
	 public WebElement getclickoncreatetask()
	 {
		 return createtask;
	 }
	 //enter task field1
	 @FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	 private WebElement enterfield1;
	 public WebElement getclickonenterfield1()
	 {
		 return enterfield1;
	 }
	//enter task field2
		 @FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")
		 private WebElement enterfield2;
		 public WebElement getclickonenterfield2()
		 {
			 return enterfield3;
		 }
		//enter task field3
		 @FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]/td[1]/input")
		 private WebElement enterfield3;
		 public WebElement getclickonenterfield3()
		 {
			 return enterfield3;
		 }
		//enter task field4
		 @FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]/td[1]/input")
		 private WebElement enterfield4;
		 public WebElement getclickonenterfield4()
		 {
			 return enterfield4;
		 }
		 //click on create task
		 @FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
		 private WebElement createtaskbutton;
		 public WebElement getclickoncreatetaskbutton()
		 {
			 return createtaskbutton;
		 }
		 //to delete task
		//click on create task
		 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")
		 private WebElement taskselenium;
		 public WebElement getclickontaskselenium()
		 {
			 return taskselenium;
		 }
		 //clcik on action selenium
		 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		 private WebElement taskaction;
		 public WebElement getclickontaskaction()
		 {
			 return taskaction;
		 }
		 //clcik on delete action
		 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
		 private WebElement  deleteaction;
		 public WebElement getclcikondeleteaction()
		 {
			 return deleteaction;
		 }
		 @FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
		 private WebElement  deletepermanentlyselenium;
		 public WebElement getclcikondeletepermanently()
		 {
			 return deletepermanentlyselenium;
		 }
		 
		 //start exploring acttime
		 @FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
		 private WebElement startexploringtime;
		 public WebElement getclickonstartexploringtime()
		 {
			 return startexploringtime;
		 }
		 
		 //modifypassword for user1
		 @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
		 private WebElement userdemo1;
		 public WebElement getclickonuserdemo1()
		 {
			 return userdemo1;
		 }
		 //modify password for user2
		 @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		 private WebElement userdemo2;
		 public WebElement getclickonuserdemo2()
		 {
			 return userdemo2;
		 }

		//modify password for user3
		 @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		 private WebElement userdemo3;
		 public WebElement getclickonuserdemo3()
		 {
			 return userdemo3;
		 }
	 //save changes
		 @FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		 private WebElement savechangesfor3;
		 public WebElement getclickonsavechangesfor3()
		 {
			 return savechangesfor3;
		 }
		 
		 @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		 private WebElement modifyuser;
		 
		 public WebElement getModifyUser()
		 {
			 return modifyuser;
		 }
		 @FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
		 private WebElement password1;
		 
		 public WebElement getPassword1()
		 {
			 return password1 ;
		 }
		 @FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
		 private WebElement passwordcopy1;
		 
		 public WebElement getPasswordcopy1()
		 {
			 return passwordcopy1;
		 }
		 
		 @FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		 
		 private WebElement savechange;
		 
		 public WebElement getSaveChangesButton()
		 {
			 return savechange;
		 }
		 
		 
		 //create username for demouser2
		 private WebElement usernameforuser1;
		 public WebElement getclickonusernameforuser1() {
			 return usernameforuser1;
		 }
		 
		 
		 
		//create username for demouser2 password
	
		 private WebElement pwdforuser1;
		 public WebElement getclickonpwdforuser1()
		 {
			 return pwdforuser1;
		 }
		 //delete user1
		 @FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
		 private WebElement deleteuser1;
		 public WebElement getclickondeleteuser1() {
			 return deleteuser1;
		 }
		 
		 
		//delete user2
		 @FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
		 private WebElement deleteuser2;
		 public WebElement getclickondeleteuser2() {
			 return deleteuser2;
		 }	 	 
		 
		 
		 
		 
		//delete user3
		 @FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
		 private WebElement deleteuser3;
		 public WebElement getclickondeleteuser3() {
			 return deleteuser3;
		 }	 	 
		 
		 //demo2
		 @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
		 private WebElement userdemo2fordeleteing;
		 public WebElement getclcikonuserdemo2fordeleting1() {
			 return userdemo2;
		 }
		// logout
		 private WebElement  logoutLink;
		 public WebElement getclcikonlogoutLink(){
			 return logoutLink;
		 }
		 public WebElement getclcikonuserdemo2fordeleting() {
			 return userdemo2;
		 }
		 
		 
		 
}
