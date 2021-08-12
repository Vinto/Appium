package tests;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import Utils.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDoAndroid extends TestBase {
    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @DataProvider(name = "tasks data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONData(System.getProperty("user.dir") + "/data/TasksData.json", "Tasks Data", 2);
    }

    @Test(dataProvider = "tasks data")
    public void addTaskTest(String taskName, String taskDescription) throws MalformedURLException {
        androidSetUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskButton();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDescription(taskDescription);
        driver.hideKeyboard();
        createTaskPage.clickSaveButton();
        tearDown();
    }
}
