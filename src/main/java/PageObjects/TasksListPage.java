package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends PageBase {

    public TasksListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "fab")
    MobileElement addTaskButton;

    public void clickAddTaskButton() {
        click(addTaskButton);
    }
}
