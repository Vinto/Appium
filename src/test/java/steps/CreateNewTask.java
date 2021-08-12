package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTask extends TestBase {

//    CreateTaskPage createTaskPage;
//    TasksListPage tasksListPage;
//
//    @Given("Click Add New Task")
//    public void clickAddNewTask() throws MalformedURLException {
//        androidSetUp();
//        createTaskPage = new CreateTaskPage(driver);
//        tasksListPage = new TasksListPage(driver);
//        tasksListPage.clickAddTaskButton();
//    }
//
//    @Given("Enter TaskName")
//    public void enterTaskName() {
//        createTaskPage.enterTaskName("Task 1");
//    }
//
//    @Given("Enter TaskDescription")
//    public void enterTaskDescription() {
//        createTaskPage.enterTaskDescription("Description 1");
//    }
//
//    @When("Click Save")
//    public void clickSave() {
//        createTaskPage.clickSaveButton();
//    }
//
//    @Then("Task is added successfully")
//    public void taskIsAddedSuccessfully() {
//        driver.hideKeyboard();
//        tearDown();
//    }
}
