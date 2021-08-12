package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTaskWithData extends TestBase {

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Given("Click Add New Task")
    public void clickAddNewTask() throws MalformedURLException {
        androidSetUp();
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage = new TasksListPage(driver);
        tasksListPage.clickAddTaskButton();
    }

    @Given("Enter {string} and {string}")
    public void enterAnd(String taskName, String taskDescription) {
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDescription(taskDescription);
    }

    @Then("Task is added successfully")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}
